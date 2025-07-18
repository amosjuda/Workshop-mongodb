package com.amosjuda.workshopmongodb.services;

import com.amosjuda.workshopmongodb.domain.Post;
import com.amosjuda.workshopmongodb.domain.User;
import com.amosjuda.workshopmongodb.dto.UserDTO;
import com.amosjuda.workshopmongodb.repository.PostRepository;
import com.amosjuda.workshopmongodb.repository.UserRepository;
import com.amosjuda.workshopmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        Optional<Post> user = postRepository.findById(id);
        if (user.isEmpty()) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return user.get();
    }

    public List<Post> findByTitle(String text) {
        return postRepository.searchTitle(text);
    }

    public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
         maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
         return postRepository.fullSearch(text, minDate, maxDate);
    }
}
