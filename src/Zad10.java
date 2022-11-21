import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę kalorii i gramów tłuszczu w produkcie: ");
        int liczbakalorii= klawiatura.nextInt();
        int gramytluszczu= klawiatura.nextInt();
        int kalorietluszczu=gramytluszczu*9;
        if (liczbakalorii>kalorietluszczu*0.3){
            System.out.println("Produkt jest niskotłuszczowy");
        }
        if (liczbakalorii<kalorietluszczu){
            System.out.println("Wprowadzono błędne dane!");
        }
    }
}
