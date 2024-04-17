package view;

public class OperacaoController {

    public int operacaoValor(int numero) throws ArithmeticException {
        if (numero < 0) {
            throw new ArithmeticException("O par�metro n�o pode ser negativo.");
        }

        if (numero % 2 == 0) {
            return numero * numero; // Retorna o quadrado do n�mero se for par
        } else {
            return numero * numero * numero; // Retorna o cubo do n�mero se for �mpar
        }
    }
}
