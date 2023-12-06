package P14;

import java.util.Scanner;

public class DescendingRekursif09 {
    static int descendingRekursif(int n) {
        if (n == 0) {
            System.out.println(0);
            return 0;
        } else {
            System.out.print(n + " ");
            return descendingRekursif(n - 1);
        }
    }

    static int descendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input09.nextInt();
        
        System.out.println("\nDescending Rekursif: ");
        descendingRekursif(angka);
        System.out.println("Descending Iteratif: ");
        descendingIteratif(angka);
    }
}
