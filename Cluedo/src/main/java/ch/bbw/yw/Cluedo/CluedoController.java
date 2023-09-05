package ch.bbw.yw.cluedo;

 

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

 

@Controller

public class CluedoController {

 

    private final DataService dataService;

 

    public CluedoController() {

        this.dataService = new DataService();

    }

 

    @GetMapping("/persons")

    public String showPersons(Model model) {

        model.addAttribute("persons", dataService.getPersons());

        return "persons";

    }

}