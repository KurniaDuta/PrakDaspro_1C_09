package P5;

import java.util.Scanner;

public class PemilihanPercobaan109 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner (System.in);

        System.out.print("Masukkan angka: ");
        int angka = input09.nextInt();

        String hasil;
        hasil = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println(angka + " adalah " + hasil);

        // if (angka % 2 == 0) {
        //     System.out.println("Angka "+angka+" bilangan genap");
        // }
        // else {
        //     System.out.println("Angka "+angka+" bilangan ganjil");
        // }
    }
}
