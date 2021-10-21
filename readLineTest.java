import java.io.*;
import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
public class readLineTest
{
    public static void main (String[] args)
    {
        try {
            File myObj = new File("file.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
   
    }
}