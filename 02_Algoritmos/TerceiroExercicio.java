import java.util.Scanner;

public class TerceiroExercicio {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a hora atual: ");
            int hora = scanner.nextInt();

            if (hora > 0 && hora < 12) {
                String msg = "Bom Dia " ;
                System.out.println(msg + nome);
            } else if (hora >= 12 && hora < 18) {
                String msg = "Boa tarde " ;
                System.out.println(msg + nome);
            } else {
                String msg = "Boa noite ";
                System.out.println(msg + nome);
            }
        }
    } 
}
