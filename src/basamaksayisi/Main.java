package basamaksayisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basamakSayisi = 0, numberCounter = 0;
        System.out.print("Sayıyı Girin: ");
        int a = scanner.nextInt();
        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        while (a != 0) {
            a /= 10;
            numberCounter++;
        }
        System.out.println(numberCounter);
    }
}
