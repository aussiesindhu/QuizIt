package quizIt.api;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends MongoRepository<quizdata, String> {
	//quizdata findBy_id(String _id);
	//List<qSet> findByTopic(String topic);
}
