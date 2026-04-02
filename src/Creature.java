public class Creature {
    private String name;
    private int age;
    private Artifact artifact;
    //constructors;
    /**
     * not recommended to use this constructor.
     */
    public Creature(){
        name = "Unknown creature";
        age = 0;
        artifact = new Artifact();
    }

    /**
     * Constructor.
     * @param name name of the creature.
     * @param age age of the creature.
     * @param artifact the artifact of the creature.
     */
    public Creature(String name, int age, Artifact artifact){
        this.name = name;
        this.age = age;
        this.artifact = new Artifact(artifact);
    }

    /**
     * Copy constructor.
     * @param creature the creature to be copied
     */
    public Creature(Creature creature){
        name = creature.name;
        age = creature.age;
        artifact = new Artifact(creature.artifact);
    }
    //accessors.

    /**
     * returns the name of the creature.
     * @return the name of the creature.
     */
    public String getName(){
        return name;
    }

    /**
     * returns the age of the creature.
     * @return the age of the creature.
     */
    public int getAge(){
        return age;
    }

    /**
     * returns a copy of the creature's artifact.
     * @return a copy of the creature's artifact.
     */
    public Artifact getArtifact(){
        return new Artifact(artifact);
    }
    //mutators
    /**
     * sets the name of the Creature.
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * sets the age of the Creature.
     * @param age
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     * Sets the artifact of the creature.
     * @param artifact
     */
    public void setArtifact(Artifact artifact){
        this.artifact = new Artifact(artifact);
    }
    //other methods

    /**
     * Prints the sound of the Creature. "Mystic creature noise..."
     */
    public void makeSound(){
        System.out.println("Mystic creature noise...");
    }

    /**
     * Returns the description of the creature.
     * @return "Name: "+name+" Age: "+age+" Artifact: "+artifact.toString();
     */
    public String toString(){
        return "Name: "+name+" Age: "+age+" Artifact: "+artifact.toString();
    }
    /**
     * Checks if the creature equals to the other object.
     * @param otherObject   the reference object with which to compare.
     * @return true if equals otherObject, else false;
     */
    @Override
    public boolean equals(Object otherObject){
        if(otherObject == null) return false;
        if(getClass() != otherObject.getClass()) return false;
        Creature otherCreature = (Creature)otherObject;
        return name.equals(otherCreature.name) && age == otherCreature.age && artifact.equals(otherCreature.artifact);
    }


}
