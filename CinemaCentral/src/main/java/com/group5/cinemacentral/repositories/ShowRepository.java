// ShowRepository.java
package com.cinemacentral.repositories;

import com.cinemacentral.models.Show;
import com.cinemacentral.models.Movie;
import com.cinemacentral.models.Theater;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ShowRepository {
    private List<Show> shows = new ArrayList<>();

    public ShowRepository(MovieRepository movieRepository, TheaterRepository theaterRepository) {
        Movie interstellar = movieRepository.getMovieById(1L);
        Movie ironMan = movieRepository.getMovieById(2L);
        Movie batman = movieRepository.getMovieById(3L);
        Movie inception = movieRepository.getMovieById(4L);

        Theater universityTheater = theaterRepository.getTheaterById(1L);
        Theater marketMallTheater = theaterRepository.getTheaterById(2L);

        shows.add(new Show(1L, interstellar, universityTheater, LocalDateTime.of(2023, 10, 1, 19, 0)));
        shows.add(new Show(2L, ironMan, universityTheater, LocalDateTime.of(2023, 10, 1, 21, 0)));
        shows.add(new Show(3L, batman, marketMallTheater, LocalDateTime.of(2023, 10, 2, 18, 30)));
        shows.add(new Show(4L, inception, marketMallTheater, LocalDateTime.of(2023, 10, 2, 20, 45)));
        // Add more shows as needed
    }

    public List<Show> getAllShows() {
        return shows;
    }

    public List<Show> getShowsByMovieId(Long movieId) {
        List<Show> result = new ArrayList<>();
        for (Show show : shows) {
            if (show.getMovie().getId().equals(movieId)) {
                result.add(show);
            }
        }
        return result;
    }

    public List<Show> getShowsByTheaterId(Long theaterId) {
        List<Show> result = new ArrayList<>();
        for (Show show : shows) {
            if (show.getTheater().getId().equals(theaterId)) {
                result.add(show);
            }
        }
        return result;
    }

    public Show getShowById(Long id) {
        return shows.stream().filter(show -> show.getId().equals(id)).findFirst().orElse(null);
    }
}
