package recursiveexpnumber;

import java.util.Scanner;

public class Main {
    static int exp(int base, int power){

        if(power == 0){
            return 1;
        }
        else{
            return base * exp(base , power-1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base, power;

        System.out.print("Lütfen taban değerini girin: ");
        base = scan.nextInt();
        System.out.print("Lütfen üs değerini girin: ");
        power = scan.nextInt();

        System.out.println("Sonuç: " + exp(base, power));
    }
}
