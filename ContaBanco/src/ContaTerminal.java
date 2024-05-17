import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception  {
        
     Scanner scanner = new Scanner(System.in);

     

     System.out.println("Digite seu nome");
     String nome = scanner.next();

     System.out.println("Digite a sua agencia");
     String agencia = scanner.next();
     
     System.out.println("Digite a sua conta");
     int numero = scanner.nextInt();

     
     System.out.println("Digite seu saldo");
     Double saldo = scanner.nextDouble();

     System.out.println(" Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque. ");

    
        scanner.close(); // Não foi visto em aula, mas pesquisando achei esse comando que garante que o Scanner será fechado não ira consumir recursos.

    
}

}

