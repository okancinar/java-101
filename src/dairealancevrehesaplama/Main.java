package dairealancevrehesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dairenin yarıçapını girin: ");
        int r = input.nextInt();

        /*
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Alan: " + alan + "\nÇevre: " + cevre);
        */


        // Açı ile hesaplama:

        System.out.print("Merkez Açı: ");
        int a = input.nextInt();

        double dilimAlan = (pi * (r*r) * a) / 360;

        System.out.println("Daire dilimi alanı: " + dilimAlan);

    }
}
