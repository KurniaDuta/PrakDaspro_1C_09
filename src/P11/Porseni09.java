package P11;

import java.util.Arrays;

public class Porseni09 {
    public static void main(String[] args) {
        String[] caborPorseni = { "Badminton", "Tenis Meja", "Basket", "Voli" };
        String[][] atletCabor = {
                { "Susi Susanti", "Kevin Sanjaya", "Fajar Alfian", "Taufik Hidayat", "Jonathan Christie" },
                { "Anton Suseno", "Bima Abdi", "Ling Agustin", "David Jacobs", "Ficky Supit" },
                { "Marques Bolden", "Galang Gunawan", "Arki Dikania", "Wahyudin", "Ferdian" },
                { "Megawati", "Agil Anggara", "Dio", "Hernanda Kurniawan", "Doni Haryono" }
        };

        for (int i = 0; i < atletCabor.length; i++) {
            System.out.println("\nCabang Olahraga " + caborPorseni[i]);
            for (int k = 0; k < atletCabor[i].length - 1; k++) {
                for (int j = 0; j < atletCabor[i].length - k - 1; j++) {
                    if (atletCabor[i][j].compareTo(atletCabor[i][j + 1]) > 0) {
                        String temp = atletCabor[i][j];
                        atletCabor[i][j] = atletCabor[i][j + 1];
                        atletCabor[i][j + 1] = temp;
                    }
                }
            }
            for (String athlete : atletCabor[i]) {
                System.out.println(athlete);
            }
        }
    }
}
