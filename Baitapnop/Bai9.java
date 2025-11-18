import java.util.Scanner;

public class Bai9 {
    
    public static void main(String[] args) {

        Scanner sc= new Scanner((System.in));

        System.out.print("Xin moi nhap chuoi:");
        String N = sc.nextLine();
        System.out.println("Do dai chuoi la:"+N.length());
        N=N.trim().replaceAll("\\s+", " ");
        System.out.println("Chuoi sau khi xoa cac khoang trang la :"+N.trim());


        int count=N.length();
        System.out.println("So tu trong chuoi la:"+count);

        for(char w:N.toCharArray())
        {
            System.out.println(w);
        }

        System.out.print("Nhao so tu nhien k");
        int k=sc.nextInt();
         
        String left=N.substring(0, k);

        String right=N.substring(N.length(), k);

         System.out.println(k + " ky tu ben trai: " + left);
         System.out.println(k + " ky tu ben phai: " + right);
        System.out.print("Nhap so tu nhien g: ");
        int g = sc.nextInt();
        System.out.print("Nhap so tu nhien n: ");
        int n = sc.nextInt();

        if (g >= 0 && g + n <= N.length()) {
            String sub = N.substring(g, g + n);
            System.out.println(n + " ky tu cua chuoi N ke tu vi tri " + g + " la: " + sub);
        } else {
            System.out.println("Gia tri g va n khong hop le.");
        }
        sc.close();
    }
}
