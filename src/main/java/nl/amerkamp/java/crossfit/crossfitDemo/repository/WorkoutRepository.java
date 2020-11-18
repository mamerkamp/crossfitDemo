package nl.amerkamp.java.crossfit.crossfitDemo.repository;

import nl.amerkamp.java.crossfit.crossfitDemo.model.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Integer> {
}
