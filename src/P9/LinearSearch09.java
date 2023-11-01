package P9;

import java.util.Scanner;

public class LinearSearch09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jmlElemen = input09.nextInt();

        int[] arrayInt = new int[jmlElemen];
        int key, hasil =0, i;

        for (i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen ke-" + i + ": ");
            arrayInt[i] = input09.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari: ");
        key = input09.nextInt();
        for (i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
            hasil = i;
            break;
            }
        }
        System.out.println("Key ada dalam array pada posisi index ke-" + hasil);
    }
}