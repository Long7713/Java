import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Xin moi nhao so bat ky:");
        int a=sc.nextInt();
        
        for(int i=2;i*i<=a;i++)
        {
            if(a%i==0)
            System.out.println("So nay khong phai so nguyen to:"+a);
            else
            System.out.println("So nay la so nguyen to:"+a);
        }
        sc.close();


    }
    
}
