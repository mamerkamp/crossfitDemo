package nl.amerkamp.java.crossfit.crossfitDemo.model;

import javax.persistence.*;
import java.util.List;

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

//    @OneToMany(mappedBy = "workout")
//    private List<Workout> myWorkout;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    //@JoinColumn(name = "crossFitterId", referencedColumnName = "crossFitterId", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//
//    private CrossFitter crossFitter;
//
//    @ManyToMany(mappedBy = "workout")

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

//    public int getNumberOfWorkout() {
//        return myWorkout.size();
//    }
}
