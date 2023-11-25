package ucakbiletihesap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */


        int mesafe, yas, yolculukTipi;
        double indirimOrani, yasIndirimi, gidisDonusIndirimi, normalTutar, indirimliTutar, toplamTutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi kilometre türünden giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini seçiniz (1 ==> Tek Yön, 2 ==> Gidiş Dönüş): ");
        yolculukTipi = input.nextInt();

        if(yas>0 && mesafe>=0) {
            switch (yolculukTipi) {
                case 1:
                    if (yas < 12) {
                        indirimOrani = 0.50;
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * indirimOrani;
                        indirimliTutar = normalTutar - yasIndirimi;
                        toplamTutar = indirimliTutar;
                        System.out.println("Toplam Tutar: " + toplamTutar);
                    } else if (yas >= 12 && yas <= 24) {
                        indirimOrani = 0.10;
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * indirimOrani;
                        indirimliTutar = normalTutar - yasIndirimi;
                        toplamTutar = indirimliTutar;
                        System.out.println("Toplam Tutar: " + toplamTutar);
                    } else if (yas > 65) {
                        indirimOrani = 0.30;
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * indirimOrani;
                        indirimliTutar = normalTutar - yasIndirimi;
                        toplamTutar = indirimliTutar;
                        System.out.println("Toplam Tutar: " + toplamTutar);
                    } else {
                        normalTutar = mesafe * 0.10;
                        toplamTutar = normalTutar;
                        System.out.println("Toplam Tutar: " + toplamTutar);
                    }
                    break;

                case 2:
                    if (yas < 12) {
                        indirimOrani = 0.50;
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * indirimOrani;
                        indirimliTutar = normalTutar - yasIndirimi;
                        gidisDonusIndirimi = indirimliTutar * 0.20;
                        indirimliTutar = indirimliTutar - gidisDonusIndirimi;
                        toplamTutar = indirimliTutar * 2;
                        System.out.println("Toplam Tutar: " + toplamTutar);
                    } else if (yas >= 12 && yas <= 24) {
                        indirimOrani = 0.10;
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * indirimOrani;
                        indirimliTutar = normalTutar - yasIndirimi;
                        gidisDonusIndirimi = indirimliTutar * 0.20;
                        indirimliTutar = indirimliTutar - gidisDonusIndirimi;
                        toplamTutar = indirimliTutar * 2;
                        System.out.println("Toplam Tutar: " + toplamTutar);
                    } else if (yas > 65) {
                        indirimOrani = 0.30;
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * indirimOrani;
                        indirimliTutar = normalTutar - yasIndirimi;
                        gidisDonusIndirimi = indirimliTutar * 0.20;
                        indirimliTutar = indirimliTutar - gidisDonusIndirimi;
                        toplamTutar = indirimliTutar * 2;
                        System.out.println("Toplam Tutar: " + toplamTutar);
                    } else {
                        normalTutar = mesafe * 0.10;
                        gidisDonusIndirimi = normalTutar * 0.20;
                        indirimliTutar = normalTutar - gidisDonusIndirimi;
                        toplamTutar = indirimliTutar * 2;
                        System.out.println("Toplam Tutar: " + toplamTutar);
                    }
                    break;
                default:
                    System.out.println("Geçersiz Yolculuk Tipi!");
            }

        }
        else {
            System.out.println("Hatalı Veri Girdiniz!");
        }







    }
}
