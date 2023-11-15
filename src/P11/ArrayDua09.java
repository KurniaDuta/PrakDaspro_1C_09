package P11;

import java.util.Scanner;

public class ArrayDua09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        int[][] data = new int[4][4];
        int jam[] = { 3, 6, 9, 12 };
        int min[] = { 100, 100, 100, 100 };
        double total[] = { 0, 0, 0, 0 };
        double rata[] = { 0, 0, 0, 0 };
        int kecepatanAngin[] = new int[4];
        int max[] = { 0, 0, 0, 0 };

        for (int i = 0; i < data.length; i++) {
            System.out.printf("Jam %s\n", jam[i]);
            for (int j = 0; j < data[0].length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Masukkan suhu: ");
                        data[i][j] = input09.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        } else if (max[j] < data[i][j]) {
                            max[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 1:
                        System.out.print("Masukkan kelembaban: ");
                        data[i][j] = input09.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        } else if (max[j] < data[i][j]) {
                            max[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 2:
                        System.out.print("Masukkan kecepatan angin: ");
                        data[i][j] = input09.nextInt();
                        kecepatanAngin[i] = data[i][j];
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        } else if (max[j] < data[i][j]) {
                            max[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    case 3:
                        System.out.print("Masukkan index UV: ");
                        data[i][j] = input09.nextInt();
                        if (min[j] > data[i][j]) {
                            min[j] = data[i][j];
                        } else if (max[j] < data[i][j]) {
                            max[j] = data[i][j];
                        }
                        total[j] += data[i][j];
                        break;
                    default:
                        break;
                }
                rata[j] = total[j] / data[0].length;
            }
        }
        System.out.println("-----------------");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("-----------------");
        System.out.println("Data Kecepatan Angin");
        for (int i = 0; i < kecepatanAngin.length; i++) {
            System.out.println("Jam " + jam[i] + ": " + kecepatanAngin[i] + " ");
        }
        System.out.println("-----------------");
        System.out.printf("Rata-rata suhu: %.2f\n", rata[0]);
        System.out.printf("Presentase kelembaban terendah: %s\n", min[1]);
        System.out.printf("Suhu tertinggi: %s\n", max[0]);
        System.out.printf("Kelembaban tertinggi: %s\n", max[1]);
        System.out.printf("Kecepatan angin tertinggi: %s\n", max[2]);
        System.out.printf("Index UV tertinggi: %s\n", max[3]);
    }
}
