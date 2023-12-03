package gelismishesapmakinesi;

import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, counter;

        System.out.print("Kaç adet sayı gireceksiniz: ");
        counter = scan.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus(){
        Scanner scan = new Scanner(System.in);
        int number, result = 0, counter;

        System.out.print("Kaç adet sayı gireceksiniz: ");
        counter = scan.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void times(){
        Scanner scan = new Scanner(System.in);
        int number, result = 1, counter;

        System.out.print("Kaç adet sayı gireceksiniz: ");
        counter = scan.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();

            result *= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void divided(){
        Scanner scan = new Scanner(System.in);
        int counter;
        double number, result = 0.0;

        System.out.print("Kaç adet sayı gireceksiniz: ");
        counter = scan.nextInt();

        for (int i = 1; i <= counter; i++) {

            System.out.print(i + ". sayı :");
            number = scan.nextInt();

            if(i == 1){
                result += number;
                continue;
            }
            if(i != 1 && number == 0){
                System.out.println("Bölen sayı 0 girilemez!");
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void power(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result;

        result = (n % 10);
        System.out.println("Sonuç: " + result);
    }

    static void rectangle(){
        Scanner scan = new Scanner(System.in);
        int longSide, shortSide, area, perimeter;

        System.out.print("Uzun kenarı girin: ");
        longSide = scan.nextInt();

        System.out.print("Kısa kenarı girin: ");
        shortSide = scan.nextInt();

        area = longSide * shortSide;
        perimeter = 2 * (longSide + shortSide);

        System.out.println("Alan: " + area);
        System.out.println("Çevre: " + perimeter);
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }while(select != 0);

    }
}
