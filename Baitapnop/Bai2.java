import java.util.Scanner;

public class Bai2 
{
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
  
  System.out.print("Nhap chieu dai:");
  int a=sc.nextInt();
  System.out.print("Nhap chieu rong");
  int b=sc.nextInt();

  
  int Chuvi=(a+b)*2;
  int Dientich=a*b;
  
System.out.println("Chuvihinhchunhatla"+Chuvi);
System.out.println("Dientichhinhchunhat:"+Dientich);

  sc.close();
}
}
    
