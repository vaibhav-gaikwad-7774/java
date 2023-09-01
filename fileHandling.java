import java.io.File; //File is a class
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {
        File text = new File("F:\\hashmap.txt");//instantiating the file class
        Scanner scan; //empty file gives exception
        try
        {
            scan = new Scanner(text);
            while (scan.hasNext())
                System.out.println(scan.next()); //fetch lines
            scan.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("error");
        }
    }
}
