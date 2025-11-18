import java.util.Scanner;

public class Bai3 {
    public static void main(String[] agrs)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Xin moi nhap ban kinh:");
        float r=sc.nextFloat();

        Float a=2*r*(float)Math.PI;
        Float c=(float)Math.PI*r*r;

        System.out.println("Chuvihinhtronla"+a);
        System.out.println("Dientichhinhtronla:"+c);

        sc.close();
        

    }
}
