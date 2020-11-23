package nl.amerkamp.java.crossfit.crossfitDemo.controller;

import nl.amerkamp.java.crossfit.crossfitDemo.model.PR;
import nl.amerkamp.java.crossfit.crossfitDemo.repository.CrossFitterRepository;
import nl.amerkamp.java.crossfit.crossfitDemo.repository.PRRepository;
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
public class PRController {

    @Autowired
    PRRepository prRepository;
    CrossFitterRepository crossFitterRepository;

    @GetMapping("/pr")
    protected String showPR(Model model) {
        model.addAttribute("allCrossFitters", crossFitterRepository.findAll());
        model.addAttribute("allPR", prRepository.findAll());
        model.addAttribute("PR", new PR());
        return "prOverview";
    }

    @PostMapping("/pr/add")
    protected String saveOrUpdatePR(@ModelAttribute("pr") PR pr, BindingResult result) {
        if (result.hasErrors()) {
            return "prOverview";
        } else {
            prRepository.save(pr);
            return "redirect/pr";
        }
    }
}
