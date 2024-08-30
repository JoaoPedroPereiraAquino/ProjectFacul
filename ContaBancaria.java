class ContaBancaria {
    // Atributo saldo declarado como private para proteger o acesso direto
    private double saldo;

    // Construtor que inicializa o saldo
    public ContaBancaria(double saldoInicial) {
        // Corrigido: O uso de this.saldo para diferenciar o atributo da classe do parâmetro
        this.saldo = saldoInicial;
    }

    // Metodo para depositar um valor na conta
    public void depositar(double valor) {
        // Corrigido: O uso de this.saldo para garantir que estamos alterando o atributo da classe
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    // Metodo para sacar um valor da conta
    public void sacar(double valor) {
        // Corrigido: O uso de this.saldo para garantir que estamos alterando o atributo da classe
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        }
    }

    // Metodo para obter o saldo atual
    public double getSaldo() {
        // Corrigido: O uso de this.saldo para retornar o valor do atributo da classe
        return this.saldo;
    }
}