class Car {
    //static methods don't need instances
    int mileage,seating_capacity; //attributes
    private void run()
    {
        System.out.println("I am running");
        //statements
    }

}
public class myClass
{
    public static void main(String[] args) {
        //instantiating the class
        Car model1=new Car();
        model1.mileage=50;
        model1.seating_capacity=4;
        Car model2=new Car();
        model2.mileage=60;
        model2.seating_capacity=6;
        System.out.println(model2.seating_capacity);
    }
}
