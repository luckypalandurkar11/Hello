package com.demo.service;

import com.demo.entity.Video;
import com.demo.repository.VideoRepository;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

    private VideoRepository videoRepository;

    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public void saveRecord(Video video) {
        videoRepository.save(video);

    }

    public void deleteById(long id) {
        videoRepository.deleteById(id);
    }
}
