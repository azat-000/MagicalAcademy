public class Dragon extends FlyingCreature {
    private int firePower;
    private int treasureAmount;
    //constructors

    /**
     * not recommended to use this constructor.
     */
    public Dragon() {
        this("Unknown Dragon", 0, new Artifact(), 0, 0, 0 );
    }

    /**
     *
     * @param name the name of the dragon.
     * @param age the age of the dragon.
     * @param artifact the artifact of the dragon.
     * @param wingSpan the wing span of the dragon.
     * @param firePower the firepower of the dragon.
     * @param treasureAmount the treasure amount of the dragon.
     */
    public Dragon(String name, int age, Artifact artifact, double wingSpan, int firePower, int treasureAmount) {
        super(name, age, artifact, wingSpan);
        this.firePower = firePower;
        this.treasureAmount = treasureAmount;
    }

    /**
     * Copy constructor
     * @param dragon the dragon to be copied.
     */
    public Dragon(Dragon dragon) {
        super(dragon);
        firePower = dragon.firePower;
        treasureAmount = dragon.treasureAmount;
    }
    //accessors

    /**
     * returns the firepower of the dragon.
     * @return the firepower of the dragon.
     */
    public int getFirePower() {
        return firePower;
    }

    /**
     * returns the treasure amount of the dragon.
     * @return the treasure amount of the dragon.
     */
    public int getTreasureAmount() {
        return  treasureAmount;
    }
    //mutators

    /**
     * sets the firepower of the dragon
     * @param firePower the firepower to be set to the dragon.
     */
    public void setFirePower(int firePower) {
        this.firePower = firePower;
    }

    /**
     * sets the treasure amount of the dragon.
     * @param treasureAmount the treasure amount to be set to the dragon.
     */
    public void setTreasureAmount(int treasureAmount) {
        this.treasureAmount = treasureAmount;
    }
    //other

    /**
     * prints "FWOOOOSH! Flames burst from the dragon's mouth."
     */
    public void breatheFire(){
        System.out.println("FWOOOOSH! Flames burst from the dragon's mouth.");
    }

    /**
     * prints "ROOOAR! The dragon shakes the academy tower."
     */
    @Override
    public void makeSound(){
        System.out.println("ROOOAR! The dragon shakes the academy tower.");
    }

    /**
     * returns the description fo the dragon.
     * @return the description of the dragon.
     */
    @Override
    public String toString(){
        return super.toString()+" firepower: "+firePower+" treasureamount: "+treasureAmount;
    }

    /**
     * checks if the two objects are equal.
     * @param otherObject   the reference object with which to compare.
     * @return true if the objects are equal, otherwise false.
     */
    @Override
    public boolean equals(Object otherObject){
        if(!super.equals(otherObject)) return false;
        Dragon otherDragon = (Dragon)otherObject;
        return firePower == otherDragon.firePower &&  treasureAmount == otherDragon.treasureAmount;
    }

}
