package com.boomdev.microservicearchitecture.controller;


import com.boomdev.microservicearchitecture.model.Rating;
import com.boomdev.microservicearchitecture.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService service;

    @GetMapping
    public List<Rating> findRatingsByBookId(
            @RequestParam(required = false, defaultValue = "0") Long bookId) {
        if (bookId.equals(0L))
            return service.findAllRatings();
        return service.findRatingsByBookId(bookId);
    }

    @PostMapping
    public Rating createRating(@RequestBody Rating rating) { return service.createRating(rating); }

    @PutMapping
    public Rating updateRating(@RequestBody Rating rating) { return service.updateRating(rating); }

    @PatchMapping("/{ratingId}")
    public Rating updateRating(@RequestBody Map<String, String> updates, Long ratingId){ return service.updateRating(updates, ratingId);}

    @DeleteMapping("/{ratingId}")
    public boolean deleteRating(@PathVariable Long ratingId) { return service.deleteRating(ratingId);}

}
