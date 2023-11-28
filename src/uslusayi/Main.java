package uslusayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taban, us, total = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban: ");
        taban = scanner.nextInt();

        System.out.print("Üs: ");
        us = scanner.nextInt();

        for (int i = 1; i <= us; i++){
            total *= taban;
        }
        System.out.println(total);
    }
}
