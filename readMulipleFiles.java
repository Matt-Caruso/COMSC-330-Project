/*
    MAIN FILE THAT WORKS AND SCANS MULTIPLE FILES TO GET NUMERICAL VALUES

    Matt Caruso
    10/24/21
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readMulipleFiles
 {
    public static  double[] numArr = new double[70];
    public static int nextIndex = 0;
    public static String line ="hello";//placeholder

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
                
                char h;
           
                try
                 {
                    inputStream = new BufferedReader(new FileReader(file));
                    while ((line = inputStream.readLine()) != null) 
                    {
                     h = line.charAt(line.length()-1);  
                     if(h == 'A' || h == 'B' || h == 'C' || h == 'D' || h == 'F')
                     {
                         switches(h); //make method
                         
                     }
                     else if(h == '+')
                     {
                        switches(h);
                     }
                     else if (h == '-')
                     {
                        switches(h);
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

        // for(int i = 0; i <= numArr.length -1; i++)
        // {
        //     System.out.println(numArr[i]);
        // }
        
	}

    public static void switches(char h)//converts chars into nums-method
    {
        double temp = 0;
        
        switch(h)
        {
            case 'A':  
            {
                push(4.0);
                System.out.println(4.0);
            }
                     break;
            case 'B':  
            {
                push(3.0);
                System.out.println(3.0);

            }
                    break;
            case 'C':  
            {
               push(2.0);
               System.out.println(2.0);

            }
                    break;  
            case '+':  
            {
                char c;
                c = line.charAt(line.length()-2);
                double xx = convert(c);
                push(xx +.333);
                System.out.println(xx+.333);

            }
                    break;          
            case '-':  
            {
                char c;
                c = line.charAt(line.length()-2);
                double xx = convert(c);
                push(xx - .333);
                System.out.println(xx-.333);

            }
                    break;
            default: System.out.println("");
            }
    }

    public static void push(double num)
    {
        int nextindex =0;
        numArr[nextindex] = num;
        nextindex++;
    }

    public static double convert(char h)//converts chars into nums-method
    {
        double temp = 0;
        
        switch(h)
        {
            case 'A':  
            {
                temp = 4.0;
            }
               break;      
            case 'B':  
            {
                temp = 3.0;
            }
                break;
            case 'C':  
            {
               temp = 2.0;
            }
            break;
        }
        return temp;
}
 }