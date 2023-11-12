package TemelKavramlarveDegiskenler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VucutKitleIndeksiHesapla {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        int kilo = input.nextInt();

        double vkı = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + vkı);

    }
}
