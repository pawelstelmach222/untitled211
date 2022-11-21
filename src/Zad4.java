import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int wyniktestu1;
        int wyniktestu2;
        int wyniktestu3;
        System.out.println("Podaj wyniki z trzech testów (Od 1-100pkt): ");
        wyniktestu1= klawiatura.nextInt();
        wyniktestu2= klawiatura.nextInt();
        wyniktestu3= klawiatura.nextInt();
        int wynik=wyniktestu1+wyniktestu2+wyniktestu3;
        int wynikgo=wynik/3;

        if (wynikgo>90){
            System.out.println("Uzyskales ocene: 5");
        }
        if (wynikgo<89){
            System.out.println("Uzyskales ocene: 4");
        }
        if (wynikgo<80){
            System.out.println("Uzyskales ocene: 3");
        }
        if (wynikgo<70){
            System.out.println("Uzyskales ocene: 2");
        }
        if (wynikgo<60){
            System.out.println("Uzyskales ocene: 1");
        }


    }
}
