package P4;

import java.util.Scanner;

/**
 * Lingkaran09
 */
public class Lingkaran09 {

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int r;
        double keliling, luas;

        System.out.println("Maasukkan jari-jari lingkaran: ");
        r =  input09.nextInt();

        keliling = 2*3.14*r;
        luas = 3.14*r*r;

        System.out.println(keliling);
        System.out.println(luas);

    }
}