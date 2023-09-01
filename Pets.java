public interface Pets //completely abstract
{
    String color = null; //null means no value
    void sound();
    void eatFood();
    void protect();

}
interface Animal
{
    void noSpeech();
}
class Dog implements Pets,Animal
{

    public void sound()
    {
        System.out.println("Bow bow");
    }
    public void eatFood()
    {
        System.out.println("Biscuits");
    }
    public void protect()
    {
        System.out.println("I am protecting you");
    }

    public void noSpeech() {
        System.out.println("I could'nt speak");
    }
}
class Cat implements Pets
{
    public void sound()
    {
        System.out.println("Meow Meow");
    }
    public void eatFood()
    {
        System.out.println("Fish");
    }
    public void protect()
    {
        System.out.println("I am protecting you and I am your cute kitty");
    }
}
class myClass9
{
    public static void main(String[] args) {
        Dog puppy=new Dog();
        puppy.sound();
    }
}