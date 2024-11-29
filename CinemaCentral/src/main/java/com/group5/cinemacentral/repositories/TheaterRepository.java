// TheaterRepository.java
package com.cinemacentral.repositories;

import com.cinemacentral.models.Theater;
import java.util.ArrayList;
import java.util.List;

public class TheaterRepository {
    private List<Theater> theaters = new ArrayList<>();

    public TheaterRepository() {
        theaters.add(new Theater(1L, "University District", "123 University Ave"));
        theaters.add(new Theater(2L, "Market Mall", "456 Market Mall Dr"));
        theaters.add(new Theater(3L, "Chinook", "789 Chinook Blvd"));
        theaters.add(new Theater(4L, "17th Ave", "101 17th Ave SW"));
    }

    public List<Theater> getAllTheaters() {
        return theaters;
    }

    public Theater getTheaterById(Long id) {
        return theaters.stream().filter(theater -> theater.getId().equals(id)).findFirst().orElse(null);
    }
}
