package P11;

import java.util.Scanner;

public class NestedLoop_2341720139 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        double temps[][] = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = input09.nextDouble();
            }
            System.out.println();
        }

        int kotaIndex = 1;
        for (double[] kota : temps) {
            System.out.print("Kota ke-" + kotaIndex++ + ": ");
            double totalTemp = 0;

            for (double temperature : kota) {
                System.out.print(temperature + " ");
                totalTemp += temperature;
            }

            double averageTemp = totalTemp / kota.length;
            System.out.printf("\nRata-rata suhu: %.1f", averageTemp);

            System.out.println();
        }
    }
}
