package com.sangkon.controller;

import com.sangkon.model.user.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody User user){
        URI createUri = linkTo(methodOn(AuthController.class).signup(user)).toUri();  // 메소드를 기준으로 링크를 거는 것.
        return ResponseEntity.created(createUri).body(user);
    }
//    @PostMapping("/signin")

//    @PostMapping("/password/change")
}
