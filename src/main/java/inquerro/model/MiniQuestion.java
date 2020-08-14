package inquerro.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


public class MiniQuestion {

    private String content;
    private String option0;
    private String option1;
    private String option2;
    private String option3;
    private String answer;
    private List<String> tags2;
    private String explanation;
    
    
    
    
    
	public MiniQuestion() {
		super();
	}
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getOption0() {
		return option0;
	}
	public void setOption0(String option0) {
		this.option0 = option0;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public List<String> getTags2() {
		return tags2;
	}
	public void setTags2(List<String> tags2) {
		this.tags2 = tags2;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
    
    
}
