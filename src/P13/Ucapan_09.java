package P13;

import java.util.Scanner;

public class Ucapan_09 {
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you.");
    }

    public static String PenerimaUcapan(){
        Scanner input09 = new Scanner(System.in);
        System.out.print("Tulisakan Nama orang yang ingin Anda beri ucapan: ");
        String namaOrang = input09.nextLine();
        input09.close();
        return namaOrang;
    }
}
