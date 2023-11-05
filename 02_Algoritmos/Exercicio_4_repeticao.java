import java.util.Scanner;


public class Exercicio_4_repeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            soma += numero;
            System.out.println("Soma parcial: " + soma);
        }

        System.out.println("Soma final: " + soma);
        scanner.close();
    }
}
