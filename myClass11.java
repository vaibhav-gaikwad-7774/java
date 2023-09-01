public class myClass11 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c;
        try
        {
            c=a/b; //not an exception
        }
        catch(Exception e)
        {
            System.out.println("a/b is not possible");
        }
        finally
        {
            System.out.println("No errors");
            c=a/b;
        }


        System.out.println("Hello world");
        System.out.println(c);

    }

}
