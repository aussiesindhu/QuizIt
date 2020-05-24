package quizIt.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

	public int qLen;
	public Random r = new Random();

	QuizController(QuizRepository repo) {
		this.repo = repo;
	}

	//Get 1 random question for the chosen topic and level
	@RequestMapping(value = "/{topic}/{level}", method = RequestMethod.GET)
	public QSet getTopicLevel(@PathVariable("topic") String topic, @PathVariable("level") String level) {
		List<Quizdata> res = new ArrayList<Quizdata>();
		for (Quizdata q : repo.findAll())
			if (q.T.equals(topic) && q.L.equals(level))
				res.add(q);
		qLen = res.size();
		Quizdata randq = res.get(r.nextInt(qLen));
		QSet qs = new QSet(randq.Q, randq.C, randq.A);
		return qs;
	}

}
