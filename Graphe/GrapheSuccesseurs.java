import java.util.*;

public class GrapheSuccesseurs implements Graphe {
    
    private Map<String, Sommet> sommets;

    public GrapheSuccesseurs() {
        this.sommets = new HashMap<>();
    }

    @Override
    public void ajouteSommet(String label) {
        if (!sommets.containsKey(label)) {
            Sommet sommet = new Sommet(label);
            sommets.put(label, sommet);
        }
    }

    @Override
    public void ajouteArc(String labelDepart, String labelArrivee) {
        if (!sommets.containsKey(labelDepart)) {
            ajouteSommet(labelDepart);
        }

        if (!sommets.containsKey(labelArrivee)) {
            ajouteSommet(labelArrivee);
        }

        sommets.get(labelDepart).addSuccesseur(labelArrivee);
    }

    @Override
    public boolean existeChemin(String labelDepart, String labelArrivee) {
        Queue<String> queue = new LinkedList<>();
        queue.add(labelDepart);
        Map<String, Boolean> map = new HashMap<>();

        for (String label : sommets.keySet()) {
            map.put(label, false);
        }

        map.put(labelDepart, true);

        while (!queue.isEmpty()) {
            Sommet sommet = sommets.get(queue.remove());

            for (String successeur : sommet.getSuccesseurs()) {
                if (!map.get(successeur)) {
                    if (successeur.equals(labelArrivee)) {
                        return true;
                    }
                    
                    queue.add(successeur);
                    map.put(successeur, true);
                }
            }
        }

        return false;
    }

    @Override
    public String toString() {
        String s = "sommets = {" + String.join(", ", sommets.keySet()) + "}\narcs = {";

        for (Sommet sommet : sommets.values()) {
            for (String successeur : sommet.getSuccesseurs()) {
                s += "(" + sommet + ", " + successeur + "), ";
            }
        }
        
        return s.substring(0, s.length() - 2) + "}";
    }
}
