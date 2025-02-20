public class OpenClosedRefactored {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator(new VIPDiscount());
        System.out.println("Discount: " + calculator.calculateDiscount(200));
    }
}


interface DiscountStrategy {
    double applyDiscount(double amount);
}


class RegularDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.1;
    }
}

class VIPDiscount implements DiscountStrategy {
    public double applyDiscount(double amount) {
        return amount * 0.2;
    }
}


class DiscountCalculator {
    private final DiscountStrategy discountStrategy;

    public DiscountCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(double amount) {
        return discountStrategy.applyDiscount(amount);
    }
}
