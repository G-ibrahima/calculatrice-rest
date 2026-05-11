package calculatrice.claculatriceREST.controller;


import calculatrice.claculatriceREST.model.CalculatriceResult;
import calculatrice.claculatriceREST.service.CalculatriceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator/science")
public class CalculatriceScientifiqueController {
    private final CalculatriceService service;

    public CalculatriceScientifiqueController(@Qualifier CalculatriceService service) {
        this.service = service;
    }

    @GetMapping("/sqrt")
    public CalculatriceResult racine(@RequestParam double valeurX){
        return service.sqrt(valeurX);
    }
    @GetMapping("/power")
    public CalculatriceResult puissance(@RequestParam double valeurX, @RequestParam double valeurY){
        return service.power(valeurX,valeurY);
    }
}
