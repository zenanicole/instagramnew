package com.project.instagram.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Photo")
public class Photo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int photoId;
    private String url;
    private String caption;
    private LocalDate Uploaddate;
    private List<Comment> comment;
    private List<Like> like;
    private User user;

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public LocalDate getUploaddate() {
        return Uploaddate;
    }

    public void setUploaddate(LocalDate uploaddate) {
        Uploaddate = uploaddate;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    public List<Like> getLike() {
        return like;
    }

    public void setLike(List<Like> like) {
        this.like = like;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
