public class LojaDeVerdurasTeste {

    // Método para calcular o MMC de dois números
    public static int calcularMMC(int a, int b) {
        return (a * b) / calcularMDC(a, b);
    }

    // Método para calcular o MDC de dois números
    private static int calcularMDC(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcularMDC(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 15;
        int mmc = calcularMMC(num1, num2);
        System.out.println("O MMC de " + num1 + " e " + num2 + " é: " + mmc);
    }
}