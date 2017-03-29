package com.springboot.basics.topic;

/**
 * Created by renuka on 29/3/17.
 */
public class Topic {

    private String id;

    private String courseName;

    private String description;

    public Topic(String id, String courseName, String description) {
        this.id = id;
        this.courseName = courseName;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDescription() {
        return description;
    }
}
