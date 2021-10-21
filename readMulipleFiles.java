import java.io.*;
import java.util.Scanner;
import java.io.File;  
import java.io.FileNotFoundException;

public class readMulipleFiles
{
    public static void main (String[] args)
    {
        File dir = new File("Dir/ToYour/Files");

        if(dir.isDirectory()) {
           for(File file : dir.listFiles()) {
              if(file.isFile()) {
                 //do stuff on a file
              }
           }
        } else {
           //do stuff on a file
        }
    }
}