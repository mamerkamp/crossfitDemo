package nl.amerkamp.java.crossfit.crossfitDemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * <p>
 * Beschrijving:
 */
@Entity
public class PR {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer prId;

}
