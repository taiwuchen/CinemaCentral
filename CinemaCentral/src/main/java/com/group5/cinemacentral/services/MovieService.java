package com.cinemacentral.services;

import com.cinemacentral.models.Movie;
import com.cinemacentral.repositories.MovieRepository;
import java.util.List;

public class MovieService {
    private final MovieRepository movieRepository = new MovieRepository();

    public List<Movie> getMovies() {
        return movieRepository.getAllMovies();
    }

    public Movie getMovieDetails(Long id) {
        return movieRepository.getMovieById(id);
    }
}