package P7;

import java.util.Scanner;

public class WhileGaji09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = input09.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan ke-" + (i + 1) + ": ");
            jabatan = input09.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahJamLembur = input09.nextInt();
            
            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } 
            
            totalGajiLembur += gajiLembur;
            i++;
        }
        System.out.println("Total gaji lembur: " + totalGajiLembur);

        input09.close();

    }
}
