package quizIt.api;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuizRepository extends MongoRepository<QData, String> {
	QData findBy_id(String _id);
}
