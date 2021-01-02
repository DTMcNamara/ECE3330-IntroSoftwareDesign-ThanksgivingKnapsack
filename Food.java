/**
 * The food class is used
 * to store info about the food.
 * This includes the enjoyment,
 * weight and name.
 */
public class Food {

    /**
     * The double enjoyment is used
     * to store the value representing
     * the enjoyment factor of the food.
     */
    private double enjoyment;

    /**
     * The double weight is used
     * to store the value representing
     * the weight factor of the food.
     */
    private double weight;

    /**
     * The string name is used
     * to store the string representing
     * the name of the food.
     */
    private String name;

    /**
     * The food constructore takes the
     * enjoyment,weight and name as parameters.
     * It then creats and instance of the food
     * object with the given parameters.
     *
     * @param i The param i is the value to
     *          set enjoyment to.
     * @param j The param j is the value to
     *          set weight to.
     * @param k The param k is the string
     *          to set the name to.
     */
    public Food (double i, double j, String k){
        this.enjoyment=i;
        this.weight=j;
        this.name=k;
    }

    /**
     * The toString method is used to
     * get all the information about
     * the food object into a string and
     * then returns it.
     *
     * @return The return is the string
     *         with all the food info in
     *         it.
     */
    @Override
    public String toString() {
        return (this.name+" - weight: "+this.weight+", enjoyment: "+this.enjoyment);
    }

    /**
     * The getEnjoyment method is used
     * to get the enjoyment value of
     * the food object.
     *
     * @return The return is the value
     *         of enjoyment for the given
     *         food object.
     */
    public double getEnjoyment() {
        return enjoyment;
    }

    /**
     * The getWeight method is used
     * to get the weight value of
     * the food object.
     *
     * @return The return is the value
     *         of weight for the given
     *         food object.
     */
    public double getWeight() {
        return weight;
    }
}
