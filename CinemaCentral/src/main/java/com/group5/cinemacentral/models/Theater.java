package com.group5.cinemacentral.models;
import java.util.List;

public class Theater {
    private Long id;
    private String name;
    private List<SeatMap> seatMaps;

    public Theater(Long id, String name, List<SeatMap> seatMaps) {
        this.id = id;
        this.name = name;
        this.seatMaps = seatMaps;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SeatMap> getSeatMaps() {
        return seatMaps;
    }

    public void setSeatMaps(List<SeatMap> seatMaps) {
        this.seatMaps = seatMaps;
    }
}