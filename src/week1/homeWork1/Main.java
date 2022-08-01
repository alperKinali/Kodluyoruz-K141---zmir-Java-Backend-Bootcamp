package week1.homeWork1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("\n" +"Enter the height value.");
        int height = scanner.nextInt();
        while (height>0){
            for(int i =1; i<height;i++){
                for (int j=i ; j<height; j++){
                    // sol kenar boslukları
                    System.out.print(" ");
                }
                for (int k =1; k<=i;k++){
                    // satır sayısınca yıldız eklendi.
                    System.out.print("*");
                    System.out.print(" ");
                }
                // alt satıra geçildi.
                System.out.println(" ");
            }
            // aynı islemin tersi.
            for(int i =height; i>=1;i--){
                for (int j=i ; j<height; j++){
                    // boslukları
                    System.out.print(" ");
                }
                for (int k =1; k<=i;k++){
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
            System.out.println("enter another height");
            height = scanner.nextInt();
        }
        System.out.println("invalid height value entered ");
    }
}
