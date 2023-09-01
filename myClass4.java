class mobiles
{
    //constructor - classname
    mobiles() //this does not take any argument
    {
        System.out.println("You have created V1 of mobiles");
    }
    mobiles(String c)
    {
        System.out.println(c);
    }
    mobiles(String c,String d)
    {

    }

}

public class myClass4 {
    public static void main(String[] args) {
        mobiles V1=new mobiles();
        mobiles V2=new mobiles("M31","H31");
    }
}
