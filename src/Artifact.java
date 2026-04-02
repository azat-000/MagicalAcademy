public class Artifact {
    private String name;
    private int powerLevel;
    //constructors;

    /**
     * Initializes name to "Unknown Artifact";
     * Initializes powerLevel to 0;
     */
    public Artifact(){
        name = "Unknown Artifact";
        powerLevel = 0;
    }
    public Artifact(String name, int powerLevel){
        this.name = name;
        this.powerLevel = powerLevel;
    }

    /**
     * This is a copy constructor
     * @param artifact
     */
    public Artifact(Artifact artifact){
        name = artifact.name;
        powerLevel = artifact.powerLevel;
    }
    //accessors

    /**
     * Returns the name of the artifact;
     * @return name;
     */
    public String getName(){
        return name;
    }
    /**
     * Returns the name of the powerLevel;
     * @return powerLevel
     */
    public int getPowerLevel(){
        return powerLevel;
    }
    //mutators

    /**
     * Sets the name to the given string
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * sets the powerLevel to the given string
     * @param powerLevel powerLevel of type int
     */
    public void setPowerLevel(int powerLevel){
        this.powerLevel = powerLevel;
    }
    //other

    /**
     * Returns a readable description of the artifact.
     * @return "Artifact Name: " + name + ", Power Level: " + powerLevel
     */
    public String toString(){
        return "Artifact Name: " + name + ", Power Level: " + powerLevel;
    }

    /**
     * this method checks if this object is equal to the given object in the perimeter.
     * @param otherObject   the reference object with which to compare.
     * @return true if equal, otherwise false.
     */
    public boolean equals(Object otherObject){
        if(otherObject == null) return false;
        if(getClass() != otherObject.getClass()) return false;
        Artifact otherArtifact = (Artifact)otherObject;
        return name.equals(otherArtifact.name) && powerLevel == otherArtifact.powerLevel;

    }

}
