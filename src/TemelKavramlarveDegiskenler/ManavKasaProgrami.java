package TemelKavramlarveDegiskenler;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        double armutKilo = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elmaKilo = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domatesKilo = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muzKilo = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlicanKilo = input.nextDouble();

        double armutTutar, elmaTutar, domatesTutar, muzTutar, patlicanTutar;

        armutTutar=armutKilo*armut;
        elmaTutar=elmaKilo*elma;
        domatesTutar=domates*domatesKilo;
        muzTutar=muz*muzKilo;
        patlicanTutar=patlican*patlicanKilo;

        double toplamTutar;
        toplamTutar = armutTutar + elmaTutar + domatesTutar + muzTutar + patlicanTutar;
        System.out.println("Toplam Tutar : " + toplamTutar + "TL");

        
    }
}
