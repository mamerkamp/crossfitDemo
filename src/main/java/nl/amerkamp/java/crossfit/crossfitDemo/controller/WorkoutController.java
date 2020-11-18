package nl.amerkamp.java.crossfit.crossfitDemo.controller;

import nl.amerkamp.java.crossfit.crossfitDemo.model.Workout;
import nl.amerkamp.java.crossfit.crossfitDemo.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * <p>
 * Beschrijving:
 */
@Controller
public class WorkoutController {

    @Autowired
    WorkoutRepository workoutRepository;

    @GetMapping("/workout")
    protected String showWorkout(Model model) {
        model.addAttribute("allWorkout", workoutRepository.findAll());
        model.addAttribute("workout", new Workout());
        return "workoutOverview";
    }

    @PostMapping("/workout/add")
    protected String saveOrUpdateWorkout(@ModelAttribute("workout") Workout workout, BindingResult result) {
        if (result.hasErrors()) {
            return "workoutOverview";
        } else {
            workoutRepository.save(workout);
            return "redirect:/workout";
        }
    }



}
