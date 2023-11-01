package P9;

import java.util.Scanner;

public class ArrayNilai09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan Nilai Ke-" + i + ": ");
            nilaiAkhir[i] = input09.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai Ke-" + i + " adalah " + nilaiAkhir[i]);
        }
    }
}
