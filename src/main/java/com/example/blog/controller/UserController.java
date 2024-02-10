package com.example.blog.controller;

import com.example.blog.model.User;
import com.example.blog.payload.JWTLoginSuccessResponse;
import com.example.blog.payload.LoginRequest;
import com.example.blog.security.JWTTokenProvider;
import com.example.blog.services.MapValidationErrorService;
import com.example.blog.services.UserService;
import com.example.blog.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

import static com.example.blog.security.SecurityConstants.TOKEN_PREFIX;

public class UserController {

    @Autowired
    public MapValidationErrorService mapValidationErrorService;

    @Autowired
private UserService userService;
@Autowired
    private UserValidator userValidator;

@Autowired
    private JWTTokenProvider tokenProvider;
@Autowired
    private AuthenticationManager authenticationManager;

@PostMapping("/login")
    public ResponseEntity<?> authenicateUser(@Valid @RequestBody LoginRequest loginRequest, BindingResult result) {
    ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
    if (errorMap != null) return errorMap;

    Authentication authentication = authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(
                    loginRequest.getUsername(), loginRequest.getPassword()
            )
    );
    SecurityContextHolder.getContext().setAuthentication(authentication);
    String jwt = TOKEN_PREFIX + tokenProvider.generateToken(authentication);
    return ResponseEntity.ok(new JWTLoginSuccessResponse(true, jwt));
}

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody User user, BindingResult result) {
        //validate password match
        userValidator.validate(user, result);

        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if (errorMap != null)
            return errorMap;

        User newUser = userService.saveUser(user);
        return new ResponseEntity<User>(newUser, HttpStatus.CREATED);
    }

}





