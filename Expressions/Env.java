import java.util.HashMap;

public class Env {

    private HashMap<String, Evaluable> map;

    public Env() {
        this.map = new HashMap<>();
    }

    public void associer(String nom, Evaluable valeur) {
        map.put(nom, valeur);
    }

    public void associer(String nom, double valeur) {
        map.put(nom, new Constante(valeur));
    }

    public Evaluable obtenirValeur(String nom) {
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
