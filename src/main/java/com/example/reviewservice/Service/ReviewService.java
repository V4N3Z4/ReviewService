package com.example.reviewservice.Service;

import com.example.reviewservice.model.Review;
import com.example.reviewservice.repository.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    public Review createReview(Review review){
        return reviewRepository.save(review);
    }

    public Review getReview(Long id){
        return reviewRepository.findById(id).orElse(null);
    }
}
