public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println((" Ежемесячный платеж на 12 месяцев: ") + (service.calculate(1_000_000, 12)));
        System.out.println((" Ежемесячный платеж на 24 месяца: ") + (service.calculate(1_000_000, 24)));
        System.out.println((" Ежемесячный платеж на 36 месяцев: ") + (service.calculate(1_000_000, 36)));
    }
}