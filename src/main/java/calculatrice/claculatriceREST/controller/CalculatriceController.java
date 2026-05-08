package calculatrice.claculatriceREST.controller;

import calculatrice.claculatriceREST.model.CalculatriceResult;
import calculatrice.claculatriceREST.service.CalculatriceService;
import calculatrice.claculatriceREST.service.CalculatriceServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatriceController {

    private final CalculatriceService service;

    public CalculatriceController(CalculatriceServiceImpl calculatriceService) {
        this.service = calculatriceService;
    }

    @GetMapping("/add")
    public CalculatriceResult add(@RequestParam double valeurX, @RequestParam double valeurY){

        return service.add(valeurX, valeurY);
    }
    @GetMapping("/soustract")
    public CalculatriceResult soustract(@RequestParam double valeurX, @RequestParam double valeurY){

        return service.soustract(valeurX, valeurY);
    }

    @GetMapping("/multiply")
    public CalculatriceResult multiply(@RequestParam double valeurX, @RequestParam double valeurY){

        return service.multiply(valeurX, valeurY);
    }

    @GetMapping("/divide")
    public CalculatriceResult divide(@RequestParam double valeurX, @RequestParam double valeurY){

        return service.divide(valeurX, valeurY);
    }

}
