package com.project.instagram.DAO;

import com.project.instagram.model.Photo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PhotoDao extends CrudRepository<Photo,Integer> {
}
