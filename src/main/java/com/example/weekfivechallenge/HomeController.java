package com.example.weekfivechallenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    PetRepository petRepository;

    @RequestMapping("/")
    public String homePage(){
        return "home";
    }

    @RequestMapping("/allList")
    public String listPet(Model model) {
        model.addAttribute ("pets", petRepository.findAll ());
        return "list";
    }

    @GetMapping("/add")
    public String PetForm(Model model) {
        model.addAttribute ("pet", new PetBook ());
        return "petform";
    }

    @PostMapping("/process")
    public String processForm(@Valid PetBook petBook, BindingResult result) {
        if (result.hasErrors ()) {
            return "petform";
        }
        petRepository.save (petBook);
        return "redirect:/";
    }

    @RequestMapping("/detail/{id}")
    public String showPet(@PathVariable("id") long id, Model model) {
        model.addAttribute ("pet", petRepository.findOne (id));
        return "show";
    }

    @RequestMapping("/update/{id}")
    public String updatePet(@PathVariable("id") long id, Model model) {
        model.addAttribute ("pet", petRepository.findOne (id));
        return "petform";
    }

    @RequestMapping("/delete/{id}")
    public String delPet(@PathVariable("id") long id) {
        petRepository.delete (id);
        return "redirect:/";
    }
}
