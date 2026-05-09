package calculatrice.claculatriceREST.service;

import calculatrice.claculatriceREST.exception.CalculatriceException;
import calculatrice.claculatriceREST.model.CalculatriceResult;
import org.springframework.stereotype.Service;

@Service
public class CalculatriceServiceImpl implements CalculatriceService {

    @Override
    public CalculatriceResult add(double valeurX, double valeurY) {
        double resultat = Math.round((valeurX + valeurY) * 100.0) / 100.0;
        return new CalculatriceResult(valeurX,valeurY,valeurX + valeurY,"addition");
    }

    @Override
    public CalculatriceResult soustract(double valeurX, double valeurY) {
        double resultat = Math.round((valeurX - valeurY) * 100.0) / 100.0;
        return new CalculatriceResult(valeurX,valeurY,resultat,"soustraction");
    }
    @Override
    public CalculatriceResult multiply(double valeurX, double valeurY) {
        double resultat = Math.round((valeurX * valeurY) * 100.0) / 100.0;
        return new CalculatriceResult(valeurX,valeurY,resultat,"multiplication");
    }
    @Override

    public CalculatriceResult divide(double valeurX, double valeurY) throws CalculatriceException {
        if (valeurY == 0){
            throw new CalculatriceException("Division par zéro impossible !");
        }
        double resultat = Math.round((valeurX / valeurY) * 100.0) / 100.0;
        return new CalculatriceResult(valeurX,valeurY,resultat,"division");
    }
}
