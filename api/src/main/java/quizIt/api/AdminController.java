package quizIt.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
@Component
public class AdminController {
	@Autowired
	private QuizRepository repo;
	String topic;
	HashSet<String> topics= new HashSet<String>();
	
	AdminController(QuizRepository repo){
		this.repo=repo;
	}
	
	//get all questions
	@RequestMapping(value = "/admn", method = RequestMethod.GET)
	public List<Quizdata> getAll() {
	  return repo.findAll();		
	}
	
	//Post a new question
	@RequestMapping(value = "/admn", method = RequestMethod.POST)
	public Quizdata postData(@RequestBody Quizdata data) {
		repo.save(data);
		return data;			
	}

	//Post a new topic
	@RequestMapping(value = "/admn/topics", method = RequestMethod.POST)
	public void postTopic(@RequestBody String topic) {
		this.topic = topic;
		topics.add(topic);
	}
	
	//get questions for a specific topic
	@RequestMapping(value = "/admn/{topic}", method = RequestMethod.GET)
	public List<QSet> getTopic(@PathVariable("topic") String topic) {
		List<QSet> res = new ArrayList<QSet>();
		for(Quizdata q:repo.findAll()) {
			if(q.getT()!=null && q.getT().equals(topic))
			{
				QSet qs = new QSet(q.Q,q.C,q.A);
				res.add(qs);
			}
		}
	  return res;		
	}
	
	//get questions for a specific topic and speicfic level
	@RequestMapping(value = "/admn/{topic}/{level}", method = RequestMethod.GET)
	public List<QSet> getTopicLevel(@PathVariable("topic") String topic,@PathVariable("level") String level) {
		List<QSet> res = new ArrayList<QSet>();
		for(Quizdata q:repo.findAll()) {
			if(q.getT() !=null && q.getL()!=null && q.getT().equals(topic) && q.getL().equals(level))
			{
				QSet qs = new QSet(q.Q,q.C,q.A);
				res.add(qs);
			}
		}
	  return res;		
	}
		
	//Update specific Question by ID
	@RequestMapping(value = "/admn/{id}", method = RequestMethod.PUT)
	  public void updateTopic(@PathVariable("id") ObjectId id, @RequestBody Quizdata q) {
	    q.setId(id);
	    repo.save(q);
	  }
	
	//Delete all questions By specific Topic
	@RequestMapping(value = "/admn/{topic}", method = RequestMethod.DELETE)
	  public void deletebyTopic(@PathVariable String topic) {
		for(Quizdata q:repo.findAll()) {
			if(q.T!=null && q.T.equals(topic)) {
			    repo.delete(q);

			}
		}
	  }
		
}
