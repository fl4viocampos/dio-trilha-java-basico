public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super("O segundo parametro deve ser maior que o primeiro ");
    }
}
