public class TestZoo {
    
    public static void main(String[] args) {
        Zoo ensimagZoo = new Zoo("Ensimag");
        ensimagZoo.ajouteAnimal(new Animal("Marie", 80));
        ensimagZoo.ajouteAnimal(new Animal("Matthieu", 80));
        ensimagZoo.ajouteAnimal(new Animal("Akram", 80));
        ensimagZoo.ajouteAnimal(new Animal("Thang", 80));
        ensimagZoo.ajouteAnimal(new Animal("Karine", 80));
        ensimagZoo.ajouteAnimal(new Animal("Nicolas", 80));
        ensimagZoo.ajouteAnimal(new Animal("Djamel", 80));
        ensimagZoo.crier();
    }
}
