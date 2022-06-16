public class fetchJoke {
    public static String getJoke(){
        RestTemplate restTemplate = new RestTemplate();
        String dadJokesURL
                = "https://icanhazdadjoke.com/slack";
        ResponseEntity<String> response
                = restTemplate.getForEntity(dadJokesURL , String.class);
    }
    
}
