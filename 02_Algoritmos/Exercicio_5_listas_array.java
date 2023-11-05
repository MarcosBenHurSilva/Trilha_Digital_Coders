// Solução usando repetição

public class Exercicio_5_listas_array {
    public static void main(String[] args) {
        int[] numerosDivisiveis = new int[20];
        int numero = 1;  // Começamos a partir do primeiro número e verificamos se é divisível.

        for (int i = 0; i < 20; ) {
            if (numero % 2 == 0 || numero % 5 == 0) {
                numerosDivisiveis[i] = numero;
                i++;
            }
            numero++;
        }

        System.out.print("Os primeiros 20 números divisíveis por 2 ou por 5 são: [");
        for (int i = 0; i < 20; i++) {
            System.out.print(numerosDivisiveis[i]);
            if (i < 19) {
                System.out.print(", "); // Adiciona vírgula apenas se não for o último número
            }
        }
        System.out.println("]");
    }
}