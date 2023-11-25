package kullanicikontrol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName , password;

        System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();

        System.out.print("Lütfen Parolanızı Giriniz: ");
        password = input.nextLine();

        if(userName.equals("okancinar")) {
            if(password.equals("okanpass")) {
                System.out.println("Giriş Başarılı!");
            }
            else {
                System.out.print("Şifre Hatalı! Değiştirmek İster misiniz? Evet için 1'e , Hayır için 2'ye basın: ");
                int secim = input.nextInt();

                switch (secim) {
                    case 1:
                        System.out.print("Lütfen yeni şifrenizi girin: ");
                        input.nextLine();
                        password = input.nextLine();
                        if(password.equals("okanpass")){
                            System.out.println("Şifre oluşturulamadı! Şifreniz eski şifrenizle aynı olamaz.");
                        }
                        else {
                            System.out.println("Şifre başarılı bir şekilde oluşturuldu!");
                        }
                        break;
                    case 2:
                        System.out.println("Çıkış yapıldı.");
                        break;
                    default:
                        System.out.println("Geçerli bir seçim yapmadınız.");
                }
            }
        }
        else {
            System.out.println("Lütfen kullanıcı adınızı kontrol ediniz.");
        }
    }
}
