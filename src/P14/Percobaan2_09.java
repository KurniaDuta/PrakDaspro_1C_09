package P14;

import java.util.Scanner;

public class Percobaan2_09 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }

    static void deretPangkat(int x, int y) {
        System.out.print(x + "^" + y + " = ");
        for (int i = 1; i <= y; i++) {
            System.out.print(x);
            if (i < y) {
                System.out.print("x");
            }
        }
        System.out.println(" = " + hitungPangkat(x, y));
    }

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = input09.nextInt();
        System.out.print("Pangkat: ");
        pangkat = input09.nextInt();

        deretPangkat(bilangan, pangkat);
    }
}
