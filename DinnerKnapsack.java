/**
 * The DinnerKnapsack class is
 * used to determine the optimal
 * combination of food to
 * maximize enjoyment.
 */
public class DinnerKnapsack {

    /**
     * The double enjoyment array is used
     * to store the enjoyment values for
     * the food passed.
     */
    private double enjoyments[];

    /**
     * The double testVal is used to
     * test values for a larger max
     * enjoyment. Gets reassigned on
     * each check.
     */
    private double testVal;

    /**
     * The findMaxEnjoyment method is used to determine
     * the max enjoyment for a given list of food objects
     * and a given stomach capacity. It build the solution
     * using a bottom up approach.
     *
     * @param food The food Array param is used to pass an
     *             array of food to test.
     * @param capacity The param capacity is the max
     *                 capacity of the stomach to use
     *                 for the test.
     * @return The return is the optimal enjoyment for
     *         a given food list and stomach capacity.
     */
    public double findMaxEnjoyment(Food[]food,int capacity){
        enjoyments=new double[capacity+1];
        for (int i=0;i<capacity+1;i++){
            for(int j=0;j<food.length;j++){
                if(food[j].getWeight()<=i){
                    testVal=(enjoyments[(int)(i-food[j].getWeight())]+food[j].getEnjoyment());
                    if(enjoyments[i]<testVal){
                        enjoyments[i]=testVal;
                    }else if(testVal<enjoyments[i]){
                        enjoyments[i]=enjoyments[i];
                    }else{
                        enjoyments[i]=testVal;
                    }
                }
            }
            System.out.println("Enjoyment Max for Capacity "+i+": "+enjoyments[i]);
        }
        return enjoyments[capacity];
    }
}
