package ro.fasttrackit.curs13.birthYear;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeApp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int userAge = 0;
        while (userAge != -1) {
            System.out.print("Introduceti varsta: ");
            try {
                userAge = console.nextInt();
                int birthYear = BirthYearCalculator.getBirthYear(userAge);
                System.out.println("Anul nasterii este " + birthYear);
            } catch (AgeException ex) {
                System.out.println(ex.getMessage());
            } catch (InputMismatchException ime) {
                System.out.println("Varsta nu e valida");
                console = new Scanner(System.in);
            }
        }
    }
}
