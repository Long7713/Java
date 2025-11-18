package Lesoon6.read;

import java.io.BufferedReader;
import java.io.FileReader;

public class readfile {
    public static void main(String[] args) {
        try
        {
            BufferedReader input=new BufferedReader(new FileReader("data.txt"));
            String line=input.readLine();
            while (line!=null)
            {
                System.out.println(line);
                line=input.readLine();

            }
            input.close();
        } 
            catch(Exception ex)
            {ex.printStackTrace();}
    }
    
}
