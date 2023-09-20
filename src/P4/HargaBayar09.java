package P4;

import java.util.Scanner;

public class HargaBayar09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int harga, jumlah, halbuku;
        String merk;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukkan merk barang yang dibeli: ");
        merk=input09.nextLine();

        System.out.println("Masukkan jumlah halaman barang yang dibeli: ");
        halbuku=input09.nextInt();

        System.out.println("Masukkan harga barang yang dibeli: ");
        harga=input09.nextInt();

        System.out.println("Masukkan Jumlah barang yang dibeli: ");
        jumlah=input09.nextInt();

        System.out.println("Masukkan diskon barang yang dibeli: ");
        dis=input09.nextDouble();


        total=harga*jumlah;
        jmlDis= total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);

    }
}
