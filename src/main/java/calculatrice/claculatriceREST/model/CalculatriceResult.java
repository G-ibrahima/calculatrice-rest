package calculatrice.claculatriceREST.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CalculatriceResult {
    private double valeurX;
    private double valeurY;
    private double resultat;
    private String operation;

}
