package model;

import model.Course;
import model.Student;

/**
 * @author parju
 */
public class Group {
    private int groupPeriod = 0;
    private int groupId = 0;
    private int courseId = 0;
    private int studentId = 0;
    
    public Group(int groupPeriod, int groupId, int courseId, int studentId){
        this.groupPeriod = groupPeriod;
        this.groupId = groupId;
        this.courseId = courseId;
        this.studentId = studentId;
    }

    public int getgroupPeriod() {
        return groupPeriod;
    }

    public void setGroupPeriod(int groupPeriod) {
        this.groupPeriod = groupPeriod;
    }
    
    public int getgroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getCourseId() {
        return courseId;
    }
    
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
