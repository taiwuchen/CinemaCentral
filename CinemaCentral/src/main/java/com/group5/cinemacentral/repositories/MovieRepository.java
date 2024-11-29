package com.cinemacentral.repositories;

import com.cinemacentral.models.Movie;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    private List<Movie> movies = new ArrayList<>();

    // Preload some movies
    public MovieRepository() {
        movies.add(new Movie(1L, "Interstellar", "Sci-fi about space exploration", 16.0, "inter.jpg"));
        movies.add(new Movie(2L, "Iron Man", "Superhero movie about Tony Stark", 17.0, "ironman.jpg"));
        movies.add(new Movie(3L, "Batman", "Dark Knight fighting Gotham's villains", 15.0, "batman.jpg"));
        movies.add(new Movie(4L, "Inception", "Dreams within dreams", 11.0, "inception.jpg"));
        movies.add(new Movie(5L, "Wolf of Wall Street", "Stock market drama", 14.0, "wolfofwallstreet.jpg"));
        movies.add(new Movie(6L, "Oceans 11", "Heist movie with a team of experts", 12.0, "oceans.jpg"));
    }

    public List<Movie> getAllMovies() {
        return movies;
    }

    public Movie getMovieById(Long id) {
        return movies.stream().filter(movie -> movie.getId().equals(id)).findFirst().orElse(null);
    }
}