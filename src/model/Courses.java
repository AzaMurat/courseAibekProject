package model;

public class Courses extends Company{
    String lesson;
    String timelesson;

    public Courses(String nameCompany, String adressCompany, String lesson, String timelesson) {
        super(nameCompany, adressCompany);
        this.lesson = lesson;
        this.timelesson = timelesson;
    }

    public Courses() {

    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getTimelesson() {
        return timelesson;
    }

    public void setTimelesson(String timelesson) {
        this.timelesson = timelesson;
    }

    @Override
    public String toString() {
        return super.toString()+
                "lesson : " + lesson + "\n" +
                "timelesson : " + timelesson + "\n";
    }
}
