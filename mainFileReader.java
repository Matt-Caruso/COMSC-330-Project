/*
    MAIN FILE THAT WORKS AND SCANS MULTIPLE FILES TO GET NUMERICAL VALUES

    Matt Caruso
    10/24/21
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class mainFileReader
 {
    public static  double[] numArr = new double[50];

    public static void main(String[] args) throws IOException
    {  
        File dir = new File("C:\\Users\\Matthew Caruso\\Documents\\rwu\\COMSC330\\COMSC-330-Project\\textFiles");//Will have to change this depending on your directory--copy path that leads to text files and past inbetween""
        File[] files = dir.listFiles();//creates file based off directory
        char[] arr = new char[50];//array for characters
        // Fetching all the files
        for (File file : files) //loops through all files in folder
        {
            if(file.isFile()) 
            {
                BufferedReader inputStream = null;
                String line = "";//placeholder
                char h;
                int x = 0;
           
                try
                 {
                    inputStream = new BufferedReader(new FileReader(file));
                    while ((line = inputStream.readLine()) != null) 
                    {
                     h = line.charAt(line.length()-1);  
                     if(h == 'A')
                     {
                        numArr[x] = 4.0;
                        x++;
                         
                     }
                     else if(h == 'B')
                     {
                        numArr[x] = 3.0;
                        x++;
                         
                     }
                     else if(h == 'C')
                     {
                        numArr[x] = 2.0;
                        x++;
                         
                     }
                     else if(h == 'D')
                     {
                        numArr[x] = 1.0;
                        x++;
                         
                     }
                     else if(h == '+')
                     {
                        h = line.charAt(line.length()-2);
                        if(h == 'A')
                     {
                        numArr[x] = 4.333;
                        x++;
                         
                     }
                     else if(h == 'B')
                     {
                        numArr[x] = 3.333;
                        x++;
                         
                     }
                     else if(h == 'C')
                     {
                        numArr[x] = 2.333;
                        x++;
                         
                     }
                         
                     }
                     else if(h == '-')
                     {
                        h = line.charAt(line.length()-2);
                        if(h == 'A')
                     {
                        numArr[x] = 3.67;
                        x++;
                         
                     }
                     else if(h == 'B')
                     {
                        numArr[x] = 3.333;
                        x++;
                         
                     }
                     else if(h == 'C')
                     {
                        numArr[x] = 2.333;
                        x++;
                         
                     }
                         
                         
                     }
                    }
                } catch(IOException e) 
                {
                	System.out.println(e);
                }
                finally 
                {
                    if (inputStream != null) 
                    {
                        inputStream.close();
                    }
                }
            }
        }

        for(int i = 0; i <= numArr.length -1; i++)
        {
            System.out.println(numArr[i]);
        }
        for(int i = 0; i <= numArr.length -1; i++)
        {
            System.out.println(numArr[i]);
        }
	}

}