package com.example.breakpoint.breakpoint;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.Class;

@RestController
public class JokesRESTController {
    @GetMapping("/joke")
    public String getJokes() {
        RestTemplate restTemplate = new RestTemplate();
        String dadJokesURL
                = "https://icanhazdadjoke.com/slack";
        ResponseEntity<String> response
                = restTemplate.getForEntity(dadJokesURL , String.class);
        return getBody(response);
    }
    private static String getBody(ResponseEntity<String> response){

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = null;
        try {
            root = mapper.readTree(response.getBody());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        JsonNode attachment = root.get("attachments");
        List<JsonNode> jokes = new ArrayList<>();
        jokes.add(attachment.get(0));
        System.out.println(attachment.get(0).getClass());
        Iterator<JsonNode> nodes = attachment.get(0).elements();
        String joke = nodes.next().toString();
        return joke;
    }

}
