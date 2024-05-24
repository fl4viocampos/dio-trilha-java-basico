import java.util.Scanner;

public class VerificadorNumeroConta {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String numeroConta = scanner.nextLine();
            verificarNumeroConta(numeroConta);

            
            
        } catch (IllegalArgumentException e) {
            
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8) {
          System.out.println("Numero de conta valido.");
          
            
        }
        else {
          throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }  
    }
}