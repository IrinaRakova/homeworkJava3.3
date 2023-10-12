public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный платеж, при сроке погашения кредита 1 год, составит: " + service.calculate(1_000_000, 9.99, 1));
        System.out.println("Ежемесячный платеж, при сроке погашения кредита 2 года, составит: " + service.calculate(1_000_000, 9.99, 2));
        System.out.println("Ежемесячный платеж, при сроке погашения кредита 3 года, составит: " + service.calculate(1_000_000, 9.99, 3));
    }
}