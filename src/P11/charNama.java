package P11;

public class charNama {
    public static void main(String[] args) {
        char karakter[] = {'D', 'u', 't', 'a','K','u','r','n','i','a','A','r','d','h','a','n','i'};
        int indexNama = 0;
        char nama [][] = new char[8][5];
        

        for (int i = 0; i < nama.length; i++) {
            for (int j = 0; j < nama[0].length; j++) {
                nama[i][j] = karakter[indexNama];
                indexNama++;
                System.out.print(nama[i][j]);
                if (indexNama == karakter.length) {
                    indexNama = 0;
                }
            }
            System.out.println();
        }
    }
}
