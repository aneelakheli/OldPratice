package com.example.blog.controller;


import com.example.blog.model.Blog;
import com.example.blog.services.BlogService;
import com.example.blog.services.MapValidationErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;

@RestController
@RequestMapping("/api/v1/blog")
@CrossOrigin(origins = "http://localhost:5000")
public class BlogController {
@Autowired
private BlogService blogService;



@Autowired
private MapValidationErrorService mapValidationErrorService;

    @PostMapping("")
    public ResponseEntity<?> createNewBlog(@Valid @RequestBody Blog blog, BindingResult result,Principal principal) {

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if (errorMap != null) return errorMap;

        Blog blog1 = blogService.saveOrUpdateProject(blog, principal.getName());
        return new ResponseEntity<Blog>(blog1, HttpStatus.CREATED);
    }

    @GetMapping("/{blogId}")
    public ResponseEntity<?> getBlogById(@PathVariable String blogId, Principal principal) {
        Blog blog = blogService.findBlogtByIdentifier(blogId, principal.getName());
        return new ResponseEntity<Blog>(blog, HttpStatus.OK);
    }

    @GetMapping("/all")
    public Iterable<Blog> getAllBlog(Principal principal) {
        return blogService.findAllBlog(principal.getName());
    }

    @DeleteMapping("/{blogId}")
    public ResponseEntity<?> deleteBlog(@PathVariable String blogId,Principal principal) {
        blogService.deleteBlogNameById(blogId,principal.getName());
        return new ResponseEntity<String>("Project with ID:'" + blogId + "'was deleted", HttpStatus.OK);
    }
}
