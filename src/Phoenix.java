public class Phoenix extends FlyingCreature{
    private int rebirthCount;
    //constructors

    /**
     * not recommended to use this constructor.
     */
    public Phoenix(){
        this("Unknown phoenix", 0, new Artifact(), 0, 0);
    }

    /**
     *
     * @param name the name of the object.
     * @param age the age of the object.
     * @param artifact the artifact of the object.
     * @param wingSpan the wingspan of the object.
     * @param rebirthCount the rebirth count of the object.
     */
    public Phoenix(String name, int age, Artifact artifact, double wingSpan, int rebirthCount){
        super(name, age, artifact, wingSpan);
        this.rebirthCount = rebirthCount;
    }

    /**
     * Copy constructor.
     * @param phoenix the object to be copied.
     */
    public Phoenix(Phoenix phoenix){
        super(phoenix);
        this.rebirthCount = phoenix.rebirthCount;
    }
    //accessors.
    /**
     * returns the rebirth count of the object.
     * @return the rebirth count of the object.
     */
    public int getRebirthCount() {
        return rebirthCount;
    }
    //mutators
    /**
     * Sets the rebirth count of the object.
     * @param rebirthCount the rebirth count of the object.
     */
    public void setRebirthCount(int rebirthCount) {
        this.rebirthCount = rebirthCount;
    }

    /**
     * Prints "The phoenix vanishes into ashes... and rises again in a flash of light!"
     */
    public void rebirth(){
        System.out.println("The phoenix vanishes into ashes... and rises again in a flash of light!");
    }

    /**
     * Prints "Kreeee! The phoenix sings a bright, fiery cry."
     */
    @Override
    public void makeSound(){
        System.out.println("Kreeee! The phoenix sings a bright, fiery cry.");
    }

    /**
     * Returns the description of the object.
     * @return the description of the object.
     */
    @Override
    public String toString(){
        return super.toString()+" rebirth count: "+rebirthCount;
    }

    /**
     * Checks if the two objects are equal.
     * @param otherObject   the reference object with which to compare.
     * @return true if the objects are equal, else false.
     */
    @Override
    public boolean equals(Object otherObject){
        if(!super.equals(otherObject)) return false;
        Phoenix otherPhoenix = (Phoenix)otherObject;
        return rebirthCount == otherPhoenix.rebirthCount;
    }


}
