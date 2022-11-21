import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj wagę przesyłki: ");
        double waga = klawiatura.nextDouble();
        System.out.println("Podaj odległość przesyłki: ");
        double odleglosc = klawiatura.nextDouble();
        if (waga <= 1){
            double cenazakm=1.10/500;
            double cena;
            cena =(double)cenazakm * odleglosc;
            System.out.println("Koszt tej wysyłki wynosi: "+cena+" zł");
        }
        if (waga <3){
            double cenazakm=2.20/500;
            double cena;
            cena =(double)cenazakm * odleglosc;
            System.out.println("Koszt tej wysyłki wynosi: "+cena+" zł");
        }
        if (waga <5){
            double cenazakm=3.70/500;
            double cena;
            cena =(double)cenazakm * odleglosc;
            System.out.println("Koszt tej wysyłki wynosi: "+cena+" zł");
        }
        if (waga > 5){
            double cenazakm=3.80/500;
            double cena;
            cena =(double)cenazakm * odleglosc;
            System.out.println("Koszt tej wysyłki wynosi: "+cena+" zł");
        }
    }
}
