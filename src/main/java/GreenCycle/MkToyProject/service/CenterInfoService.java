package GreenCycle.MkToyProject.service;

import GreenCycle.MkToyProject.domain.entity.CenterInfo;
import GreenCycle.MkToyProject.domain.entity.CenterLocationInfo;
import GreenCycle.MkToyProject.repository.CenterInfoRepository;
import GreenCycle.MkToyProject.repository.CenterLocationInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.querydsl.ListQuerydslPredicateExecutor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CenterInfoService {

    private final CenterInfoRepository centerInfoRepository;

    public List<CenterInfo> findDetail(long id) {
        return centerInfoRepository.findByCenterLocationInfo_Id(id);
    }

}
