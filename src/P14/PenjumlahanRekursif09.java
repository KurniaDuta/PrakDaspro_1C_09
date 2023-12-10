package P14;

import java.util.Scanner;

public class PenjumlahanRekursif09 {
    static int penjumlahanRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }

    static void printPenjumlahan(int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            result += i;
            if (i <= n - 1) {
                result += " + ";
            }
        }
        System.out.println(result + " = " + penjumlahanRekursif(n));
    }

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input09.nextInt();

        printPenjumlahan(angka);
    }
}
