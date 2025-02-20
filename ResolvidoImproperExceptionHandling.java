public class ResolvidoImproperExceptionHandling {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            System.out.println("Resultado: " + calculator.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisao por zero não é possivel.");
        }
    }
}


class Calculator {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Impossivel dividir por zero.");
        }
        return a / b;
    }
}
