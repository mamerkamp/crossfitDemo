package nl.amerkamp.java.crossfit.crossfitDemo.service;

import nl.amerkamp.java.crossfit.crossfitDemo.repository.LibraryUserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * <p>
 * Beschrijving:
 */
@Service
public class LibraryUserDetailsService implements UserDetailsService {

    @Autowired
    LibraryUserRepository libraryUserRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return libraryUserRepository.findByUsername(s).orElseThrow(
                () -> new UsernameNotFoundException("User " + s + " was not found.")
        );
    }
}
