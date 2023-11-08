package P10;

import java.util.Arrays;

public class Numbers09 {
    public static void main(String[] args) {
        int[][] myNummbers = new int[3][];
        myNummbers[0] = new int[5];
        myNummbers[1] = new int[3];
        myNummbers[2] = new int[1];

        for (int i = 0; i < myNummbers.length; i++) {
            System.out.println(Arrays.toString(myNummbers[i]));
        }

        for (int i = 0; i < myNummbers.length; i++) {
            System.out.println("Panjang baris [" + (i+1) + "] = " + myNummbers[i].length);
        }
    }   
}