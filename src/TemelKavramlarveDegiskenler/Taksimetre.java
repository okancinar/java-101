package TemelKavramlarveDegiskenler;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen gideceğiniz yolu km cinsinden tamsayı olarak girin: ");
        km = input.nextInt();
        double yolUcreti, odenecekTutar;
        yolUcreti = 10 + (km*2.20);

        odenecekTutar = yolUcreti<20 ? 20 : yolUcreti;

        System.out.println("Ödenecek Tutar: " + odenecekTutar);



    }
}
