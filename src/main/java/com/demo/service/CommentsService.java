package com.demo.service;

import com.demo.entity.Comments;
import com.demo.entity.Video;
import com.demo.repository.CommentsRepository;
import com.demo.repository.VideoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentsService {

    private CommentsRepository commentsRepository;
    private VideoRepository videoRepository;

    public CommentsService(CommentsRepository commentsRepository,
                           VideoRepository videoRepository) {
        this.commentsRepository = commentsRepository;
        this.videoRepository = videoRepository;
    }


    public Comments commentById(long videoId, Comments comment) {

       Video video = videoRepository.findById(videoId)
               .orElseThrow(
                       ()-> new RuntimeException("Id not found")
               );
       comment.setVideo(video);
       return commentsRepository.save(comment);
    }

    public List<Comments> findAllRecord(long videId){
        Video video = videoRepository.findById(videId)
                .orElseThrow(
                        ()-> new RuntimeException("Id not found")
                );
        return commentsRepository.findByVideo(video);
    }
}
