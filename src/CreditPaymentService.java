public class CreditPaymentService {
    public int calculate(int amount, double percent, int years) {
        double repayment;//ежемесячная выплата
        int months;//количество месяцев, в течение которых производятся выплаты
        double percentToHundred;
        percentToHundred = percent / 100;
        months = years * 12;

        repayment = amount * percentToHundred / 12 * Math.pow(1 + (percentToHundred / 12), months) / (Math.pow(1 + (percentToHundred / 12), months) - 1);
        return (int) repayment;
    }
}
