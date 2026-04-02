public class GroundCreature extends Creature{
    private double speed;
    //constructors

    /**
     * Not recommended to use this constructor.
     */
    public GroundCreature(){
        this("Unkown ground creature", 0, new Artifact(), 0);
    }

    /**
     *
     * @param name the name of the object.
     * @param age the age of the object.
     * @param artifact the artifact of the object.
     * @param speed the speed of the object.
     */
    public GroundCreature(String name, int age, Artifact artifact, double speed){
        super(name, age, artifact);
        this.speed = speed;
    }

    /**
     * Copy constructor.
     * @param groundCreature the object to be copied.
     */
    public GroundCreature(GroundCreature groundCreature){
        super(groundCreature);
        speed = groundCreature.speed;
    }
    //accessors

    /**
     * Returns the speed of the object.
     * @return the speed of the object.
     */
    public double getSpeed(){
        return speed;
    }
    //mutators

    /**
     * Sets the speed of the object.
     * @param speed the speed of the object to be set.
     */
    public void setSpeed(double speed){
        this.speed = speed;
    }

    /**
     * Prints "Thump thump thump! The creature dashes across the academy grounds."
     */
    public void run(){
        System.out.println("Thump thump thump! The creature dashes across the academy grounds.");
    }

    /**
     * Prints "Grrrr! The ground creature stomps and growls."
     */
    @Override
    public void makeSound(){
        System.out.println("Grrrr! The ground creature stomps and growls.");
    }

    /**
     * Returns the description of the object.
     * @return the description of the object.
     */
    @Override
    public String toString(){
        return super.toString()+" speed: "+speed;
    }

    /**
     * Checks of two object are equal.
     * @param otherObject   the reference object with which to compare.
     * @return true if the two object are equal, otherwise false.
     */
    @Override
    public boolean equals(Object otherObject){
        if(!super.equals(otherObject)) return false;
        GroundCreature otherGroundCreature = (GroundCreature)otherObject;
        return speed == otherGroundCreature.speed;
    }

}
