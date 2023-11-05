//Num outro exemplo, agora com código, vamos pedir para o usuário digitar numeros até que a soma
//seja igual ou maior a 100, e depois  mostrar a soma.
import java.util.Scanner;

public class Exercicio_4_repeticao2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int soma = 0;
            int iteracao = 0;

            while (soma < 100) {
                System.out.print("Digite um número: ");
                int num = scanner.nextInt();
                soma += num;
                iteracao++;
                System.out.println("Soma parcial: " + soma);
            }
            System.out.println("Número de iterações: " + iteracao);
            System.out.println("Soma final: " + soma);
        }
    }
}
