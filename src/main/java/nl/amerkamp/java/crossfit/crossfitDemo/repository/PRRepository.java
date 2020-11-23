package nl.amerkamp.java.crossfit.crossfitDemo.repository;

import nl.amerkamp.java.crossfit.crossfitDemo.model.PR;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PRRepository extends JpaRepository<PR, Integer> {
//    Optional<PR> findByPR(Integer prId);

}
