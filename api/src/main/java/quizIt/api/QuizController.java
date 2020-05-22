package quizIt.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
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
	  return repo.findAll();		
	}
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public List<qSet> getTopic(@PathVariable("name") String name) {
		List<qSet> res = new ArrayList<qSet>();
		for(quizdata q:repo.findAll()) {
			if(q.T.equals(name))
			{
				qSet qs = new qSet(q.Q,q.C);
				res.add(qs);
			}
		}
	  return res;		
	}
	
	@RequestMapping(value = "/{name}/{level}", method = RequestMethod.GET)
	public List<qSet> getTopicLevel(@PathVariable("name") String name,@PathVariable("level") String level) {
		List<qSet> res = new ArrayList<qSet>();
		for(quizdata q:repo.findAll()) {
			if(q.T.equals(name) && q.L.equals(level))
			{
				qSet qs = new qSet(q.Q,q.C);
				res.add(qs);
			}
		}
	  return res;		
	}
}
