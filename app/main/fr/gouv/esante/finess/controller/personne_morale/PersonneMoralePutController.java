package fr.gouv.esante.finess.controller.personne_morale;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class PersonneMoralePutController {
    @PutMapping("/personne-morale")
    public String index() {
        return "Bonjour, je suis une personne morale!";
    }
}
