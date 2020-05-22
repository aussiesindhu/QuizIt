package quizIt.api;

import org.springframework.data.annotation.Id;

public class QData {
	@Id
	String _id;
	String ques;
	String ans;
	String[] choices;
	String level;
	String topic;
	public String getId() {
		return _id;
	}
	public void setId(String id) {
		this._id = id;
	}
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public String[] getChoices() {
		return choices;
	}
	public void setChoices(String[] choices) {
		this.choices = choices;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public QData(String id, String ques, String ans, String[] choices, String level, String topic) {
		super();
		this._id = id;
		this.ques = ques;
		this.ans = ans;
		this.choices = choices;
		this.level = level;
		this.topic = topic;
	}
	
}
