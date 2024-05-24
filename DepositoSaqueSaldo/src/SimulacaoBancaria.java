import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
           
            System.out.println("Selecione uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Verificar Saldo");
            System.out.println("0. Sair");
            
           int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("saldo atual é : R$ " + String.format("%.1f",saldo));
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("saldo atual é : R$ " + String.format("%.1f",saldo));
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("saldo atual é : R$ " + String.format("%.1f",saldo));
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}