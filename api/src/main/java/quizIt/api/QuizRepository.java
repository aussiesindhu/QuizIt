package quizIt.api;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends MongoRepository<quizdata, String> {
	//quizdata findBy_id(String _id);
}
