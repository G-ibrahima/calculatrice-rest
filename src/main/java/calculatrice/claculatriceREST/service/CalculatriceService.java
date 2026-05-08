package calculatrice.claculatriceREST.service;

import calculatrice.claculatriceREST.model.CalculatriceResult;

public interface CalculatriceService {

    CalculatriceResult add(double valeurX, double valeurY);
    CalculatriceResult soustract(double valeurX, double valeurY);
    CalculatriceResult multiply(double valeurX, double valeurY);
    CalculatriceResult divide(double valeurX, double valeurY);
}
