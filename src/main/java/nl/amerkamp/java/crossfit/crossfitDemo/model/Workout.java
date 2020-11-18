package nl.amerkamp.java.crossfit.crossfitDemo.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * <p>
 * Beschrijving:
 */
@Entity
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer workoutId;

    private String workoutName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "crossFitterId", referencedColumnName = "crossFitterId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)

    private CrossFitter crossFitter;

    @ManyToMany(mappedBy = "workout")

    public Integer getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(Integer workoutId) {
        this.workoutId = workoutId;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }
}
