package com.group5.cinemacentral.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping("/")
    public String redirectToMovies() {
        return "movies"; // Redirects to movies.html
    }
}