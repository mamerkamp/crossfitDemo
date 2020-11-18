package nl.amerkamp.java.crossfit.crossfitDemo.repository;

import nl.amerkamp.java.crossfit.crossfitDemo.model.CrossFitter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CrossFitterRepository extends JpaRepository<CrossFitter, Integer> {
    Optional<CrossFitter> findByName(String name);
}
