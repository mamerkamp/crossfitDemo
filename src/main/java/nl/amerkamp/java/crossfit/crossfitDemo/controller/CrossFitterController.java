package nl.amerkamp.java.crossfit.crossfitDemo.controller;

import nl.amerkamp.java.crossfit.crossfitDemo.model.CrossFitter;
import nl.amerkamp.java.crossfit.crossfitDemo.repository.CrossFitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * <p>
 * Beschrijving:
 */
@Controller
public class CrossFitterController {

    @Autowired
    CrossFitterRepository crossFitterRepository;

    @GetMapping({"/", "/crossfitter"})
    protected String showCrossFitters(Model model) {

        model.addAttribute("allCrossFitters", crossFitterRepository.findAll());
        model.addAttribute("crossFitter", new CrossFitter());
        return "crossfitterOverview";
    }

    @GetMapping("crossfitter/{crossFitterName}")
    protected String showCrossFitterDetails(Model model, @PathVariable("crossFitterName") String crossFitterName) {
        Optional<CrossFitter> crossFitterBox = crossFitterRepository.findByName(crossFitterName);
        if(crossFitterBox.isEmpty()) {
            return "redirect:/crossfitter";
        }
        model.addAttribute("crossfitter", crossFitterBox.get());
        return "crossfitterDetail";
    }


    @PostMapping("/crossfitter/add")
    protected String saveOrUpdateCrossFitter(@ModelAttribute("crossfitter") CrossFitter crossFitter, BindingResult result) {
        if (result.hasErrors()) {
            return "crossfitterOverview";
        } else {
            crossFitterRepository.save(crossFitter);
            return "redirect:/crossfitter";
        }
    }
}
