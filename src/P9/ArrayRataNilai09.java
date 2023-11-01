package P9;

import java.util.Scanner;

public class ArrayRataNilai09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int[] nilaiMHS = new int[10];
        double total = 0;
        double average;

        for (int i = 0; i < nilaiMHS.length; i++) {
            System.out.print("Masukkan Nilai Ke-" + (i + 1) + ": ");
            nilaiMHS[i] = input09.nextInt();
        }
        for (int i = 0; i < nilaiMHS.length; i++) {
            total += nilaiMHS[i];
        }
        average = total / nilaiMHS.length;
        System.out.println("Rata-rata Nilai Mahasiswa = " + average);
    }
}