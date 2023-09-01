package actualcodes;

//user input
import java.util.Scanner;
public class arrays
{
    public static void main(String[] args) {
        int[] arr;//not initialising any values
        int n;
        arr=new int[1000];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size");
        n=scan.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();

        }
        System.out.println("The array elements are");
        for(int i=0;i<n;i++) //n=5
        {
            System.out.println(arr[i]);

        }

    }
}