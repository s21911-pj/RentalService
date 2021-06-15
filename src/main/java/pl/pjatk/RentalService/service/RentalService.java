package pl.pjatk.RentalService.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.RentalService.model.Movie;

@Service
public class RentalService {

    private final RestTemplate restTemplate;


    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie findMovieById(Long id) {
        Movie movie = restTemplate.getForEntity("http://localhost:8080/moviecontroller/movies/" + id, Movie.class).getBody();
        return movie;
    }
}
