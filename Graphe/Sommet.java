import java.util.*;

public class Sommet {

    private String label;
    private Set<String> successeurs;

    public Sommet(String label) {
        this.label = label;
        this.successeurs = new HashSet<>();
    }

    public Set<String> getSuccesseurs() {
        return successeurs;
    }

    public void addSuccesseur(String label) {
        successeurs.add(label);
    }

    @Override
    public int hashCode() {
        return label.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Sommet && this.label.equals(((Sommet) other).label);
    }

    @Override
    public String toString() {
        return label;
    }
}
