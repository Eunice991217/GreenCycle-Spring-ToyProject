package GreenCycle.MkToyProject.service;

import GreenCycle.MkToyProject.domain.entity.ReviewInfo;
import GreenCycle.MkToyProject.domain.entity.UserInfo;
import GreenCycle.MkToyProject.repository.ReviewRepository;
import GreenCycle.MkToyProject.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserInfoRepository userInfoRepository;

    @Transactional
    public void saveUser(UserInfo userInfo) {
        userInfoRepository.save(userInfo);
    }

    public Optional<UserInfo> findById(long id) {
        return userInfoRepository.findById(id);
    }
}
