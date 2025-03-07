package com.demo.controller;

import com.demo.entity.Comments;
import com.demo.service.CommentsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/map/h2/comment")
public class CommentsController {

    private CommentsService commentsService;

    public CommentsController(CommentsService commentsService) {
        this.commentsService = commentsService;
    }

    @PostMapping("{videoId}")
    public ResponseEntity<?> addComment(
            @PathVariable long videoId,
            @RequestBody Comments comment
    ){

        Comments savedComment = commentsService.commentById(videoId, comment);
        return new ResponseEntity<>(savedComment, HttpStatus.CREATED);
    }

    @GetMapping("{videoId}")
    public ResponseEntity<List<Comments>> getAllRecord(
            @PathVariable long videoId
    ){
        List<Comments> com = commentsService.findAllRecord(videoId);
        return new ResponseEntity<>(com, HttpStatus.OK);
    }

}
