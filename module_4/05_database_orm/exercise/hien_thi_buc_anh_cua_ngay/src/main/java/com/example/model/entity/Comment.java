package com.example.model.entity;

import javax.persistence.*;

@Entity
@Table (name="Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String feedback;
    private String rating;
    private String author;
    private String date;
    private int likes;

    public Comment() {

    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String detail) {
        this.feedback = detail;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String likes) {
        this.author = likes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

//    public void setDate() {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate today = LocalDate.now();
//        this.date = today.format(formatter);
//    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}