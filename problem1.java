import java.util.Scanner;
public class problem1 {
    //I have to add n natural numbers
    //n=100, 1+2+3+4+5....+100
    //for loop
    //i,sum
    public static void main(String[] args) {
        int i,sum=0,n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        n=scan.nextInt(); //10
        for(i=1;i<=n;i++)
        {
            sum=sum+i; //sum+=i
        }
        System.out.println(sum);
    }
}

