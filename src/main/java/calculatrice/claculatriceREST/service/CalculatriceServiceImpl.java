package calculatrice.claculatriceREST.service;

import calculatrice.claculatriceREST.model.CalculatriceResult;
import org.springframework.stereotype.Service;

@Service
public class CalculatriceServiceImpl implements CalculatriceService {

    @Override
    public CalculatriceResult add(double valeurX, double valeurY) {
        return new CalculatriceResult(valeurX,valeurY,valeurX + valeurY,"addition");
    }

    @Override
    public CalculatriceResult soustract(double valeurX, double valeurY) {

        return new CalculatriceResult(valeurX,valeurY,valeurX - valeurY,"soustraction");
    }
    @Override
    public CalculatriceResult multiply(double valeurX, double valeurY) {
        return new CalculatriceResult(valeurX,valeurY,valeurX * valeurY,"multiplication");
    }
    @Override
    public CalculatriceResult divide(double valeurX, double valeurY) {
        return new CalculatriceResult(valeurX,valeurY,valeurX / valeurY,"division");
    }
}
