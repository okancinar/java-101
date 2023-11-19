package TemelKavramlarveDegiskenler;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select,result;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen 1. sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz \n" +
                "1-Toplama\n" +
                "2-Çıkarma\n" +
                "3-Çarpma\n" +
                "4-Bölme\n");

        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        switch (select)
        {
            case 1:
                System.out.println("Çarpım: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Fark: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım: " + (n1 * n2));
                break;
            case 4:
                if(n2 != 0) {
                    System.out.println("Bölüm: " + (n1 / n2));
                    break;
                }
                else
                    System.out.println("Bölen sayı 0 olamaz");
                    break;
            default:
                System.out.println("Hatalı seçim yaptınız.");
        }
    }
}
