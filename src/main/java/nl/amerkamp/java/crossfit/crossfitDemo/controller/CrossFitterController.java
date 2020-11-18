package nl.amerkamp.java.crossfit.crossfitDemo.controller;

import nl.amerkamp.java.crossfit.crossfitDemo.model.CrossFitter;
import nl.amerkamp.java.crossfit.crossfitDemo.repository.CrossFitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * <p>
 * Beschrijving:
 */
@Controller
public class CrossFitterController {

    @Autowired
    CrossFitterRepository crossFitterRepository;

    @GetMapping("/crossfitter")
    protected String showCrossFitters(Model model) {
        model.addAttribute("allCrossFitters", crossFitterRepository.findAll());
        model.addAttribute("crossFitter", new CrossFitter());
        return "crossfitterOverview";
    }

    //Hier nog een add functie komen.
}
