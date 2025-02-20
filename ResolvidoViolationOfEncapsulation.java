public class ResolvidoViolationOfEncapsulation {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);
        System.out.println("Saldo inicial: " + conta.getSaldo());

        if (conta.sacar(500)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }
}
