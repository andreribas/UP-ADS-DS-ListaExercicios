package dev.andreribas;

import java.util.Scanner;

public class Reader {

    private final Scanner sc;

    public Reader() {
        sc = new Scanner(System.in);
    }

    public int readInt(String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    public float readFloat(String message) {
        System.out.print(message);
        return sc.nextFloat();
    }
}
