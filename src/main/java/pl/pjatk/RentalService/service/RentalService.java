package pl.pjatk.RentalService.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.RentalService.exception.GatewayTimeoutException;
import pl.pjatk.RentalService.exception.RestTemplateErrorHandler;
import pl.pjatk.RentalService.model.Movie;

@Service
public class RentalService {

    private final RestTemplate restTemplate;


    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Movie findMovieById(Long id) {
        try {
            restTemplate.setErrorHandler(new RestTemplateErrorHandler());
            return this.restTemplate.getForObject("http://localhost:8080/moviecontroller/movies/" + id, Movie.class);
        } catch (ResourceAccessException ex) {
            throw new GatewayTimeoutException();
        }
    }

    public void returnMovie(Long id) {
        try {
            restTemplate.setErrorHandler(new RestTemplateErrorHandler());
            restTemplate.put("http://localhost:8080/moviecontroller/changeAvailable/" + id, Movie.class);

        } catch (ResourceAccessException ex) {
            throw new GatewayTimeoutException();
        }
    }
}
