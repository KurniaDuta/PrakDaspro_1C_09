package P14;

import java.util.Scanner;

public class Percobaan3_09 {
    static double hitungLaba(double saldo, double tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.print("Jumlah saldo awal: ");
        double saldoAwal = input09.nextInt();
        System.out.print("Lamanya investasi (tahun): ");
        int tahun = input09.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + " tahun: ");
        System.out.println(hitungLaba(saldoAwal, tahun));
    }
}
