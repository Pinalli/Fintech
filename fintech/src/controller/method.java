package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class method {

    public void read() throws FileNotFoundException {

        Scanner in = new Scanner(new FileReader("src/arquivos/caso10.txt"));
        while (in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(line);
        }
    }

}
