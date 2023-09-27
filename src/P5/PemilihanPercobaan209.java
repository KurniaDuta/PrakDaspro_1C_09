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

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            System.out.print("Nilai akhir anda adalah " + nilaiAkhir + " sehingga " + hasil + " dan nilai huruf anda A");
        } 
        else if (nilaiAkhir > 73 && nilaiAkhir <=80) {
            System.out.print("Nilai akhir anda adalah " + nilaiAkhir + " sehingga " + hasil + " dan nilai huruf anda B+");
        }
        else if (nilaiAkhir > 65 && nilaiAkhir <=73) {
            System.out.print("Nilai akhir anda adalah " + nilaiAkhir + " sehingga " + hasil + " dan nilai huruf anda B");
        }
        else if (nilaiAkhir > 60 && nilaiAkhir <=65) {
            System.out.print("Nilai akhir anda adalah " + nilaiAkhir + " sehingga " + hasil + " dan nilai huruf anda C+");
        }
        else if (nilaiAkhir > 50 && nilaiAkhir <=60) {
            System.out.print("Nilai akhir anda adalah " + nilaiAkhir + " sehingga " + hasil + " dan nilai huruf anda C");
        }
        else if (nilaiAkhir > 39 && nilaiAkhir <=50) {
            System.out.print("Nilai akhir anda adalah " + nilaiAkhir + " sehingga " + hasil + " dan nilai huruf anda D");
        }
        else if (nilaiAkhir > 0 && nilaiAkhir <=39) {
            System.out.print("Nilai akhir anda adalah " + nilaiAkhir + " sehingga " + hasil + " dan nilai huruf anda E");
        }
        else {
            System.out.println("Nilai salah");
        }
    }
}
