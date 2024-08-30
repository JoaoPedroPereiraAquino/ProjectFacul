public class Main {
    public static void main(String[] args) {
        // Instanciando um objeto da classe ContaBancaria com saldo inicial de 1000.00
        ContaBancaria conta = new ContaBancaria(1000.00);
        
        // Depositando 500.00 na conta
        conta.depositar(500.00);
        
        // Sacando 200.00 da conta
        conta.sacar(200.00);
        
        // Exibindo o saldo atual
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}