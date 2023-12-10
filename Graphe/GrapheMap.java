import java.util.*;

public class GrapheMap implements Graphe {
    
    private Map<String, Set<String>> sommets;

    public GrapheMap() {
        this.sommets = new HashMap<String, Set<String>>();
    }

    @Override
    public void ajouteSommet(String label) {
        if (!sommets.containsKey(label)) {
            sommets.put(label, new HashSet<String>());
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

        sommets.get(labelDepart).add(labelArrivee);
    }

    @Override
    public boolean existeChemin(String labelDepart, String labelArrivee) {
        Queue<String> queue = new LinkedList<String>();
        queue.add(labelDepart);
        Map<String, Boolean> map = new HashMap<String, Boolean>();

        for (String label : sommets.keySet()) {
            map.put(label, false);
        }

        map.put(labelDepart, true);

        while (!queue.isEmpty()) {
            String sommet = queue.remove();

            for (String successeur : sommets.get(sommet)) {
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

        for (String sommet : sommets.keySet()) {
            for (String successeur : sommets.get(sommet)) {
                s += "(" + sommet + ", " + successeur + "), ";
            }
        }
        
        return s.substring(0, s.length() - 2) + "}";
    }
}
