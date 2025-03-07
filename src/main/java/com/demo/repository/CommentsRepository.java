package com.demo.repository;

import com.demo.entity.Comments;
import com.demo.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentsRepository extends JpaRepository<Comments, Long> {

    List<Comments> findByVideo(Video video);
}