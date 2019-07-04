package com.boomdev.microserviceapirating.service;

import com.boomdev.microserviceapirating.model.Rating;

import java.util.List;
import java.util.Map;

public interface RatingService {

    List<Rating> findAllRatings();

    List<Rating> findRatingsByBookId(long bookId);

    Rating createRating(Rating rating);

    Rating updateRating(Rating rating);

    Rating updateRating(Map<String, String> updates, long ratingId);

    boolean deleteRating(long ratingId);

}
