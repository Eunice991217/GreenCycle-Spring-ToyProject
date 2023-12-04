package GreenCycle.MkToyProject.repository;

import GreenCycle.MkToyProject.domain.entity.CenterInfo;
import GreenCycle.MkToyProject.domain.entity.ReviewInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewInfo, Long> {


}
