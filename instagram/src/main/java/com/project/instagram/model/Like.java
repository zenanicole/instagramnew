package com.project.instagram.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "Like")
public class Like {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int likeId;
    private User user;
    private Photo Photo;
    private Video video;
    private LocalDate LikeDate;


    public int getLikeId() {
        return likeId;
    }

    public void setLikeId(int likeId) {
        this.likeId = likeId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public com.project.instagram.model.Photo getPhoto() {
        return Photo;
    }

    public void setPhoto(com.project.instagram.model.Photo photo) {
        Photo = photo;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public LocalDate getLikeDate() {
        return LikeDate;
    }

    public void setLikeDate(LocalDate likeDate) {
        LikeDate = likeDate;
    }
}
