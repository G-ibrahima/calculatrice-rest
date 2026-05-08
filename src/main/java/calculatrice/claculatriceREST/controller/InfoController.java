package calculatrice.claculatriceREST.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/calculator")
public class InfoController {

    @Value("${calculatrice.message}")
    private String message;
    @Value("${calculatrice.version}")
    private String version;

    @GetMapping("/info")
    public Map<String, String> getInfo() {
        Map<String, String> result = new HashMap<>();
        result.put("message", message);
        result.put("version", version);
        return result;
    }
}
