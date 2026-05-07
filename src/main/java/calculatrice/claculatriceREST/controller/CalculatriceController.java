package calculatrice.claculatriceREST.controller;

import calculatrice.claculatriceREST.model.CalculatriceResult;
import calculatrice.claculatriceREST.service.CalculatriceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatriceController {

    private CalculatriceService calculatriceService;

    public CalculatriceController(CalculatriceService calculatriceService) {
        this.calculatriceService = calculatriceService;
    }

    @GetMapping("/add")
    public CalculatriceResult add(@RequestParam double valeurX, @RequestParam double valeurY){

        return calculatriceService.add(valeurX, valeurY);
    }
    @GetMapping("/soustract")
    public CalculatriceResult soustract(@RequestParam double valeurX, @RequestParam double valeurY){

        return calculatriceService.sousract(valeurX, valeurY);
    }

    @GetMapping("/multiply")
    public CalculatriceResult multiply(@RequestParam double valeurX, @RequestParam double valeurY){

        return calculatriceService.multiply(valeurX, valeurY);
    }

    @GetMapping("/divide")
    public CalculatriceResult divide(@RequestParam double valeurX, @RequestParam double valeurY){

        return calculatriceService.divide(valeurX, valeurY);
    }

}
