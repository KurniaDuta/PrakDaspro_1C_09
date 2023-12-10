package P14;

import java.util.Scanner;

public class CekPrimaRekursif09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int num = input.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " adalah bilangan prima");
        } else {
            System.out.println(num + " bukan bilangan prima");
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            return isPrimeRecursive(num, num - 1);
        }
    }

    private static boolean isPrimeRecursive(int num, int divisor) {
        if (divisor <= 1) {
            return true;
        } 
        if (num % divisor == 0) {
            return false;
        }
        return isPrimeRecursive(num, divisor - 1);
    }
}
