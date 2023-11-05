import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Obter_Numeros {
    public static List<Integer> lista_numeros() {
        List<Integer> lista_numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (lista_numeros.size() < 10) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            lista_numeros.add(numero);
        }
        scanner.close();
        return lista_numeros;
    }
}
