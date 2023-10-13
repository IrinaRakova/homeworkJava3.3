public class CreditPaymentService {
    public int calculate(int amount, double percent, int years) {
        int months;//количество месяцев, в течение которых производятся выплаты
        months = years * 12;
        double percentToHundred = percent / 100;
        double repayment = amount * percentToHundred / 12 * Math.pow(1 + (percentToHundred / 12), months) / (Math.pow(1 + (percentToHundred / 12), months) - 1);
        return (int) repayment;
    }
}
