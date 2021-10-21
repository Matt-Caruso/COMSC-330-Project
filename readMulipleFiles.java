import java.io.*;
import java.util.Scanner;
import java.io.File;  
import java.io.FileNotFoundException;
//PUT ALL TXT FILES INTO SEP FOLDER --> CHANGE DIRECTORY TO THAT PATH
public class readMulipleFiles
{
    public static void main (String[] args)
    {
        File dir = new File("C:\\Users\\Matthew Caruso\\Documents\\rwu\\COMSC330\\COMSC-330-Project");

        if(dir.isDirectory()) {
           for(File file : dir.listFiles()) {
              if(file.isFile()) {
               try {
                  File myObj = new File("file.txt"); //creates file obj
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
        } else {
           System.out.println("");
        }
    }
}