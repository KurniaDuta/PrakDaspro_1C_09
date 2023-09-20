package P4;

import java.util.Scanner;

/**
 * Lingkaran09
 */
public class Lingkaran09 {

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int r;
        double phi= 3.14, keliling, luas;

        System.out.println("Maasukkan jari-jari lingkaran: ");
        r =  input09.nextInt();

        keliling = 2*phi*r;
        luas = phi*r*r;

        System.out.println(keliling);
        System.out.println(luas);

    }
}