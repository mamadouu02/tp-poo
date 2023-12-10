import java.util.*;

public class Sommet {
    
    private String label;
    private Set<String> successeurs;

    public Sommet(String label) {
        this.label = label;
        this.successeurs = new HashSet<String>();
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
    public boolean equals(Object obj) {
        if (obj instanceof Sommet) {
            Sommet other = (Sommet)obj;
            return this.label.equals(other.label);
        }

        return false;
    }

    @Override
    public String toString() {
        return label;
    }
}
