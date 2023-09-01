class accessories{
    //getters and setters =>Twin Brothers
    //this keyword => current object
    String color; //attribute
    int size;
    accessories(String c) {
        setColor(c);
    }
    void setSize(int s) //s=10
    {
        this.size=s;
    }
    void setColor(String c)
    {
        //c="black"
        this.color=c; //this refers to ipod
        //ipod.color="black"
    }
    int getSize()
    {
        return size;
    }
    String getColor()
    {
        return color;
    }


}
public class myClass3
{
    public static void main(String[] args) {
        accessories ipod=new accessories("black"); //ipod
        //ipod.setColor("white");
        //ipod.setColor("Black"); //now the color is black
        ipod.setSize(10);
        System.out.println(ipod.getColor());
        System.out.println(ipod.getSize());
    }
}
