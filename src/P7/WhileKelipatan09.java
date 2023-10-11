package P7;

import java.util.Scanner;

public class WhileKelipatan09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0, i = 1;

        System.out.print("Masukkan kelipatan (1-9): ");
        kelipatan = input09.nextInt();

        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        i++;
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1-50 adalah %d\n", kelipatan, jumlah);

        double average = (double) jumlah / counter;
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1-50 adalah %.1f\n", kelipatan, average);

        input09.close();
    }
}
