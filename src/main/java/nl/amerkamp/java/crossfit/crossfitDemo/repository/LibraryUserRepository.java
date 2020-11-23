package nl.amerkamp.java.crossfit.crossfitDemo.repository;

import nl.amerkamp.java.crossfit.crossfitDemo.model.LibraryUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LibraryUserRepository extends JpaRepository<LibraryUser, Integer> {
    Optional<LibraryUser> findByUsername(String username);
}
