import java.util.Scanner;

public class zad11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj nazwiska trzech biegaczy: ");
        String biegacz1= klawiatura.nextLine();
        String biegacz2= klawiatura.nextLine();
        String biegacz3= klawiatura.nextLine();
        System.out.println("Podaj czas ukończenia biegu biegacza 1:");
        double minuty1= klawiatura.nextDouble();
        System.out.println("Podaj czas ukończenia biegu biegacza 1:");
        double minuty2= klawiatura.nextDouble();
        System.out.println("Podaj czas ukończenia biegu biegacza 1:");
        double minuty3= klawiatura.nextDouble();
    }
}
