import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        System.out.println("Podaj masę obiektu w kilogramach: ");
        double masa = klawiatura.nextDouble();
        double ciezar=masa*9.8;
        if (ciezar>1000){
            System.out.println("Obiekt jest zbyt ciężki!");
        }
        if (ciezar<10){
            System.out.println("Obiekt jest zbyt lekki!");
        }
        System.out.println("Ciężar wynosi: "+ciezar+" N");
    }
}
