package P9;

import java.util.Scanner;

public class ArrayRataNilai09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMHS = input09.nextInt();
        input09.nextLine();

        int mhsLulus = 0, mhsTidakLulus = 0;
        int[] nilaiMHS = new int[jmlMHS];
        double totalLulus = 0, totalTidakLulus = 0,
                averageLulus = 0, averageTidakLulus = 0;

        for (int i = 0; i < jmlMHS; i++) {
            System.out.print("Masukkan Nilai Ke-" + (i + 1) + ": ");
            nilaiMHS[i] = input09.nextInt();
            if (nilaiMHS[i] > 70) {
                mhsLulus++;
                totalLulus += nilaiMHS[i];
                averageLulus = totalLulus / mhsLulus;
            } else {
                mhsTidakLulus++;
                totalTidakLulus += nilaiMHS[i];
                averageTidakLulus = totalTidakLulus / mhsTidakLulus;
            }
        }
        System.out.printf("Rata-rata nilai lulus = %.1f\n", averageLulus);
        System.out.printf("Rata-rata nilai tidak lulus = %.1f\n", averageTidakLulus);
    }
}