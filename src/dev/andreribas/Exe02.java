package dev.andreribas;

public class Exe02 {
    public static void main(String[] args) {
        Reader reader = new Reader();
        float value = reader.readFloat("Insira valor em real a ser convertido: ");

        System.out.printf("BRL %.2f%n\n", value);
        System.out.printf("USD %.2f%n\n", value / 3.78);
        System.out.printf("EUR %.2f%n\n", value / 4.21);
        System.out.printf("ARS %.2f%n\n", value / 0.08);
    }
}

