package nl.amerkamp.java.crossfit.crossfitDemo.model;

import javax.persistence.*;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * <p>
 * Beschrijving:
 */
@Entity
public class CrossFitter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer crossFitterId;

    //Hier moet een one to many relatie komen als ik voor alle crossfitters de pr's wil opvragen

    private String name;

    public Integer getCrossFitterId() {
        return crossFitterId;
    }

    public void setCrossFitterId(Integer crossfitterId) {
        this.crossFitterId = crossfitterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
