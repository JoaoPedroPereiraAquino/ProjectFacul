public class ContaBancaria {
    // Atributos privados para armazenar as informações da conta
    private String titular;  // Nome do titular da conta
    private int numeroConta; // Número único que identifica a conta
    private double saldo;    // Saldo atual da conta

    // Construtor da classe que inicializa os atributos com valores fornecidos
    public ContaBancaria(String titular, int numeroConta, double saldoInicial) {
        this.titular = titular;          // Inicializa o titular da conta
        this.numeroConta = numeroConta;  // Inicializa o número da conta
        this.saldo = saldoInicial;       // Inicializa o saldo com o valor fornecido
    }

    // Métodos acessores (getters e setters) para manipular os atributos privados

    // Retorna o nome do titular da conta
    public String getTitular() {
        return titular;
    }

    // Atualiza o nome do titular da conta
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Retorna o número da conta
    public int getNumeroConta() {
        return numeroConta;
    }

    // Atualiza o número da conta
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    // Retorna o saldo atual da conta
    public double getSaldo() {
        return saldo;
    }

    // Métodos para manipulação de dados (depósito e saque)

    // Método para adicionar um valor ao saldo da conta
    public void depositar(double valor) {
        // Verifica se o valor é positivo
        if (valor > 0) {
            saldo += valor;  // Adiciona o valor ao saldo atual
        } else {
            // Exibe uma mensagem de erro caso o valor seja negativo
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }

    // Método para subtrair um valor do saldo da conta
    public void sacar(double valor) {
        // Verifica se o valor é positivo
        if (valor > 0) {
            // Verifica se o saldo é suficiente para o saque
            if (saldo >= valor) {
                saldo -= valor;  // Subtrai o valor do saldo atual
            } else {
                // Exibe uma mensagem de erro caso o saldo seja insuficiente
                System.out.println("Erro: Saldo insuficiente.");
            }
        } else {
            // Exibe uma mensagem de erro caso o valor seja negativo
            System.out.println("Erro: O valor do saque deve ser positivo.");
        }
    }
}
