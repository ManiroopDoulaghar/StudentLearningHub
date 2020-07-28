package inquerro.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;


@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Catogories {

    private Long id;
    private String title;
    private Map<String, List<String>> topics;

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

    public Map<String, List<String>> getTopics() {
        return topics;
    }

    public void setTopics(Map<String, List<String>> topics) {
        this.topics = topics;
    }
}
