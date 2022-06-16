package com.example.breakpoint.breakpoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class JokesRESTController {
    @Bean
    public void getJokes() {
        RestTemplate restTemplate = new RestTemplate();
        String dadJokesURL
                = "https://icanhazdadjoke.com/slack";
        ResponseEntity<String> response
                = restTemplate.getForEntity(dadJokesURL , String.class);
    }

}
