package ro.fasttrackit.curs13.exceptions;

import java.io.IOException;

public class TryFinally {

    public static void main(String[] args) throws IOException {
        try {
            throwSomething();
        } catch (MyException npe) {
            System.out.println("Exception handler");
        } finally {
            System.out.println("Dupa exceptie neaparat");
        }
        System.out.println("In afara finally");
    }

    private static void throwSomething() {
        if (System.currentTimeMillis() % 2 == 0) {
            System.out.println("Secunda para");
            throw new MyException("Hello exception");
        } else {
            System.out.println("Secunda impara");
            throw new IllegalArgumentException();
        }
    }
}
