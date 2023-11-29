package P13;

import java.util.Scanner;

public class Percobaan6_09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang: ");
        p = input09.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input09.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input09.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang: " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok: " + vol);
    }

    static int hitungLuas(int pjg, int lb) {
        int luas = pjg * lb;
        return luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
}
