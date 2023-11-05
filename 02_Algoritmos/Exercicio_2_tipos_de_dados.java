import java.util.Scanner;

public class Exercicio_2_tipos_de_dados {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            int n1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int n2 = scanner.nextInt();
            int resultado = (n1 + n2);
            
            System.out.println("n1 + n2 = " + resultado);
        }
    }
}
