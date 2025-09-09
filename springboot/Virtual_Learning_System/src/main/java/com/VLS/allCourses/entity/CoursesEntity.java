package com.VLS.allCourses.entity;


import javax.persistence.*;

@Entity
@Table(name="Courses")
public class CoursesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long CousreId;
    @Column(name="CourseName",nullable = false)
    private String CourseName;
    @Column(name="AuthorName",nullable = false)
    private String AuthorName;
    @Column(name="Duration",nullable = true)
    private int Duration;
    @Column(name="Availability",nullable = false)
    private boolean Availabilty;

    public CoursesEntity() {
    }

    public CoursesEntity( String courseName, String authorName, int duration, boolean availabilty) {

        CourseName = courseName;
        AuthorName = authorName;
        Duration = duration;
        Availabilty = availabilty;
    }

    public long getCousreId() {
        return CousreId;
    }

    public void setCousreId(long cousreId) {
        CousreId = cousreId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public boolean isAvailabilty() {
        return Availabilty;
    }

    public void setAvailabilty(boolean availabilty) {
        Availabilty = availabilty;
    }


}
