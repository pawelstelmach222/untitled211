import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj swoją wagę: ");
        int waga = klawiatura.nextInt();
        System.out.println("Podaj wzrost w metrach: ");
        double wzrost = klawiatura.nextDouble();
        double BMI = waga/(wzrost*wzrost);
        System.out.println("Twoje BMI wynosi: "+ BMI);
        if (BMI <=25){
            System.out.println("Optymalne BMI");
        }
        if (BMI <18.5){
            System.out.println("Niedowaga");
        }
        if (BMI >25){
            System.out.println("Nadwaga");
        }
    }
}
