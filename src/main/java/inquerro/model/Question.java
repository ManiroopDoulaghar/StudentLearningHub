package inquerro.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;


public class Question {

    private Long id;
    private String content;
    private String explanation;
    private List<String> options;
    private String answer;
    private String author;
    private List<String> tags;
    private Timestamp createdAt;
    private Timestamp modifiedAt;
    private boolean isDeleted;
    private String strAnswer;
    private List<String> likes;
	private List<String> answeredUsers;
    
    
    
    
	public Question() {
		super();
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(Timestamp modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getStrAnswer() {
		return strAnswer;
	}
	public void setStrAnswer(String strAnswer) {
		this.strAnswer = strAnswer;
	}
	public List<String> getLikes() {
		return likes;
	}
	public void setLikes(List<String> likes) {
		this.likes = likes;
	}

	public List<String> getAnsweredUsers() {
		return answeredUsers;
	}

	public void setAnsweredUsers(List<String> answeredUsers) {
		this.answeredUsers = answeredUsers;
	}

	@Override
	public String toString() {
		return "Question{" +
				"id=" + id +
				", content='" + content + '\'' +
				", explanation='" + explanation + '\'' +
				", options=" + options +
				", answer='" + answer + '\'' +
				", author='" + author + '\'' +
				", tags=" + tags +
				", createdAt=" + createdAt +
				", modifiedAt=" + modifiedAt +
				", isDeleted=" + isDeleted +
				", strAnswer='" + strAnswer + '\'' +
				", likes=" + likes +
				", answeredUsers=" + answeredUsers +
				'}';
	}
}
