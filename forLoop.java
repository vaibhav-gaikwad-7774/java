public class forLoop {
    //for loop - syntax varies, when you know the no. of iterations.
    //problem - even numbers from 1 to 50
    public static void main(String[] args) {
        int i=1, n=50; //start,stop
        for(;i<=n;)//for(initialization;condition;increment/decrement)
        {
            if(i%2==0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
