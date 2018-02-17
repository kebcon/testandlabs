package com.mikaila.treehousecourse;
import javax.persistence.Entity;

@Entity
public class Review extends BaseEntity {

    private int rating;
    private String description;

    public Review() {
        super();
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
