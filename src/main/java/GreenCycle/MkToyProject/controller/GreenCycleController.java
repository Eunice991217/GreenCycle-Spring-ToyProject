package GreenCycle.MkToyProject.controller;

import GreenCycle.MkToyProject.domain.dto.ReviewInfoDto;
import GreenCycle.MkToyProject.domain.entity.CenterInfo;
import GreenCycle.MkToyProject.domain.entity.CenterLocationInfo;
import GreenCycle.MkToyProject.domain.entity.ReviewInfo;
import GreenCycle.MkToyProject.domain.entity.UserInfo;
import GreenCycle.MkToyProject.service.CenterInfoService;
import GreenCycle.MkToyProject.service.CenterLocationInfoService;
import GreenCycle.MkToyProject.service.ReviewService;
import GreenCycle.MkToyProject.service.UserService;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class GreenCycleController {

    private final CenterLocationInfoService centerLocationInfoService;
    private final CenterInfoService centerInfoService;
    private final UserService userService;
    private final ReviewService reviewService;

    @GetMapping("/api/map")
    public List<CenterLocationInfo> searchAllMap() {
        return centerLocationInfoService.searchAll();
    }

    @GetMapping("/api/mapDetail/{id}")
    public List<CenterInfo> searchAllDetail(@PathVariable("id") Long id) {
        return centerInfoService.findDetail(id);
    }

    @PostMapping("/api/createUser/{name}")
    public UserInfo saveUser(@PathVariable("name") String name) {
        UserInfo userInfo = new UserInfo();
        userInfo.setNickname(name);
        userService.saveUser(userInfo);
        return userInfo;
    }

    @PostMapping("/api/createReview")
    public CreateReviewResponse saveReview(@RequestBody CreateReviewRequest createReviewRequest) {
        ReviewInfo reviewInfo = new ReviewInfo();

        CenterInfo centerInfo = centerInfoService.findById(createReviewRequest.centerInfoId).get();
        UserInfo userInfo = userService.findById(createReviewRequest.userInfoId).get();

        reviewInfo.setCenterInfo(centerInfo);
        reviewInfo.setUserInfo(userInfo);
        reviewInfo.setUserName(createReviewRequest.getUserName());
        reviewInfo.setContent(createReviewRequest.getContent());

        reviewService.saveReview(reviewInfo);

        return new CreateReviewResponse(reviewInfo);
    }

    @GetMapping("/api/review/{id}")
    public List<ReviewInfoDto> getAllReview(@PathVariable("id") Long id) {
        return reviewService.getAllReview(id);
    }

    @Data
    static class CreateReviewRequest{

        private long centerInfoId;

        private long userInfoId;

        private String userName;

        private String content;

    }

    @Data
    static class CreateReviewResponse{
        private long centerInfoId;

        private long userInfoId;

        private String userName;

        private String content;

        public CreateReviewResponse(ReviewInfo reviewInfo) {
            this.centerInfoId = reviewInfo.getCenterInfo().getDetailId();
            this.userInfoId = reviewInfo.getUserInfo().getId();
            this.userName = reviewInfo.getUserName();
            this.content = reviewInfo.getContent();
        }
    }
}
