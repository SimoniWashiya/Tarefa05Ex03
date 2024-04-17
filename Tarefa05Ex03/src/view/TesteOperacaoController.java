package view;

public class TesteOperacaoController {

    public static void main(String[] args) {
        OperacaoController operacaoController = new OperacaoController();

        // Testando com um n�mero par
        try {
            int resultadoPar = operacaoController.operacaoValor(4);
            System.out.println("Resultado para n�mero par: " + resultadoPar);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Testando com um n�mero �mpar
        try {
            int resultadoImpar = operacaoController.operacaoValor(5);
            System.out.println("Resultado para n�mero �mpar: " + resultadoImpar);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Testando com um n�mero negativo
        try {
            int resultadoNegativo = operacaoController.operacaoValor(-3);
            System.out.println("Resultado para n�mero negativo: " + resultadoNegativo);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
