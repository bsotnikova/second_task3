public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
    int term = 24;
    double payment = service.calculate(term);
    System.out.println(payment);
}

}
