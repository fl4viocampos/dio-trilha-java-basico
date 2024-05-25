import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        //System.out.println("Informe o limite diário de saque:");
        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1;; i++) {
            // Solicita ao usuário o valor do saque
            //System.out.println("Informe o valor do saque " + i + ": (ou digite 0 para encerrar)");
            double valorSaque = scanner.nextDouble();

            // Verifica se o valor do saque é zero, encerrando as transações
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            // Verifica se o valor do saque ultrapassa o limite diário
            if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            // Subtrai o valor do saque do limite diário
            limiteDiario -= valorSaque;
            System.out.println("Saque realizado. Limite restante: " + limiteDiario);
        }

        // Fechamos o Scanner para evitar vazamento de recursos
        scanner.close(); 
    }
}