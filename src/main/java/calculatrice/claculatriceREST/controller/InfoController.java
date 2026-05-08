package calculatrice.claculatriceREST.controller;

import calculatrice.claculatriceREST.config.CalculatriceConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class InfoController {

    private final CalculatriceConfig config;

    public InfoController(CalculatriceConfig config) {
        this.config = config;
    }

    @GetMapping("/info")
    public CalculatriceConfig getInfo() {
        return config;
    }
}
