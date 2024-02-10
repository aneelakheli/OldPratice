package com.example.blog.services;

import com.example.blog.model.User;
import com.example.blog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User user = userRepository.findByUsername(username);
        if(user == null) new UsernameNotFoundException("User not Found");
         return  user;
    }

@Transactional
    public User loadUserByName(Long id){
        User user =userRepository.getById(id);
    if(user ==null) new UsernameNotFoundException("user is not Found");
       return  user;
    }
}
