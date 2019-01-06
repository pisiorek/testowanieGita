import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> companies = new ArrayList();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");

        String temp = "";

        for (int i = 0; i < companies.size(); i++){


            temp += companies.get(i) + ", ";

        }

        System.out.println(temp);

/*        System.out.println( "Wydruk z listy: ");
        for (Integer liczba: array) {

            System.out.println(liczba);
        }*/


    }
}
