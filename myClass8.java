class Person //parent class
{
    void showAge() //implementation 1
    {
        System.out.println("My age is between 1 year to 100 years");
    }
}
class Kid extends Person
{
    void showAge() //implementation 2
    {
        System.out.println("My age is 8"); //implementation is different
    }
}
class Teenager extends Person
{
    void showAge() //implementation 3
    {
        System.out.println("My age is 18"); //implementation is different
    }

}

public class myClass8 {
    public static void main(String[] args) {
        Kid kidobj=new Kid();
        kidobj.showAge();
    }

}
