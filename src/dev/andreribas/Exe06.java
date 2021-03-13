package dev.andreribas;

public class Exe06 {
    public static void main(String[] args) {
        Reader reader = new Reader();
        int fiboElems = reader.readInt("Quantos elementos deseja imprimir: ");
        for (int i = 0; i < fiboElems; i++) {
            System.out.print(fiboAtPos(i));
            if (i < fiboElems - 1) System.out.print(", ");
        }
    }

    private static int fiboAtPos(int pos) {
        if (pos == 0) return 0;
        if (pos == 1) return 1;
        return fiboAtPos(pos - 1) + fiboAtPos(pos - 2);
    }
}
