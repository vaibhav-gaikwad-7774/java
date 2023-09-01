/*
super - keyword in java that will refer to the attribute(variable)of the parent class
super() method -> call the constructor of the parent class
 */
class animal //Parent Class
{
    String color="Black";
    animal()
    {
        System.out.println("I am calling the animal constructor");
    }
    void Sound()
    {
        System.out.println("bow bow");
    }
}
class cat extends animal //subclass
{
    cat()
    {
        System.out.println("I am calling the cat constructor");
    }
    String color="White";
    void Sound()
    {
        System.out.println("meow meow");
    }
    void showColor()
    {
        System.out.println(color);
    }
}
public class myClass128 {
    public static void main(String[] args) {
        cat kitten=new cat();

    }
}
