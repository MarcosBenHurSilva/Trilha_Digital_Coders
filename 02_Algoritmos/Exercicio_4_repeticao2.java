import java.util.Scanner;


public class Exercicio_4_repeticao2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int soma = 0;
            int i;
            int num = 0;

            for (i = 0; soma < 100; i++) {
                System.out.print("Digite um número: ");
                num = scanner.nextInt();
                soma += num;
                System.out.println("iteração: " + i);
                System.out.println("Soma parcial: " + soma);
                System.out.println("num: " + num);
            }
            System.out.println("iteração: " + i);
            System.out.println("Soma final: " + soma);
            System.out.println("num: " + num);
            scanner.close();
        }
    }
}
