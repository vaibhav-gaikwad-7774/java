
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        File file1=new File("F:\\hashmap.txt");
        Scanner read;

        {
            try {
                read = new Scanner(file1);
                while (read.hasNext())
                {
                    System.out.println(read.next());
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }


}
