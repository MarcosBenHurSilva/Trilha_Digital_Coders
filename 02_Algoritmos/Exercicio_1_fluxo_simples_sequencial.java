import java.util.Scanner;

public class Exercicio_1_fluxo_simples_sequencial {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            
            System.out.println("Bom dia, " + nome);
        }
    }
}
