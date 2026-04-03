public class AcademyDemo {
    public static void main(String[] args) {
        System.out.println("=== MAGICAL FANTASY ACADEMY DEMO ===\n");

        // (a) Create several objects
        Artifact wand = new Artifact("Elder Wand", 100);
        Artifact gem = new Artifact("Fire Gem", 50);
        Artifact boots = new Artifact("Speed Boots", 25);

        Creature baseCreature = new Creature("Mysterious Blob", 100, wand);
        FlyingCreature griffin = new FlyingCreature("Griffin", 50, wand, 12.5);
        Dragon smaug = new Dragon("Smaug", 800, gem, 45.0, 9000, 50000);
        BabyDragon norbert = new BabyDragon("Norbert", 1, gem, 2.5, 10, 5, "Marshmallows");
        Phoenix fawkes = new Phoenix("Fawkes", 500, wand, 8.0, 5);
        GroundCreature centaur = new GroundCreature("Firenze", 45, boots, 35.5);

        // (b, c, d) Show inheritance branches
        System.out.println("--- Inheritance Branches ---");
        System.out.println("Branch 1: Creature -> FlyingCreature -> Dragon -> BabyDragon (" + norbert.getName() + ")");
        System.out.println("Branch 2: Creature -> FlyingCreature -> Phoenix (" + fawkes.getName() + ")");
        System.out.println("Branch 3: Creature -> GroundCreature (" + centaur.getName() + ")\n");

        // (e) Explain is-a vs has-a
        System.out.println("--- Relationships ---");
        System.out.println("IS-A: A BabyDragon 'is-a' Dragon, meaning it inherits from it.");
        System.out.println("HAS-A: A Creature 'has-a' Artifact, meaning it contains an instance of it (Composition).\n");

        // (f, g) Demonstrate constructor chaining
        System.out.println("--- Constructor Chaining ---");
        BabyDragon defaultBaby = new BabyDragon();
        System.out.println("Used this(...) chaining for default BabyDragon: " + defaultBaby.getName());
        System.out.println("Used super(...) chaining for parameterized Phoenix: " + fawkes.getName() + "\n");

        // (h) Demonstrate method overriding
        System.out.println("--- Method Overriding ---");
        System.out.println(baseCreature.toString());
        baseCreature.makeSound();
        System.out.println(smaug.toString());
        smaug.makeSound();
        System.out.println(norbert.toString());
        norbert.makeSound();
        System.out.println();

        // (i) Demonstrate privacy leaks are avoided
        System.out.println("--- Privacy Leak Check ---");
        Artifact stolenArtifact = baseCreature.getArtifact();
        stolenArtifact.setPowerLevel(9999); // Try to alter the creature's artifact maliciously
        System.out.println("Stolen Artifact Power: " + stolenArtifact.getPowerLevel());
        System.out.println("Creature's Actual Artifact Power: " + baseCreature.getArtifact().getPowerLevel());
        System.out.println("Leak avoided? " + (baseCreature.getArtifact().getPowerLevel() != 9999) + "\n");

        // (j) Demonstrate equals on 3 pairs
        System.out.println("--- Equals Demonstration ---");
        BabyDragon norbertClone = new BabyDragon(norbert);
        System.out.println("norbert.equals(norbertClone): " + norbert.equals(norbertClone)); // True
        System.out.println("smaug.equals(norbert): " + smaug.equals(norbert)); // False
        System.out.println("baseCreature.equals(wand): " + baseCreature.equals(wand)); // False
        System.out.println();

        // (k) Demonstrate instanceof on 5 expressions
        System.out.println("--- Instanceof Demonstration ---");
        System.out.println("norbert instanceof BabyDragon: " + (norbert instanceof BabyDragon)); // True
        System.out.println("norbert instanceof Creature: " + (norbert instanceof Creature)); // True
        System.out.println("griffin instanceof Dragon: " + (griffin instanceof Dragon)); // False
        System.out.println("baseCreature instanceof GroundCreature: " + (baseCreature instanceof GroundCreature)); // False
        System.out.println("centaur instanceof Creature: " + (centaur instanceof Creature)); // True
        System.out.println();

        // (I) Include at least one example where a Creature reference refers to a BabyDragon ojbect.
        Creature creatureTest = new BabyDragon();
        FlyingCreature test1 = new Phoenix();

        // n
        Creature simpleCreature = new BabyDragon("Bebe", 1, new Artifact(), 0,0,0,"Milk");
        simpleCreature.makeSound();
        if(simpleCreature instanceof BabyDragon){
            BabyDragon baby = (BabyDragon) simpleCreature;
            baby.play();
        }
    }
}
