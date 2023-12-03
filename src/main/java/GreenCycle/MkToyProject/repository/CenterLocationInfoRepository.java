package GreenCycle.MkToyProject.repository;

import GreenCycle.MkToyProject.domain.entity.CenterLocationInfo;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CenterLocationInfoRepository extends JpaRepository<CenterLocationInfo, Long> {

}
