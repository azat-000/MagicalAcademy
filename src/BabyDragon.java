public class BabyDragon extends Dragon{
    private String favoriteSnack;
    //constructors

    /**
     * not recommended to use this constructor.
     */
    public BabyDragon(){
        this("Unknown babyDragon", 0, new Artifact(), 0, 0, 0, "Unknown favoriteSnack");
    }

    /**
     *
     * @param name the name of the baby dragon.
     * @param age the age of the baby dragon.
     * @param artifact the artifact of the baby dragon.
     * @param wingSpan the wing span of the baby dragon.
     * @param firePower the firepower of the baby dragon.
     * @param treasureAmount the treasure amount of the baby dragon.
     * @param favoriteSnack the favorite snack of the baby dragon.
     */
    public BabyDragon(String name, int age, Artifact artifact, double wingSpan, int firePower, int treasureAmount, String favoriteSnack) {
        super(name, age, artifact, wingSpan, firePower, treasureAmount);
        this.favoriteSnack = favoriteSnack;
    }

    /**
     * Copy constructor
     * @param babyDragon the object to be copied.
     */
    public BabyDragon(BabyDragon babyDragon){
        super(babyDragon);
        favoriteSnack = babyDragon.favoriteSnack;
    }
    //accessors
    /**
     * returns the favorite snack of the baby dragon.
     * @return the favorite snack of the baby dragon.
     */
    public String getFavoriteSnack() {
        return favoriteSnack;
    }
    //mutators

    /**
     * sets the favorite snack of the baby dragon.
     * @param favoriteSnack the favorite snack of the baby dragon.
     */
    public void setFavoriteSnack(String favoriteSnack) {
        this.favoriteSnack = favoriteSnack;
    }

    /**
     * prints Squeee-roar! The baby dragon tries to sound terrifying.
     */
    @Override
    public void makeSound(){
        System.out.println("Squeee-roar! The baby dragon tries to sound terrifying.");
    }

    /**
     * prints "The baby dragon chases its tail and bumps into a pile of gold."
     */
    public void play(){
        System.out.println("The baby dragon chases its tail and bumps into a pile of gold.");
    }

    /**
     * returns the description of the object.
     * @return the description of the object.
     */
    @Override
    public String toString(){
        return super.toString()+" favoriteSnack: "+favoriteSnack;
    }

    /**
     * Checks if the two object are equal.
     * @param otherObject   the reference object with which to compare.
     * @return true if the two objects are equal, otherwise returns false.
     */
    @Override
    public boolean equals(Object otherObject){
        if(!super.equals(otherObject)) return false;
        BabyDragon otherBabyDragon = (BabyDragon)otherObject;
        return favoriteSnack.equals(otherBabyDragon.favoriteSnack);
    }


}
