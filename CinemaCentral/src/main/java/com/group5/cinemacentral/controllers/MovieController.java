package com.group5.cinemacentral.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final List<Map<String, Object>> movies = new ArrayList<>(List.of(
            Map.of("id", 1, "title", "Interstellar", "price", 16),
            Map.of("id", 2, "title", "Ironman", "price", 17),
            Map.of("id", 3, "title", "Batman", "price", 15),
            Map.of("id", 4, "title", "Inception", "price", 11),
            Map.of("id", 5, "title", "The Wolf of Wall Street", "price", 500),
            Map.of("id", 6, "title", "Oceans 11", "price", 12)
    ));

    // Get all movies
    @GetMapping
    public List<Map<String, Object>> getMovies() {
        return movies;
    }

    // Get a single movie by ID
    @GetMapping("/{id}")
    public Map<String, Object> getMovieById(@PathVariable int id) {
        return movies.stream()
                .filter(movie -> movie.get("id").equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Movie not found"));
    }
}
