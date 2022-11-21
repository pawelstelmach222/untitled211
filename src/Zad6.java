import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadź liczbę sekund");
        double sekundy = klawiatura.nextDouble();
        double minuty = sekundy/60;
        double godziny = minuty/60;
        double dni = godziny/24;
        if (sekundy==60){
            minuty=sekundy/60;
        }
        if (sekundy==3600){
            godziny=sekundy/3600;
        }
        if (sekundy==86400){
            dni=sekundy/86400;
        }
        System.out.println(sekundy+" sekund to "+minuty+" minut "+ godziny+" godzin i "+dni+" dni");
    }
}
