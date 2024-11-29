package com.cinemacentral.controllers;

import com.cinemacentral.models.Movie;
import com.cinemacentral.services.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private final MovieService movieService = new MovieService();

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getMovies();
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id) {
        return movieService.getMovieDetails(id);
    }
}