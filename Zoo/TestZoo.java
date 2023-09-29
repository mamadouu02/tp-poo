public class TestZoo {
    
    public static void main(String[] args) {
        Zoo ensimagZoo = new Zoo("Ensimag");

        ensimagZoo.ajouteAnimal(new Animal("Marie", 0));
        ensimagZoo.ajouteAnimal(new Vache("Matthieu", 700, 17));
        ensimagZoo.ajouteAnimal(new Animal("Akram", 0));
        ensimagZoo.ajouteAnimal(new Animal("Thang", 0));
        ensimagZoo.ajouteAnimal(new Canard("Karine", 1, "noir tuxien cancane"));
        ensimagZoo.ajouteAnimal(new Animal("Nicolas", 0));
        ensimagZoo.ajouteAnimal(new Animal("Djamel", 0));

        ensimagZoo.crier();
        
        System.out.println("\nCoût global de la nourriture : " + ensimagZoo.calculCoutGlobal() + " €");
    }
}
