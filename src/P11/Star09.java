package P11;

import java.util.Scanner;
public class Star09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = input09.nextInt();

        for (int i = 1; i <= n; i--) {
            System.out.print("*");
        }
    }
}
