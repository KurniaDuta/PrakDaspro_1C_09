package P3;

public class ContohVariabel09 {
    public static void main(String[] args) {
        String salahSatuHobySayaadalah = "Bermain sepeda";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSayaSekarang = 18;
        double ipk = 3.55, tinggi = 1.78;
        
        System.out.println(salahSatuHobySayaadalah);
        System.out.println("Apakah pandai?" + isPandai);
        System.out.println("Jenis kelamin:" + jenisKelamin);
        System.out.println("Umurku saat ini:" + umurSayaSekarang);
        // System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
        System.out.println(String.format("Saya beripk " + ipk + " dengan tinggi badan " + tinggi));
    }
}

