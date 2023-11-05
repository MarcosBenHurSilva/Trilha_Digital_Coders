import java.util.Scanner;

public class Exercicio_3_decisao {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a hora atual: ");
            int hora = scanner.nextInt();

            String saudacao;

            if (hora >= 0 && hora < 12) {
                saudacao = "Bom Dia";
            } else if (hora >= 12 && hora < 18) {
                saudacao = "Boa Tarde";
            } else {
                saudacao = "Boa Noite";
            }

            System.out.println(saudacao + " " + nome + "!");
        }
    }
}
