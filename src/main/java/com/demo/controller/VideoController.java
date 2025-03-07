package com.demo.controller;

import com.demo.entity.Video;
import com.demo.repository.VideoRepository;
import com.demo.service.VideoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/map/h2/video")
public class VideoController {

    private VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @PostMapping
    public ResponseEntity<?> addRecord(
            @RequestBody Video video
    ){
         videoService.saveRecord(video);
         return new ResponseEntity<>(video, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteVideo(@PathVariable long id) {
        videoService.deleteById(id);
        return new ResponseEntity<>("Deleted", HttpStatus.OK);
    }
}
