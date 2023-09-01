public class doWhile {
    //doWhile -> first execute, then check
    /* do{
    }while();
     */
    public static void main(String[] args) {
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while(i>2);

        i=1;
        while(i>2)
        {
            System.out.println(i);
            i++;
        }
    }
}
