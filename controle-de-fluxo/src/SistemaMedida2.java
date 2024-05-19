public class SistemaMedida2 {
    public static void main(String[] args) {
        //Exercício elaborado com Switch case.

        String sigla = "L";

            switch ( sigla ) {
                case "P":{
                    System.out.println("PEQUENO");
                    break;
                }
                case "M":{
                    System.out.println("MEDIO");
                    break;
                }
                case "G":{
                    System.out.println("GRANDE");
                    break;
                }
                default:
                    System.out.println("INDEFINIDO");
                }
            }
            
    }
