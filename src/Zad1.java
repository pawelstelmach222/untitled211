import java.io.InputStream;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wprowadź wartość od 1 do 10");
        int wartosc = klawiatura.nextInt();
         if (wartosc>10) {
             System.out.println("Niepoprawna wartość");

         }
         if (wartosc<1) {
             System.out.println("Niepoprawna wartość");

         }else if (wartosc<10)System.out.println("Poprawna wartość");

    }
    }

