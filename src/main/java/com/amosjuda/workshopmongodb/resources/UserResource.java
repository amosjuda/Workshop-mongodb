package com.amosjuda.workshopmongodb.resources;

import com.amosjuda.workshopmongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping(value="/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User john = new User("1", "john milton", "john@email.com");
        User alex = new User("2", "alex joe", "alex@email.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(john, alex));
        return ResponseEntity.ok().body(list);
    }

}