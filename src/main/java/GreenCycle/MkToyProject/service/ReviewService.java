package GreenCycle.MkToyProject.service;

import GreenCycle.MkToyProject.domain.entity.CenterInfo;
import GreenCycle.MkToyProject.domain.entity.ReviewInfo;
import GreenCycle.MkToyProject.repository.CenterInfoRepository;
import GreenCycle.MkToyProject.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;

    @Transactional
    public void saveReview(ReviewInfo reviewInfo) {
        reviewRepository.save(reviewInfo);
    }

}
