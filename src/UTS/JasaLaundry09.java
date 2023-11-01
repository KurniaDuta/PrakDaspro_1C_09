package UTS;

import java.util.Scanner;

public class JasaLaundry09 {
    public static void main(String[] args) {
        Scanner duta09 = new Scanner(System.in);
        Scanner dutaka09 = new Scanner(System.in);

        String nama09 = "", alamat09 = "", noHP09 = "";
        int berat09 = 0;
        double biayaLaundry09 = 0, diskon09 = 0, kembalian09 = 0, totalDiskon09, uang09 = 0, totalBiayaLaundry09 = 0,
                totalPembayaran09 = 0;
        char pilihMenu09, back09, jenisLayanan09 = ' ', layananTambahan09 = ' ', cetak09, bayarUlang09 = ' ';

        System.out.println("====== UTS PRAKTIKUM DASAR PEMROGRAMAN ======");
        System.out.println("dibuat oleh: Duta Kurnia Ardhani");
        System.out.println("NIM: 2341720139");
        System.out.println("==============================================");

        do {

            System.out.println("Pilih Menu:");
            System.out.println("1. Data Customer");
            System.out.println("2. Biaya Laundry");
            System.out.print("menu: ");
            pilihMenu09 = duta09.nextLine().charAt(0);

            switch (pilihMenu09) {
                case '1':
                    System.out.println("Data Customer");
                    System.out.println("Masukkan Data Customer");

                    System.out.print("\nNama Customer: ");
                    nama09 = duta09.nextLine();

                    System.out.print("Alamat Customer: ");
                    alamat09 = duta09.nextLine();

                    System.out.print("No HP Customer: ");
                    noHP09 = duta09.nextLine();

                    System.out.print("jenis layanan (1. Cuci Kering, 2. Cuci Setrika, 3. Setrika saja): ");
                    jenisLayanan09 = dutaka09.nextLine().charAt(0);

                    System.out.print("Layanan tambahan (1. Express 2. Biasa): ");
                    layananTambahan09 = dutaka09.nextLine().charAt(0);

                    System.out.print("Berat Pakaian (kg): ");
                    berat09 = duta09.nextInt();

                    duta09.nextLine();
                    System.out.println("Apakah anda ingin mencetak data customer? (y/t)");
                    cetak09 = dutaka09.nextLine().charAt(0);
                    if (cetak09 == 'y' || cetak09 == 'Y') {
                        System.out.println("==================================================");
                        System.out.println("Data Customer");
                        System.out.println("==================================================");
                        System.out.println("Nama: " + nama09);
                        System.out.println("Alamat: " + alamat09);
                        System.out.println("NoHP: " + noHP09);
                        System.out.println("Jenis Layanan: " + jenisLayanan09);
                        System.out.println("Layanan Tambahan: " + layananTambahan09);
                        System.out.println("Berat Pakaian: " + berat09);

                    }
                    break;
                case '2':
                    if (nama09.isEmpty() || alamat09.isEmpty() || noHP09.isEmpty() || berat09 == 0
                            || jenisLayanan09 == ' ' || layananTambahan09 == ' ' || berat09 == 0) {
                        System.out.println("Masukkan data Customer terlebih dahulu");
                    } else {
                        System.out.println("==================================================");
                        System.out.println("Detail Pembayaran");
                        System.out.println("==================================================");
                        System.out.println("nama: " + nama09);

                        // Menghitung jenis Layanan
                        switch (jenisLayanan09) {
                            case '1':
                                biayaLaundry09 = 4000;
                                break;
                            case '2':
                                biayaLaundry09 = 5000;
                                break;
                            case '3':
                                biayaLaundry09 = 3500;
                                break;
                            default:
                                break;
                        }
                        totalBiayaLaundry09 = biayaLaundry09 * berat09;

                        // Menghitung Layanan Tambahan
                        if (layananTambahan09 == '1') {
                            totalBiayaLaundry09 += 10000;
                        }

                        // Menghitung Diskon
                        if (berat09 > 10) {
                            diskon09 = 0.1;
                            if (berat09 > 15) {
                                diskon09 = 0.2;
                            }
                        }
                        totalDiskon09 = totalBiayaLaundry09 * diskon09;

                        totalPembayaran09 = (totalBiayaLaundry09 - totalDiskon09);

                        System.out.println("Biaya laundry sebelum diskon: " + totalBiayaLaundry09);
                        System.out.println("diskon: " + totalDiskon09);
                        System.out.println("Pembayaran: " + totalPembayaran09);

                        do {
                            System.out.println("Masukkan jumlah uang: ");
                            uang09 = duta09.nextInt();

                            duta09.nextLine();

                            if (uang09 < totalPembayaran09) {
                                System.out.println("Uang kurang");
                            } else {
                                kembalian09 = (uang09 - totalPembayaran09);
                                System.out.println("Kembalian " + kembalian09);
                            }
                            System.out.println("Apakah anda ingin membayar ulang? (y/t)");
                            bayarUlang09 = dutaka09.nextLine().charAt(0);
                        } 
                        while (bayarUlang09 == 'y' || bayarUlang09 == 'Y');
                        break;  
                    } break;
                default:
                    System.out.println("Masukkan menu yang benar");
                    break;
            }
            System.out.println("Apakah anda ingin kembali ke menu? (y/t)");
            back09 = duta09.nextLine().charAt(0);
        } while (back09 == 'y' || back09 == 'Y');
        duta09.close();
        dutaka09.close();
    }
}
