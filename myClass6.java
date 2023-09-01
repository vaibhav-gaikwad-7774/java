//family
class father //superclass
{
    void earn()
    {
        System.out.println("I am father and I am earning");
    }
    void takeCare()
    {
        System.out.println("I love my family");
    }
}
class mother extends father //inherit the characteristics of father //subclass
{
    void cook()
    {
        System.out.println("I cook for my family");
    }
   /* void earn()
    {
        System.out.println("I am Mother and I am earning");
    }*/
}
public class myClass6 {
    public static void main(String[] args) {
        father Dad=new father();
        mother Mom=new mother();
        Dad.earn();
        Mom.earn();//inheritance

    }
}
