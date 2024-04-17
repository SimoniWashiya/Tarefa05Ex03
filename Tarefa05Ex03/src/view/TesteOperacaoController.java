package view;

public class TesteOperacaoController {

    public static void main(String[] args) {
        OperacaoController operacaoController = new OperacaoController();

        // Testando com um número par
        try {
            int resultadoPar = operacaoController.operacaoValor(4);
            System.out.println("Resultado para número par: " + resultadoPar);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Testando com um número ímpar
        try {
            int resultadoImpar = operacaoController.operacaoValor(5);
            System.out.println("Resultado para número ímpar: " + resultadoImpar);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Testando com um número negativo
        try {
            int resultadoNegativo = operacaoController.operacaoValor(-3);
            System.out.println("Resultado para número negativo: " + resultadoNegativo);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
