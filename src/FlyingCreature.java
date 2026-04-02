public class FlyingCreature extends Creature{
    private double wingSpan;
    //constructors

    /***
     * Not recommended to use this constructor.
     */
    public FlyingCreature(){
        super();
        wingSpan = 0;
    }

    /**
     * Constructor
     * @param name the name of the flying creature.
     * @param age the age of the flying creature.
     * @param artifact the artifact of the flying creature.
     * @param wingSpan the wingSpan of the flying creature.
     */
    public FlyingCreature(String name, int age, Artifact artifact, double wingSpan){
        super(name, age, artifact);
        this.wingSpan = wingSpan;
    }

    /**
     * Copy constructor.
     * @param flyingCreature the reference of the flying creature to be copied.
     */
    public FlyingCreature(FlyingCreature flyingCreature){
        super(flyingCreature);
        wingSpan = flyingCreature.wingSpan;
    }
    //accessors

    /**
     * Returns the wing span of the flying creature.
     * @return the wing span of rhe flying creature.
     */
    public double getWingSpan(){
        return wingSpan;
    }

    /**
     * Sets the wing span of the flying creature.
     * @param wingSpan the wing span to be set.
     */
    public void setWingSpan(double wingSpan){
        this.wingSpan = wingSpan;
    }
    /**
     * Prints the message: Whoooosh! The creature spreads its wings and takes off.
     */
    public void fly(){
        System.out.println("Whoooosh! The creature spreads its wings and takes off.");
    }

    /**
     *
     * @return the description of the flying creature.
     */
    @Override
    public String toString(){
        return super.toString() + " wingSpan: " + wingSpan;
    }

    /**
     * checks the equality of all the fields of the objects.
     * @param otherObject   the reference object with which to compare.
     * @return true if all the fields are equals.
     */
    @Override
    public boolean equals(Object otherObject){
        if(!super.equals(otherObject)) return false;
        FlyingCreature otherFlyingCreature = (FlyingCreature)otherObject;
        return wingSpan == otherFlyingCreature.wingSpan;
    }
}
