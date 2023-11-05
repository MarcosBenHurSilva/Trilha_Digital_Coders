import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_7 {
    private double saldo;

    public Exercicio_7() {
        saldo = 0.00;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + formatarValor(valor) + " efetuado.");
        } else {
            System.out.println("Valor de depósito inválido. Digite um valor positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + formatarValor(valor) + " efetuado.");
        } else {
            System.out.println("Saque não permitido, saldo insuficiente.");
        }
    }

    private String formatarValor(double valor) {
        DecimalFormat formato = new DecimalFormat("#0.00");
        return formato.format(valor);
    }
    public static void main(String[] args) {
        Exercicio_7 conta = new Exercicio_7();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Saldo é: " + conta.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor a retirar: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
