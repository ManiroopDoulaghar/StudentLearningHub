package inquerro.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;


public class QuestionsStats {


    private Long id;
    private String title;
    private int count;
    private Map<String, Integer> subTopics;
    
    
    
	public QuestionsStats() {
		super();
	}

	public QuestionsStats(Long id, String title, int count, Map<String, Integer> subTopics) {
		super();
		this.id = id;
		this.title = title;
		this.count = count;
		this.subTopics = subTopics;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Map<String, Integer> getSubTopics() {
		return subTopics;
	}
	public void setSubTopics(Map<String, Integer> subTopics) {
		this.subTopics = subTopics;
	}

	@Override
	public String toString() {
		return "QuestionsStats [id=" + id + ", title=" + title + ", count=" + count + ", subTopics=" + subTopics + "]";
	}
	
	
    
    
    
}
