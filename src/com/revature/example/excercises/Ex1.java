package com.revature.example.excercises;

public class Ex1 {
    public static void main(String[] args) {
        String line = "ABCDEFGHIJKLMNOPQRSTUCWXYZ";
        for(int i =0; i< line.length();i++ ){
            for(int j = 0; j < line.length()-i; j++){
                System.out.print(line.charAt(j));
            }
            for (int k = 0; k < i; k++){
                System.out.print(" ");
            }
            if(i == 0){
                for(int p=line.length()-1; p>0; p--){
                    System.out.print(line.charAt(p-1));
                }
            }else{
                for (int p = 1; p < i; p++){
                    System.out.print(" ");
                }
                for(int l = line.length()-i; l > 0 ; l--) {
                    System.out.print(line.charAt(l - 1));
            }
            }
            System.out.print("\n");
        }
    }
}
/*Output*/
//ABCDCBA
//ABC CBA
//AB   BA
//A     A
/*       */
