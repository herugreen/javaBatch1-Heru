package com.javaprogram;

public class HomeWork3 {
    public static void main(String[] args) {
        //Looping Segitiga
        for(int i =0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
                if(i==j){
                    break;
                }
            }
            System.out.print("\n");
        }

        for(int i =0; i<5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if ((i + j) == 4) {
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}