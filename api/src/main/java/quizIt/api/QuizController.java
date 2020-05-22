package quizIt.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import quizIt.api.QuizRepository;

@RestController
@RequestMapping("/quiz")
@Component

public class QuizController {
	@Autowired
	private QuizRepository repo;
	
	
	QuizController(QuizRepository repo){
		this.repo=repo;
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<quizdata> getAll() {
//		System.out.println(repo);
//		for (quizdata customer : repo.findAll()) {
//	    	System.out.println(customer.toString());
//	    }
	  return repo.findAll();		
	}
}
