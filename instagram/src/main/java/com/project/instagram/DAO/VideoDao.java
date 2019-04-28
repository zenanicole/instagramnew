package com.project.instagram.DAO;


import com.project.instagram.model.Video;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VideoDao extends CrudRepository<Video,Integer>{
}
