import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        int i,fact=1,n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        n=scan.nextInt(); //10
        for(i=1;i<=n;i++)
        {
           fact=fact*i;//1*2*3*4*5
        }
        System.out.println(fact);
    }
}
