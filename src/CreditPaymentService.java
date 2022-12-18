public class CreditPaymentService {
    public int calculate(int mounth, double percent, int sum) {
        double rate = percent / 12 / 100;           // Ставка по кредиту в месяц
        double rateSum = 1 + rate;                  // Расчет для формулы
        double coef = (rate * Math.pow(rateSum, mounth) / (Math.pow(rateSum, mounth) - 1)); // Формула коэффициента аннуитетного платежа
        double result = coef * sum;
        return (int) result;
    }
}
