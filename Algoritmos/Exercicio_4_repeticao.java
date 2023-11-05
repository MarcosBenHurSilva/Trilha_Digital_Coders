import java.util.Scanner;


public class Exercicio_4_repeticao {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int soma = 0;
            int i;
            int numero = 0;

            for (i = 0; i < 3; i++) {
                System.out.print("Digite um número: ");
                numero = scanner.nextInt();
                soma += numero;
                System.out.println("iteração: " + i);
                System.out.println("Soma parcial: " + soma);
                System.out.println("num: " + numero);
            }
            System.out.println("iteração: " + i);
            System.out.println("Soma final: " + soma);
            System.out.println("num: " + numero);
            scanner.close();
        }
    }
}
