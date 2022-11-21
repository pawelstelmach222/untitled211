import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
         int oprogramowanie=99;
        System.out.println("Podaj ilość zakupionych pakietów: ");
        int pakiety= klawiatura.nextInt()*oprogramowanie;
        double rabat = 0;
        if (pakiety<10){
             rabat=pakiety*0.20;
            System.out.println("Poziom rabatu: "+pakiety*rabat);
        }
        if (pakiety<19){
             rabat=pakiety*0.20;
            System.out.println("Poziom rabatu: "+pakiety*rabat);
        }
        if (pakiety<49){
             rabat=pakiety*0.30;
            System.out.println("Poziom rabatu: "+pakiety*rabat);
        }
        if (pakiety<99){
             rabat=pakiety*0.40;
            System.out.println("Poziom rabatu: "+pakiety*rabat);
        }
        if (pakiety>100){
             rabat=pakiety*0.50;
            System.out.println("Poziom rabatu: "+rabat);
        }
        double cenaporabacie=pakiety-rabat;
        System.out.println("Cena po rabacie: "+cenaporabacie);
    }
}
