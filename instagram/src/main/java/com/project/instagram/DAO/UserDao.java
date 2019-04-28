package com.project.instagram.DAO;

import com.project.instagram.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserDao extends CrudRepository<User,Integer>{
}
