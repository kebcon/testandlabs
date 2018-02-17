package com.mikaila.treehousecourse;

import javax.persistence.Entity;

@Entity
public class Course extends BaseEntity {

    private String title;
    private String url;

    //Call BaseSuper constructor - cos of JPA rules
    public Course() {
       super();
    }

    public Course(String title, String url) {
        this();
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



}
