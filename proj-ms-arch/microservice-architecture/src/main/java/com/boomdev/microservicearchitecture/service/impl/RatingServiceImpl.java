package com.boomdev.microservicearchitecture.service.impl;

import com.boomdev.microservicearchitecture.model.Rating;
import com.boomdev.microservicearchitecture.service.RatingService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class RatingServiceImpl implements RatingService {
    @Override
    public List<Rating> findAllRatings() {
        List<Rating> ratings = new ArrayList<>();
        ratings.add(getRating(2L));
        ratings.add(getRating(4L));
        ratings.add(getRating(6L));
        return ratings;
    }

    @Override
    public List<Rating> findRatingsByBookId(long bookId) {
        List<Rating> ratings = new ArrayList<>();
        ratings.add(getRating(1L));
        ratings.add(getRating(3L));
        ratings.add(getRating(5L));
        return ratings;
    }

    @Override
    public Rating createRating(Rating rating) {
        return getRating(7L);
    }

    @Override
    public Rating updateRating(Rating rating) {
        return getRating(8L);
    }

    @Override
    public Rating updateRating(Map<String, String> updates, long ratingId) {
        return getRating(9L);
    }

    @Override
    public boolean deleteRating(long ratingId) {
        return true;
    }

    private Rating getRating(long bookId) {
        Rating rating = new Rating();
        rating.setId(getRandomNumberInRange(1, 1000));
        rating.setBookId(bookId);
        rating.setStars(getRandomNumberInRange(1, 10));
        return rating;
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max)
            throw new IllegalArgumentException("max must be greater than min");
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}