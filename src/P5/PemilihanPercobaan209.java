package P5;

import java.util.Scanner;

public class PemilihanPercobaan209 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        float uas, uts, kuis, tugas, nilaiAkhir;

        System.out.print("Masukkan nilai UAS: ");
        uas = input09.nextFloat();

        System.out.print("Masukkan nilai UTS: ");
        uts = input09.nextFloat();

        System.out.print("Masukkan nilai Kuis: ");
        kuis = input09.nextFloat();

        System.out.print("Masukkan nilai Tugas: ");
        tugas = input09.nextFloat();

        nilaiAkhir = ((uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F));

        String hasil;
        hasil = (nilaiAkhir < 65) ? "remidi" : "tidak remidi";
        System.out.println("Nilai akhir anda adalah " + nilaiAkhir + " sehingga " + hasil);

    }
}
