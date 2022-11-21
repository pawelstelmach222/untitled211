import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj trzy imiona: ");
        String imie1=klawiatura.nextLine();
        String imie2=klawiatura.nextLine();
        String imie3=klawiatura.nextLine();
        if (imie1.compareToIgnoreCase(imie2) < 0){
            System.out.println(imie1 + " jest pierwszy alfabetycznie  " );
        }//

        else if (imie1.compareTo(imie2) > 0){
            System.out.println(imie2 + " jest pierwszy alfabetycznie");
        }
        else if (imie1.compareTo(imie3) > 0){
            System.out.println(imie3 + " jest pierwszy alfabetycznie");
        }
    }
}
