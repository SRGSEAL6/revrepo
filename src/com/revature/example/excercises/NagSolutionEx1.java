package com.revature.example.excercises;

public class NagSolutionEx1 {
    public static void main(String[] args) {
        int i = 1, x = 71, blanks = 0, j, val, k;
        while (i <= 7) {
            j = 65;
            val = x;
            while (j <= val) {
                System.out.print((char) j);
                j++;
            }
            if (i == 1)
                val--;
            k = 1;
            while (k <= blanks) {
                System.out.print(" ");
                k++;
            }
            blanks = 2 * i - 1;
            while (val >= 65) {
                System.out.print((char) val);
                val--;
            }
            System.out.println();
            x--;
            i++;
        }


    }

}

