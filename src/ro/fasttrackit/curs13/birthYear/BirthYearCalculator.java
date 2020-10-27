package ro.fasttrackit.curs13.birthYear;

import java.time.LocalDate;

public class BirthYearCalculator {
    public static void main(String[] args) {
        try {
            System.out.println(getBirthYear(20));
            System.out.println(getBirthYear(130));
        } catch (AgeException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int getBirthYear(int age) throws AgeException {
        if (age >= 0 && age < 121) {
            return LocalDate.now()
                    .getYear() - age;
        } else {
            throw new AgeException("Varsta nu e valida: " + age);
        }
    }
}
