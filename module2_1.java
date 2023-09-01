public class module2_1 {
    // I am gonna check whether a student passed or not.
    //if he scores above 80, i am gonna print excellent
    // pass marks=>40
    public static void main(String[] args) {
        int score=45;
        if(score>40)
        {
            System.out.println("PASS");
            if(score>=80)
            {
                System.out.println("excellent");
            }
        }
        else
        {
            System.out.println("FAIL");
        }
    }

}