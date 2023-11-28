package tersucgen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        System.out.println("  Ü Ç G E N  ");


        for (int i = n; i > 0; i--)
        {
            for (int k = (n - i); k >= 0; k--)
            {
                System.out.print(" ");
            }

            for (int j = (2 * i - 2); j >= 0; j--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
