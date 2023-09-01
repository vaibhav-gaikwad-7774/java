import java.util.Scanner;
public class Pattern
{
    public static void main(String[] args) {
        int i,j,n;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the no. of lines");
        n=scan.nextInt(); //n=5
        for(i=1;i<=n;i++) //outer loop will tc of no. of rows //i=5
        {
            for(j=1;j<=i;j++) //1
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}