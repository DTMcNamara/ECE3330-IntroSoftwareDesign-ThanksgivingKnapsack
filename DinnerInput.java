import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The DinnerInput class is used to
 * capture user input and pass it to
 * the DinnerKnapsack class.
 */
public class DinnerInput {

    /**
     * The String array names is used to
     * store the names of all the food
     * to request information on.
     */
    private String[]names={"Turkey","Pie","Potatoes","Gravy","Stuffing","Cranberries","Casserrole"};

    /**
     * The inputString is the string used
     * to pass user information to the
     * constructor for food.
     */
    private String inputString;

    /**
     * The double h is used to
     * capture info from the user.
     * It stores the value for stomach
     * capacity to pass to the
     * DinnerKnapsack.
     */
    double h;

    /**
     * The double i is used to
     * capture info from the user.
     * It stores the value for
     * enjoyment to pass to the food
     * constructor.
     */
    double i;

    /**
     * The double j is used to
     * capture info from the user.
     * It stores the value for
     * weight to pass to the food
     * constructor.
     */
    double j;

    /**
     * The double l is used to
     * keep track of the number of
     * tests done on the dinnerKnapsack.
     */
    double l;

    /**
     * The int k is used to
     * point to each element of
     * the names array to capture
     * information.
     */
    int k;

    /**
     * The boolean quit is used to
     * determine if the user has
     * selected to quit using the
     * program.
     */
    boolean quit;

    /**
     * The Scanner input is used to
     * collect information from the user
     * in the terminal window.
     */
    Scanner input;

    /**
     * The food array dinner is used to
     * store all of the created food objects
     * that are then passed to the DinnerKnapsack.
     */
    Food[]dinner;

    /**
     * The dinnerKnapstack is used to determine
     * the optimal combination of food to
     * maximize enjoyment.
     */
    DinnerKnapsack knapsack;

    /**
     * The DinnerInput constructor creates a
     * new DinnerInput object to collect user
     * info.
     */
    public DinnerInput(){
        knapsack=new DinnerKnapsack();
        dinner=new Food[names.length];
        input=new Scanner(System.in);
        quit=false;
        h=0;
        k=0;
        l=1;

        while (!quit) {
            while (k < names.length) {
                System.out.println("How much do you enjoy " + names[k] + "?: ");
                try {
                    i = input.nextDouble();
                    System.out.println("How filling is " + names[k] + "?: ");
                    j = input.nextDouble();
                    dinner[k] = new Food(i, j, names[k]);
                    k++;
                } catch (InputMismatchException e) {
                    input.nextLine();
                    System.out.println("Input incorrect, try again!");
                }
            }
            try {
                System.out.println("How much is your stomach capacity?:");
                h=input.nextDouble();
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Input incorrect, try again!");
            }
            k=0;
            System.out.println("Test "+l+"\n"+"-----------"+"\n"+"Input:");
            while (k < names.length) {
                System.out.println(dinner[k].toString());
                k++;
            }
            System.out.println("\n"+"Output: "+"\n"+"Optimal Enjoyment: "+knapsack.findMaxEnjoyment(dinner,(int)h));
            k=0;
            while (k<1) {
                inputString = input.nextLine();
                if (inputString.matches("yes")||inputString.matches("Yes")||inputString.matches("Y")||inputString.matches("y")){
                    k=1;
                    l++;
                    quit = false;
                } else if(inputString.matches("No")||inputString.matches("no")||inputString.matches("N")||inputString.matches("n")){
                    k=1;
                    quit = true;
                } else {
                    System.out.println("Would you like to test it again? (Y/N)");
                }
            }
            k=0;
        }
        input.close();
        System.out.print("Program Exiting"+"\n"+"Happy Thanksgiving!");
    }
}
