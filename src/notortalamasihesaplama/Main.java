package notortalamasihesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Matematik Notunuzu Girin: ");
        mat = inp.nextInt();

        System.out.print("Lütfen Fizik Notunuzu Girin: ");
        fizik = inp.nextInt();

        System.out.print("Lütfen Kimya Notunuzu Girin: ");
        kimya = inp.nextInt();

        System.out.print("Lütfen Türkçe Notunuzu Girin: ");
        turkce = inp.nextInt();

        System.out.print("Lütfen Tarih Notunuzu Girin: ");
        tarih = inp.nextInt();

        System.out.print("Lütfen Müzik Notunuzu Girin: ");
        muzik = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6.0;

        System.out.println("Notunuz: " + ortalama);

        String durum = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(durum);


    }
}
