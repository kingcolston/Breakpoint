package breakpoint.main;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
public class fetchJoke {
    public static String getJoke(){
        RestTemplate restTemplate = new RestTemplate();
        String dadJokesURL
                = "http://localhost:8080/joke";
        ResponseEntity<String> response
                = restTemplate.getForEntity(dadJokesURL , String.class);
        return response.getBody().toString();
    }
    
}
