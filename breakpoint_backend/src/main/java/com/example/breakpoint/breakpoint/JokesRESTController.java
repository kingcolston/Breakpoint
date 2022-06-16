package com.example.breakpoint.breakpoint;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JokesRESTController {
    @Bean
    public void getJokes() {
        RestTemplate restTemplate = new RestTemplate();
        String dadJokesURL
                = "https://icanhazdadjoke.com/slack";
        ResponseEntity<String> response
                = restTemplate.getForEntity(dadJokesURL , String.class);
        getBody(response);
    }
    private static void getBody(ResponseEntity<String> response){

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = null;
        try {
            root = mapper.readTree(response.getBody());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        JsonNode attachment = root.path("attachments");
        List<JsonNode> jokes = new ArrayList<>();
        jokes.add(attachment.get(0));
        String fallout = jokes.get(0).toString();
        System.out.println(fallout);
    }

}
