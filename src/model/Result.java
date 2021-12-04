package model;

public class Result {


    private User user;
    private Subject subject;
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Result(User user, Subject subject, int score) {
        this.user = user;
        this.subject = subject;
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Result{" +
                "user=" + user +
                ", subject=" + subject +
                ", score=" + score +
                '}';
    }
}
