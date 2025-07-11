package com.amosjuda.workshopmongodb.repository;

import com.amosjuda.workshopmongodb.domain.Post;
import com.amosjuda.workshopmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
    List<Post> findByTitleContainingIgnoreCase(String text);
}
