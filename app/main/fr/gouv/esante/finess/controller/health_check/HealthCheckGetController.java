package fr.gouv.esante.finess.controller.health_check;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class HealthCheckGetController {

    @RequestMapping("/")
    public String index() {
        return "Tout marche à merveille !";
    }

}
