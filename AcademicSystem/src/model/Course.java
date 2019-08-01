package model;

/**
 * @author parju
 */
public class Course {
    private int courseId = 0;
    private String courseName = "";
    
    public Course(int courseId, String courseName){
        this.courseId = courseId;
        this.courseName = courseName;
    }
    
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
}
