package P9;

import java.util.Scanner;

public class TugasArray09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jmlElemen = input09.nextInt();

        int[] nilaiElemen = new int[jmlElemen];
        int average = 0, nilaiTertinggi = 0, nilaiTerendah = 0;

        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan elemen ke-" + i + ": ");
            nilaiElemen[i] = input09.nextInt();
            nilaiTertinggi = nilaiElemen[0];
            nilaiTerendah = nilaiElemen[0];
            average += nilaiElemen[i];
            if (nilaiElemen[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiElemen[i];
            } else if (nilaiElemen[i] < nilaiTerendah) {
                nilaiTerendah = nilaiElemen[i];
            }
        }
        System.out.println("Rata-rata = " + (average / jmlElemen));
        System.out.println("Nilai tertinggi = " + nilaiTertinggi);
        System.out.println("Nilai terendah = " + nilaiTerendah);
    }
}
