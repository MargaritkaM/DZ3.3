public class CreditPaymentService {
    public float calculate(float a, float b) {
        float result;
        float x;
        {
            x = (float) Math.pow(1.008, -b);
            result = (float) (a * (0.008 / (1 - x)));
        }
        return result;
    }
}
