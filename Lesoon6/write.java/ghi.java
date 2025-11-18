import java.io.FileWriter;

public class ghi {
        public static void main(String[] args) 
        {
                try     
                {
                    FileWriter fw=new FileWriter("data.txt");
                    fw.write("Hello Word");
                    fw.close();
                }
                catch (Exception e){
                System.out.print(e);}
        }

    
}
