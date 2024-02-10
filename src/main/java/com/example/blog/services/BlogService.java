package com.example.blog.services;

import com.example.blog.exceptions.BlogIDException;
import com.example.blog.exceptions.BlogNotFoundException;
import com.example.blog.model.Blog;
import com.example.blog.model.User;
import com.example.blog.repositories.BlogRepository;
import com.example.blog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private UserRepository userRepository;

    public Blog saveOrUpdateProject(Blog blog, String username) {

        if (blog.getId() != null) {
            Blog existingBlog = blogRepository.findByBlogIdentifier(blog.getBlogName());
            if (existingBlog != null) {
                throw new BlogNotFoundException("Blog not Found");
            } else if (existingBlog == null) {
                throw new BlogNotFoundException("Blog with name: '" + blog.getBlogName()+ "' cannot be updated because it doesn't exist");
            }
        }

        try {

            User user = userRepository.findByUsername(username);
            blog.setUser(user);
//            blog.setUserName(user.getUsername());
            //set  blog entity
            return blogRepository.save(blog);
        } catch (Exception e) {
            throw new BlogIDException("blog Id '" + blog.getId() + "'already exists.");
        }
    }

    public Blog findBlogtByIdentifier(String projectId, String username) {
        // called blog id.
//        Blog blog = blogRepository.findByBlogIdentifier(blogId);

        return blog;
    }

    public Iterable findAllBlog(String username) {
//        return blogRepository.findAllByBlogName(blogname);
//        use iterable hai.
//       String name = "called find all function from repository";
//        return  name;
        return username;
    }

    public void deleteBlogNameById(String blogId, String username) {

        blogRepository.delete(findBlogtByIdentifier(blogId, username));

    }

}
