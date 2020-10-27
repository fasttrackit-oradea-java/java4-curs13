package ro.fasttrackit.curs13.exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"))) {
            bufferedWriter.write(getContent());
        } catch (IOException ex) {
            System.out.println("Exceptie");
        }
    }

    private static String getContent() {
        if (true) throw new RuntimeException();
        return "abc";
    }
}
