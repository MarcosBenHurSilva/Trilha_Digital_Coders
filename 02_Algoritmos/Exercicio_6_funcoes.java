import java.util.List;

public class Exercicio_6_funcoes {
    public static void main(String[] args) {
        System.out.println("Vamos obter os números: ");
        List<Integer> numeros = Obter_Numeros.lista_numeros();

        System.out.print("Números obtidos: [");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
            if (i < numeros.size() - 1) {
                System.out.print(", "); // Adiciona vírgula apenas se não for o último número
            } else { 
                System.out.println("]");
            }
        }      
    }
}
