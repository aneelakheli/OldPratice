package com.example.blog.repositories;

import com.example.blog.model.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends CrudRepository<Blog, Long> {
Blog findByBlogIdentifier(String blogId);

@Override
Iterable<Blog> findAll();

Iterable<Blog> findAllByBlogName(String blogName);
}
