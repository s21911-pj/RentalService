package pl.pjatk.RentalService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.RentalService.model.Movie;
import pl.pjatk.RentalService.service.RentalService;
@RestController
@RequestMapping("/rental")
public class RentalController {

    private final RentalService rentalService;

    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieString(@PathVariable Long id){
        return ResponseEntity.ok(rentalService.findMovieById(id));
    }
}
