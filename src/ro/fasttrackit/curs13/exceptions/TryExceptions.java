package ro.fasttrackit.curs13.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TryExceptions {
    public static void main(String[] args) {
        mathAlgo();
        checkedExceptions();
        try {
            checkedExceptionsSpecify();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try {
            iThrowUpChecked();
        } catch (FileNotFoundException ex) {
            System.out.println("Checked exception");
        }

        System.out.println("STOP");
    }

    private static void iThrowUpChecked() throws FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new FileNotFoundException();
        }
    }

    private static void checkedExceptionsSpecify() throws FileNotFoundException {
        Scanner fileReader = new Scanner(new FileReader("test.txt"));
    }

    private static void checkedExceptions() {
        try {
            Scanner fileReader = new Scanner(new FileReader("test.txt"));
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error when reading file : " + fnfe.getMessage());
        }
    }

    private static void mathAlgo() {
        int a = 3;
        int b = 3;

        System.out.println("Inainte: nu tine de C");
        int c = 0;
        try {
            c = makeCalc(a, b);
        } catch (ArithmeticException ex) {
            System.out.println("Ooops. This is not good ");
        }
        System.out.println("Nu tine de C");
        System.out.println("Salut c " + c);
    }

    private static int makeCalc(final int a, final int b) {
        return a / substract(a, b);
    }

    private static int substract(final int a, final int b) {
        return a - b;
    }
}

//LIFO = Last In First Out - Stiva
//FIFO = First In First Out - Coada
