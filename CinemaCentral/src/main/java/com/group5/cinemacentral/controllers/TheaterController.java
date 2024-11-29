// TheaterController.java
package com.group5.cinemacentral.controller;

import com.cinemacentral.models.Theater;
import com.cinemacentral.repositories.TheaterRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/theaters")
public class TheaterController {

    private final TheaterRepository theaterRepository = new TheaterRepository();

    @GetMapping
    public List<Theater> getTheaters() {
        return theaterRepository.getAllTheaters();
    }

    @GetMapping("/{id}")
    public Theater getTheaterById(@PathVariable Long id) {
        return theaterRepository.getTheaterById(id);
    }
}
