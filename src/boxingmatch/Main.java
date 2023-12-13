package boxingmatch;

public class Main {
    public static void main(String[] args){

        Fighter f1 = new Fighter("Okan",1752,500, 84,17);
        Fighter f2 = new Fighter("Selin",2893,1000, 87,13);

        Match ring = new Match(f1,f2,90,80);

        ring.fight();
    }
}
