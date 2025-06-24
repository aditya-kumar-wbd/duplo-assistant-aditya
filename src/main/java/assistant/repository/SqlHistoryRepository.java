package assistant.repository;

import assistant.model.SqlHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SqlHistoryRepository extends MongoRepository<SqlHistory, String> {

}