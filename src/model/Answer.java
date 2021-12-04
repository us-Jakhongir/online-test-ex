package model;

public class Answer {

    private String id;
    private String text;
    private boolean status;

    public Answer(String id, String text, boolean status) {
        this.id = id;
        this.text = text;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", status=" + status +
                '}';
    }
}
