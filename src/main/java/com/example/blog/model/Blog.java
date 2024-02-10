package com.example.blog.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

public class Blog {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @NotBlank(message = "Blog Name is required")
        private String blogName;
        @NotBlank(message = "Blog Description cannot be blank ")
        private String description;

        @JsonFormat(pattern = "yyyy-mm-dd")
        @Column(updatable = false)
        private Date created_At;
        @JsonFormat(pattern = "yyyy-mm-dd")
        private Date updated_At;

        @ManyToOne(fetch = FetchType.LAZY)
        @JsonIgnore
        private User user;


        public Blog() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getBlogName() {
            return blogName;
        }

        public void setBlogName(String projectName) {
            this.blogName = blogName;
        }


        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Date getCreated_At() {
            return created_At;
        }

        public void setCreated_At(Date created_At) {
            this.created_At = created_At;
        }

        public Date getUpdated_At() {
            return updated_At;
        }

        public void setUpdated_At(Date updated_At) {
            this.updated_At = updated_At;
        }


        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }


        @PrePersist
        protected void onCreate() {
            this.created_At = new Date();
        }

        @PreUpdate
        protected void onUpdate() {
            this.updated_At = new Date();
        }


}

