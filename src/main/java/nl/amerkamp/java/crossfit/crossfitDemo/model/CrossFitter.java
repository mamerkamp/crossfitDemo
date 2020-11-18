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
public class CrossFitter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer crossfitterId;

    private String name;

    public Integer getCrossfitterId() {
        return crossfitterId;
    }

    public void setCrossfitterId(Integer crossfitterId) {
        this.crossfitterId = crossfitterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
