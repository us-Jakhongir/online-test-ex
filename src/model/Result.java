package model;

public class Result {


    private User user;
    private Subject subject;

    public Result(User user, Subject subject) {
        this.user = user;
        this.subject = subject;
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
                '}';
    }
}
