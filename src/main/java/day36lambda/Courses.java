package day36lambda;
//--------------------- Lambda ----------------------------
        /*
                If a Class has:
                1. private variables
                2. Constructor with all parameters
                3. Constructor without any parameter = Default Constructor
                4. All getters and setters
                5. toString() method
                then it is called "POJO Class"
                POJO stands for Plain Old Java Object
         */
public class Courses {

    private String courseName;
    private int numOfStudents;
    private String season;
    private double avgScore;

    //Constructor with parameters
    public Courses(String courseName, int numOfStudents, String season, double avgScore) {
        this.courseName = courseName;
        this.numOfStudents = numOfStudents;
        this.season = season;
        this.avgScore = avgScore;
    }

    //default Constructor
    public Courses() {
    }

    //Get all Getters and Setters from Generate
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    //Generate toString() to print on console
    @Override
    public String toString() {
        return  "CourseName='" + courseName + '\'' +
                ", NumOfStudents=" + numOfStudents +
                ", Season='" + season + '\'' +
                ", AvgScore=" + avgScore;
    }
}
