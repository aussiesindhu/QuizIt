package quizIt.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import quizIt.api.QuizRepository;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	@Autowired
	private QuizRepository repo;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<QData> getAll() {
	  return repo.findAll();
	}
}
