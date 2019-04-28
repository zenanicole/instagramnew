package com.project.instagram.DAO;

import com.project.instagram.model.Like;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LikeDao extends CrudRepository<Like,Integer>{


}