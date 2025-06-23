package assistant.mcp;


import java.util.Map;

import assistant.service.QueryExecutionService;
import org.springframework.stereotype.Component;

@Component
public class DocumentIntentAction implements McpAction{
    private final QueryExecutionService queryService;

    public DocumentIntentAction(QueryExecutionService queryService) {
        this.queryService = queryService;
    }

    @Override
    public String getName() {return "document_intent";}

    @Override
    public Object execute(Map<String, Object> params) {
        String query = (String) params.get("user_query");
        return queryService.checkIntent(query);
    }
}