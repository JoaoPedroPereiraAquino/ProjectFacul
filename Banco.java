public class Banco {
    public static void main(String[] args) {
        // Cria uma nova instância de ContaBancaria com valores iniciais
        ContaBancaria conta = new ContaBancaria("João Silva", 12345, 1000.0);

        // Exibe as informações iniciais da conta usando os métodos getters
        System.out.println("Titular: " + conta.getTitular());          // Exibe o titular da conta
        System.out.println("Número da Conta: " + conta.getNumeroConta());  // Exibe o número da conta
        System.out.println("Saldo Inicial: " + conta.getSaldo());      // Exibe o saldo inicial da conta

        // Realiza um depósito na conta
        conta.depositar(500.0);  // Deposita 500.0 na conta
        System.out.println("Saldo após depósito de 500.0: " + conta.getSaldo()); // Exibe o saldo após o depósito

        // Realiza um saque da conta
        conta.sacar(200.0);  // Saca 200.0 da conta
        System.out.println("Saldo após saque de 200.0: " + conta.getSaldo()); // Exibe o saldo após o saque

        // Testa o saque com saldo insuficiente
        conta.sacar(1500.0);  // Tenta sacar 1500.0, mas o saldo é insuficiente

        // Testa o depósito com valor negativo
        conta.depositar(-100.0);  // Tenta depositar um valor negativo, o que é inválido
    }
}
