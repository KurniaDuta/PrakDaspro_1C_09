package P10;

import java.util.Scanner;

public class BioskopWithScanner09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int baris, kolom, choice;
        String nama, next;

        String[][] penonton = new String[4][2];

        System.out.print("\033[H\033[2J");
        System.out.flush();

        do {

            System.out.println("\nSelamat datang di bioskop 4D!");
            System.out.println("\n+---------Daftar Menu---------+");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            choice = input09.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama penonton: ");
                        nama = input09.next();
                        input09.nextLine();
                        System.out.print("Masukkan baris: ");
                        baris = input09.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = input09.nextInt();
                        input09.nextLine();

                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.print("Apakah ada penonton lain? (y/n): ");
                        next = input09.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("\n+---------Data Penonton---------+");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            baris = i + 1;
                            kolom = j + 1;
                            nama = penonton[i][j];
                            System.out.printf("Baris %d, Kolom %d: %s\n", baris, kolom, nama);
                        }
                    }
                    // for (int i = 0; i < penonton.length; i++) {
                    //     System.out.println("Baris " + (i + 1) + ": " + String.join(", ", penonton[i]));
                    // }
                    break;

                case 3:
                    break;

                default:
                    break;
            }
        } while (choice != 3);
    }
}