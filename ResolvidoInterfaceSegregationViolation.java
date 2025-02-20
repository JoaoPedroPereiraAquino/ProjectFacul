public class ResolvidoInterfaceSegregationViolation {
    public static void main(String[] args) {
        ImpressoraBasica impressora = new ImpressoraBasica();
        impressora.imprimir();

        ImpressoraAvancada impressoraAvancada = new ImpressoraAvancada();
        impressoraAvancada.imprimir();
        impressoraAvancada.digitalizar();
        impressoraAvancada.enviarFax();
    }
}

interface Impressora {
    void imprimir();
}

interface Digitalizadora {
    void digitalizar();
}

interface Fax {
    void enviarFax();
}

class ImpressoraBasica implements Impressora {
    public void imprimir() {
        System.out.println("Imprimindo...");
    }
}

class ImpressoraAvancada implements Impressora, Digitalizadora, Fax {
    public void imprimir() {
        System.out.println("Imprimindo...");
    }

    public void digitalizar() {
        System.out.println("Digitalizando...");
    }

    public void enviarFax() {
        System.out.println("Enviando fax...");
    }
}
