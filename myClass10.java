//Anonymous Classes
class Mobile
{
    void turnOn()
    {
        System.out.println("I am turning on successfully");
    }
}

public class myClass10 {

    public static void main(String[] args) {
        Mobile model1=new Mobile()
        {
            @Override
            void turnOn()
            {
                System.out.println("System crashed with bugs");
            }
        };
        model1.turnOn();
    }
}
