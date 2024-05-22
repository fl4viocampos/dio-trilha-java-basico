import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Leitura dos números do usuário
            System.out.print("Digite o primeiro número: ");
            int primeiroNumero = scanner.nextInt();
            
            System.out.print("Digite o segundo número: ");
            int segundoNumero = scanner.nextInt();
            
            try {
                // Tentativa de contagem e impressão dos números
                contar(primeiroNumero, segundoNumero);
            } catch (ParametrosInvalidosException e) {
                // Captura e exibição da exceção personalizada
                System.out.println(e.getMessage());
            }
        }
    }

    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        // Verifica se o primeiro número é maior ou igual ao segundo
        if (primeiroNumero >= segundoNumero) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        // Calcula a diferença entre os números
        int diferenca = segundoNumero - primeiroNumero;
        
        // Loop para imprimir os números incrementados
        for (int i = 1; i <= diferenca; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
