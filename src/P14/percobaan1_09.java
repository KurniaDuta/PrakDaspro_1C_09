package P14;

public class percobaan1_09 {
    static int faktorialRekusrsif (int n) {
        if (n == 0) {
            return (1);
        } else {
            return (n * faktorialRekusrsif(n - 1));
        }
    }

    static int faktorialIteratif (int n) {
        int faktor = 1;
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        }
        return faktor;
    }

    public static void main(String[] args) {
        System.out.println(faktorialRekusrsif(5));
        System.out.println(faktorialIteratif(5));
    }
}
