package com.amosjuda.workshopmongodb.resources;

import com.amosjuda.workshopmongodb.domain.Post;
import com.amosjuda.workshopmongodb.domain.User;
import com.amosjuda.workshopmongodb.dto.UserDTO;
import com.amosjuda.workshopmongodb.services.PostService;
import com.amosjuda.workshopmongodb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping(value="/posts")
public class PostResource {

    @Autowired
    private PostService postService;

    @GetMapping("/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = postService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}