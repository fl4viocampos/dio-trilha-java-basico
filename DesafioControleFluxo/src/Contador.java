import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            int primeiroNumero = scanner.nextInt();
            
            System.out.print("Digite o segundo número: ");
            int segundoNumero = scanner.nextInt();
            
            try {
                contar(primeiroNumero, segundoNumero);
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (primeiroNumero >= segundoNumero) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        int diferenca = segundoNumero - primeiroNumero;
        for (int i = 1; i <= diferenca; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
