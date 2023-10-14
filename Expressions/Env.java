import java.util.HashMap;

public class Env {

    private HashMap<String, Double> map = new HashMap<>();

    public void associer(String nom, double valeur) {
        map.put(nom, valeur);
    }

    public double obtenirValeur(String nom) {
        if (map.containsKey(nom)) {
            return map.get(nom);
        }

        throw new RuntimeException(nom + " n'est pas dans l'environnement");
    }

    @Override
    public String toString() {
        return map.toString();
    }
}
