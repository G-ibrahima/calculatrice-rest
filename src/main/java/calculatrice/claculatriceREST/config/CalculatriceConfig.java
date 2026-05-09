package calculatrice.claculatriceREST.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "calculatrice")
public class CalculatriceConfig {
    private String message;
    private String version;
    private String nom;
    private String auteur;
}
