package P6;

import java.util.Scanner;

public class Pemilihan2Percobaan109 {
    public static void main(String[] args) {
    Scanner input09 = new Scanner(System.in);
    
    int tahun;
    System.out.print("Masukkan Tahun: ");
    tahun = input09.nextInt();
    
    if (tahun % 4 == 0) {
        if (tahun % 100 !=0) {
            System.out.println("Tahun " + tahun + " adalah tahun kabisat");   
        } else if (tahun % 400 == 0) {
            System.out.println("Tahun " + tahun + " adalah tahun kabisat");
        } else {
            System.out.println("Tahun " + tahun + " bukan tahun kabisat");
        }
    } 
    else {
        System.out.println("Tahun " + tahun + " bukan tahun kabisat");
    }
    
    }
}
