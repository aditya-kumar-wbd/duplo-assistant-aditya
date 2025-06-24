package assistant.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "sql_history")
public class SqlHistory {
    @Id
    private String userQuery;
    private String successfulSql; // Unique ID for a conversation session


    // Getters and Setters
    public String getQuery() {
        return userQuery;
    }
    public void setQuery(String query) {this.userQuery = query;}
    public String getSuccessfulSql() {return successfulSql;}
    public void setSuccessfulSql(String successfulSql) {this.successfulSql = successfulSql;}
}