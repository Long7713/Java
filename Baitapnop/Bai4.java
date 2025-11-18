import java.util.Scanner;

public class Bai4 {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Xin moi nhap so nguyen:");
        int a=sc.nextInt();

        if(a%2==0)
        {
            System.out.println("So vua nhap la so chan:"+a);
        }
        else
        {
            System.out.println("So vua njap la so le:"+a);
        }
        sc.close();

    }
}
