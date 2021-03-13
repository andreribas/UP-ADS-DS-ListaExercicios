package dev.andreribas;

public class Exe05 {
    public static void main(String[] args) {
        Reader reader = new Reader();
        int age = reader.readInt("Insira a idade: ");

        if (age <= 13) System.out.println("Criança");
        else if (age <= 18) System.out.println("Adolescente");
        else if (age <= 60) System.out.println("Adulto");
        else System.out.println("Idoso");
    }
}
