package model;

import java.util.List;

public class Subject {

    private Long id;
    private String name;
    private List<Question> questionList;


    public Subject(Long id, String name, List<Question> questionList) {
        this.id = id;
        this.name = name;
        this.questionList = questionList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }


    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", questionList=" + questionList +
                '}';
    }
}
