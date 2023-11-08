public class Lacos_Numericos {
    public static void main(String[] args) {
        // 1 2 3 4 5 6 7 8 9 10
        // para uma variável que inicia em 1, e vai até 10, mudando 1-por-1, faça:
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // Incremento de 10
        for (int j = 0; j <= 500; j+=10) {
            System.out.println(j);
        }
        // usando duas variáveis
        for (int k = 1; k <= 10; k++){
            for (int l = 1; l <= 10; l++){
                System.out.println(k + " x " + l + " = " + (l * k));
            }
        }
        // FizzBuzz
        for (int m = 1; m <= 100; m++){
            if(m % 3 == 0 && m % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(m % 3 == 0){
                System.out.println("Fizz");
            } else if(m % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(m);
            }
        }
    }
}
