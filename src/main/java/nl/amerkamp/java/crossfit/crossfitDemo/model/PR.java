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
public class PR {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer prId;
    private int prNumber;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "crossFitterId", referencedColumnName = "crossFitterId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private CrossFitter crossFitter;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Workout workout;

    public Integer getPrId() {
        return prId;
    }

    public int getPrNumber() {
        return prNumber;
    }

    public void setPrNumber(int prNumber) {
        this.prNumber = prNumber;
    }

    public void setPrId(Integer prId) {
        this.prId = prId;
    }

    public CrossFitter getCrossFitter() {
        return crossFitter;
    }

    public void setCrossFitter(CrossFitter crossFitter) {
        this.crossFitter = crossFitter;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }
}
