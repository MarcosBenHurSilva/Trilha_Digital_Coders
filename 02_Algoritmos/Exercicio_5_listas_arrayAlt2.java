// Solução usando array/listas

import java.util.ArrayList;
import java.util.List;

public class Exercicio_5_listas_arrayAlt2 {
    public static void main(String[] args) {
        List<Integer> numerosDivisiveis = new ArrayList<>();
        int numero = 1;  // Começamos a partir do primeiro número e verificamos se é divisível.

        while (numerosDivisiveis.size() < 20) {
            if (numero % 2 == 0 || numero % 5 == 0) {
                numerosDivisiveis.add(numero);
            }
            numero++;
        }

        System.out.print("Os primeiros 20 números divisíveis por 2 ou por 5 são: [");
        for (int i = 0; i < numerosDivisiveis.size(); i++) {
            System.out.print(numerosDivisiveis.get(i));
            if (i < numerosDivisiveis.size() - 1) {
                System.out.print(", "); // Adiciona vírgula apenas se não for o último número
            }
        }
        System.out.println("]");

        System.out.print("[");
        for (int i = 0; i < numerosDivisiveis.size(); i++) {
            if (numerosDivisiveis.get(i) % 2 == 0) {
                System.out.print("(numero: " + numerosDivisiveis.get(i) + ", " + "item: " +  (i + 1) + ", é par)");
                if (i < numerosDivisiveis.size() - 1) {
                    System.out.print(", "); // Adiciona vírgula apenas se não for o último número
                }
            } else {
                System.out.print("(numero: " + numerosDivisiveis.get(i) + ", " + "item: " +  (i + 1) + ", é impar)");
                if (i < numerosDivisiveis.size() - 1) {
                    System.out.print(", "); // Adiciona vírgula apenas se não for o último número
                }
            }
        }
        System.out.println("]");
    }
}