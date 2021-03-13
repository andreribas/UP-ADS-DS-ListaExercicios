package dev.andreribas;

public class Exe03 {
    public static void main(String[] args) {
        Reader reader = new Reader();
        int firstValue = reader.readInt("Insira o primeiro valor: ");
        int secondValue = reader.readInt("Insira o segundo valor: ");

        System.out.printf("O maior número é: %d\n", Math.max(firstValue, secondValue));
    }
}
