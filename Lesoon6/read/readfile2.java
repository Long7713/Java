package Lesoon6.read;

import java.io.BufferedReader;
import java.io.FileReader;

public class readfile2 {
    public static void main(String[] args) {
        try {
            BufferedReader input = new BufferedReader(new FileReader("data.txt"));
            String line = input.readLine();
            while (line != null) {
                // chia chuỗi thành các chuỗi con phân cách bởi dấu phẩy
                String[] arr = line.split(",");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
                line = input.readLine();
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
