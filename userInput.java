import java.util.Scanner; //class
//integer from the user => nextInt(),nextFloat(),nextLine()
public class userInput {
    public static void main(String[] args) {
        boolean x;
       /* Scanner scan; //declaring an object of Class Scanner
        scan = new Scanner(System.in); //allocating

        */
        Scanner scan = new Scanner(System.in); //common
        System.out.println("Give me some number");
        x=scan.hasNextInt(); //getting the integer and storing in x
        if(x==true)
            System.out.println("You have entered a number");
        else
            System.out.println("You have not entered a number");

    }
}
