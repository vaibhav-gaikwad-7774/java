abstract class atm //parent class,superclass
{
    void ShowDisplay() //visible
    {
        System.out.println("Welcome to our bank");

    }
    abstract void fetchMoney(); //do you actually see what happens when you try to fetch Money?

}
class Engineer extends atm //subclass
{
    public void fetchMoney()
    {
       System.out.println("I am working good");
    }
}

public class myClass7 {
    public static void main(String[] args) {
        Engineer MASK=new Engineer();
        MASK.ShowDisplay();
        MASK.fetchMoney();
    }

}
