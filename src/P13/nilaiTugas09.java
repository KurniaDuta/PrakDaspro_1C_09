package P13;

import java.util.Scanner;

public class nilaiTugas09 {
    static int[][] grades;
    static String[] namaMahasiswa;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        inputMinggu();
        inputNama();
        inputNilai();
        ouputNilaiMahasiswa();
        int mingguTertinggi = cariMingguTertinggi();
        System.out.println("\nMinggu dengan nilai tertinggi: " + (mingguTertinggi + 1));
        
        outputNilaiTertinggi();
    }

    static void inputMinggu() {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMahasiswa = input.nextInt();
        System.out.print("Masukkan jumlah minggu: ");
        int jmlMinggu = input.nextInt();

        grades = new int[jmlMahasiswa][jmlMinggu];
        namaMahasiswa = new String[jmlMahasiswa];
    }

    static void inputNama() {
        System.out.println("Masukkan nama mahasiswa: ");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("-> Mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = input.next();
        }
    }

    static void inputNilai() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < grades[0].length; j++) {
                System.out.print("-> Minggu ke-" + (j + 1) + ": ");
                grades[i][j] = input.nextInt();
            }
        }
    }

    static void ouputNilaiMahasiswa() {
        System.out.println("Rangkuman Nilai Mahasiswa:");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Mahasiswa " + namaMahasiswa[i] + ": ");
            for (int j = 0; j < grades[0].length; j++) {
                System.out.print(j == grades[0].length - 1 ? grades[i][j] : grades[i][j] + ", ");
            }
            System.out.println();
        }
    }

    static int cariMingguTertinggi() {
        int mingguTertinggi = 0;
        int highestGrade = grades[0][0];

        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[0].length; j++) {
                if (grades[i][j] > highestGrade) {
                    highestGrade = grades[i][j];
                    mingguTertinggi = j;
                }
            }
        }
        return mingguTertinggi;
    }

    static void outputNilaiTertinggi() {
        int[] highestGradeInfo = cariNilaiTertinggi();
        int studentIndex = highestGradeInfo[0];
        int week = highestGradeInfo[1];
        int highestGrade = highestGradeInfo[2];

        System.out.println("\nMahasiwa dengan nilai tertinggi:");
        System.out.println("Nama: " + namaMahasiswa[studentIndex]);
        System.out.println("Minggu: " + (week + 1));
        System.out.println("Nilai: " + highestGrade);
    }

    static int[] cariNilaiTertinggi() {
        int[] result = { 0, 0, grades[0][0] };
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[0].length; j++) {
                if (grades[i][j] > result[2]) {
                    result[0] = i;
                    result[1] = j;
                    result[2] = grades[i][j];
                }
            }
        }
        return result;
    }
}
