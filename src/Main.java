import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Integer losowa = 0;
        int howManyLoops = 0;
        ArrayList<Integer> array = new ArrayList<>();
        Random generator = new Random();
        Scanner io = new Scanner(System.in); // obiekt do odczytu danych z klawiatury
        howManyLoops = io.nextInt(); //pobranie danych z klawiatury

        for (int i = 0; i < howManyLoops; i++){

            losowa = generator.nextInt(100);
            array.add(losowa);
            System.out.println(losowa);

        }

        System.out.println( "Wydruk z listy: ");
        for (Integer liczba: array) {

            System.out.println(liczba);
        }


    }
}
