package calculatrice.claculatriceREST.service;

import calculatrice.claculatriceREST.exception.CalculatriceException;
import calculatrice.claculatriceREST.model.CalculatriceResult;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier
@Service("scientifique")
public class CalculatriceServiceScientifique implements CalculatriceService {
    @Override
    public CalculatriceResult add(double valeurX, double valeurY) {
        double resultat = Math.round((valeurX + valeurY) * 100.0) / 100.0;
        return new CalculatriceResult(valeurX,valeurY,resultat,"addition");
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

    @Override
    public CalculatriceResult sqrt(double x) {
        double resultat = Math.round((Math.sqrt(x)) * 100.0) / 100.0;
        return new CalculatriceResult(x, 0.0, resultat, "racine carrée");
    }
    @Override
    public CalculatriceResult power(double x, double y) {
        double resultat = Math.round((Math.pow(x, y)) * 100.0) / 100.0;
        return new CalculatriceResult(x, y, resultat, "puissance");
    }
}
