import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {
        // ctrl + c -> para comentar
        // String[] letras = new String[5];
        // // [0] [1] [2] [3] [4]
        // letras[0] = "A";
        // letras[1] = "B";
        // letras[2] = "C";
        // letras[3] = "J";
        // letras[4] = "X";
        // for (int i=0; i < letras.length; i++){
        //     System.out.println(letras[i]);
        // }
        String[] letras = {"A", "B", "C", "J", "X", "EXTRA"};
        for (int i=0; i < letras.length; i++){
            System.out.println(letras[i]);
        }
        System.out.println(Arrays.toString(letras));
    }
}
