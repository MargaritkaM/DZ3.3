public class CreditPaymentService {
    public int calculate(float summa, float period) {
        float result;
        float monthlyPercentage;
        {
            monthlyPercentage = (float) 9.99 / (100 * 12);
            result = (int) (summa * (monthlyPercentage / (1 - Math.pow(1 + monthlyPercentage, -period))));
        }
        return (int) result;
    }
}
