package com.project.instagram.service;

import com.project.instagram.model.User;

public interface UserInterface {
    public void save(User user);
    public void delete(User user);
    public User find(User id);
    public Iterable<User> findAll();



}
