package GreenCycle.MkToyProject.repository;

import GreenCycle.MkToyProject.domain.dto.ReviewInfoDto;
import GreenCycle.MkToyProject.domain.entity.CenterInfo;
import GreenCycle.MkToyProject.domain.entity.ReviewInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewInfo, Long> {

    List<ReviewInfoDto> findAllByCenterInfo_DetailId(long id);

}
