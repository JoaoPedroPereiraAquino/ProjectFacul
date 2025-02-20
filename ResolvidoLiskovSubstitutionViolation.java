public class ResolvidoLiskovSubstitutionViolation {
    public static void main(String[] args) {
        AveQueVoa ave1 = new Andorinha();
        ave1.voar();

        Ave ave2 = new Avestruz();
        ((Avestruz) ave2).correr();
    }
}

abstract class Ave {
}

abstract class AveQueVoa extends Ave {
    public abstract void voar();
}

class Andorinha extends AveQueVoa {
    @Override
    public void voar() {
        System.out.println("Andorinha está voando.");
    }
}

class Avestruz extends Ave {
    public void correr() {
        System.out.println("Avestruz está correndo.");
    }
}
