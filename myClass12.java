//HashSet -> no indices, unordered
import java.util.HashSet;
public class myClass12 {
    public static void main(String[] args) {
        HashSet numbers=new HashSet();
        numbers.add(1); //1 is an integer
        numbers.add(2.0);
        numbers.add("Three");
        numbers.add("four");
        numbers.remove(2.0);
        numbers.add(2.5);
        numbers.size();
        //System.out.println(numbers.get(4));
       // System.out.println(numbers.size());
       // System.out.println(numbers.contains('1')); //1 is a character
        //numbers.clear();
        System.out.println(numbers);

        //System.out.println(numbers);
    }
    /*
    add()
    remove()
    get()
    contains()
    clear()
     */
}
