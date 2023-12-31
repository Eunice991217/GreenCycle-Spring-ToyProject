package GreenCycle.MkToyProject.service;

import GreenCycle.MkToyProject.domain.entity.CenterLocationInfo;
import GreenCycle.MkToyProject.repository.CenterLocationInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CenterLocationInfoService {

    private final CenterLocationInfoRepository centerLocationInfoRepository;

    public List<CenterLocationInfo> searchAll() {
        return centerLocationInfoRepository.findAll();
    }

}
