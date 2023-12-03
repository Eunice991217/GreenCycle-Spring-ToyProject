package GreenCycle.MkToyProject.repository;

import GreenCycle.MkToyProject.domain.entity.CenterInfo;
import GreenCycle.MkToyProject.domain.entity.CenterLocationInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CenterInfoRepository extends JpaRepository<CenterInfo, Long> {
    List<CenterInfo> findByCenterLocationInfo_Id(long id);
}
