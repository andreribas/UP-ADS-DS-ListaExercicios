package dev.andreribas;

public class Exe01 {
    public static void main(String[] args) {
        Reader reader = new Reader();
        int height = reader.readInt("Insira a altura: ");
        int length = reader.readInt("Insira a largura: ");
        int area = height * length;

        System.out.printf("A area é: %d%n", area);
    }
}
