package P7;

import java.util.Scanner;

public class DoWhileCuti09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int jatahCuti, jumlahhari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = input09.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = input09.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari cuti: ");
                jumlahhari = input09.nextInt();
                
                if (jumlahhari <= jatahCuti) {
                    jatahCuti -= jumlahhari;
                    System.out.println("Sisa jatah cuti Anda: " + jatahCuti);
                } 
                else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                    break;
                }
            }
        } while (jatahCuti > 0);

        input09.close();
    }
}
