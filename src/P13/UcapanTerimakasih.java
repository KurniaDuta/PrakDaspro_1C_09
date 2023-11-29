package P13;

import java.util.Scanner;

public class UcapanTerimakasih {
    public static String PenerimaUcapan(){
        Scanner input09 = new Scanner(System.in);
        System.out.print("Tulisakan Nama orang yang ingin Anda beri ucapan: ");
        String namaOrang = input09.nextLine();
        input09.close();
        return namaOrang;
    }
    
    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
    }

    
}
