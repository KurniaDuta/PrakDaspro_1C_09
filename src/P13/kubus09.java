package P13;

import java.util.Scanner;

public class kubus09 {
    static int permukaan(int s) {
        return 6 * s * s;
    }

    static int volume(int s) {
        return s * s * s;
    }

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: ");
        int s = input09.nextInt();

        System.out.println("Luas permukaan kubus = " + permukaan(s));
        System.out.println("Volume kubus = " + volume(s));
    }
}
