package P6;

import java.util.Scanner;

public class Pemilihan2Percobaan209 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        float sudut1, sudut2, sudut3, totalSudut;

        System.out.print("Masukkan sudut 1: ");
        sudut1 = input09.nextFloat();
        System.out.print("Masukkan sudut 2: ");
        sudut2 = input09.nextFloat();
        System.out.print("Masukkan sudut 3: ");
        sudut3 = input09.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else {
                System.out.println("Segitiga tersebut bukan segitiga siku-siku");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }

    }
}
