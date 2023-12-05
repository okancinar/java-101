package Giris;

public class Giris {

    public Giris()
    {
        System.out.printf("1");
        new Giris(10);
        System.out.printf("5");
    }
    public Giris(int temp)
    {
        System.out.printf("2");
        new Giris(10, 20);
        System.out.printf("4");
    }
    public Giris(int data, int temp)
    {
        System.out.printf("3");

    }

    public static void main(String[] args)
    {
        Giris obj = new Giris();
    }

}
