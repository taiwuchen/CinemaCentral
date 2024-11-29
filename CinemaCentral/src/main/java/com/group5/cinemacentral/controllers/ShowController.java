// ShowController.java
package com.group5.cinemacentral.controller;

import com.cinemacentral.models.Show;
import com.cinemacentral.models.Seat;
import com.cinemacentral.repositories.MovieRepository;
import com.cinemacentral.repositories.ShowRepository;
import com.cinemacentral.repositories.TheaterRepository;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/shows")
public class ShowController {

    private final ShowRepository showRepository;

    public ShowController() {
        // Initialize repositories
        MovieRepository movieRepository = new MovieRepository();
        TheaterRepository theaterRepository = new TheaterRepository();
        showRepository = new ShowRepository(movieRepository, theaterRepository);
    }

    @GetMapping
    public List<Show> getShows(
            @RequestParam(required = false) Long theaterId,
            @RequestParam(required = false) Long movieId) {
        List<Show> allShows = showRepository.getAllShows();
        return allShows.stream()
                .filter(show -> (theaterId == null || show.getTheater().getId().equals(theaterId)) &&
                                (movieId == null || show.getMovie().getId().equals(movieId)))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Show getShowById(@PathVariable Long id) {
        return showRepository.getShowById(id);
    }

    // Get seat availability for a show
    @GetMapping("/{showId}/seats")
    public List<Seat> getSeatsForShow(@PathVariable Long showId) {
        Show show = showRepository.getShowById(showId);
        if (show == null) {
            throw new RuntimeException("Show not found");
        }
        // For simplicity, we'll assume some seats are occupied
        List<Seat> seats = new ArrayList<>();
        for (int i = 0; i < 48; i++) {
            boolean occupied = (i % 5 == 0); // Every 5th seat is occupied
            seats.add(new Seat(i, occupied));
        }
        return seats;
    }
}
