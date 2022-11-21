import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj w formie liczby: ");
        System.out.println("Dzień / Miesiąc / Dwie ostatnie liczby roku");
        int dzien = klawiatura.nextInt();
        int miesiac = klawiatura.nextInt();
        int rok = klawiatura.nextInt();
        int wynik = dzien*miesiac;
        if (rok==wynik) {
            System.out.println("Data jest magiczna");
        }else System.out.println("Data nie jest magiczna");
    }
}
