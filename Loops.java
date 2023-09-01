public class Loops {
    //loops are repititions
    //loops - while, for, do while
    //while loop
    //iteration - a cycle
    /*
    while(condition)
    {
        statements;
        i++;
    }
     */
    public static void main(String[] args) {
        int i = 1; //i=1
        //infinite loop - the condition doesn't become false
        while (true) {
            System.out.println(i);
            i++;
            if(i==1001)
            {
                break;
            }

        }
    }
}