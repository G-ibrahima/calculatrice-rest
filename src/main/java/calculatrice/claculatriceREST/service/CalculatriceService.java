package calculatrice.claculatriceREST.service;

import calculatrice.claculatriceREST.model.CalculatriceResult;
import org.springframework.stereotype.Service;

@Service
public class CalculatriceService {


    public CalculatriceResult add(double valeurX, double valeurY) {
        return new CalculatriceResult(valeurX,valeurY,valeurX + valeurY,"addition");
    }

    public CalculatriceResult sousract(double valeurX, double valeurY) {

        return new CalculatriceResult(valeurX,valeurY,valeurX - valeurY,"soustraction");
    }

    public CalculatriceResult multiply(double valeurX, double valeurY) {
        return new CalculatriceResult(valeurX,valeurY,valeurX * valeurY,"multiplication");
    }

    public CalculatriceResult divide(double valeurX, double valeurY) {
        return new CalculatriceResult(valeurX,valeurY,valeurX / valeurY,"division");
    }
}
