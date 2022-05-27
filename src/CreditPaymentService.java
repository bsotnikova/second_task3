public class CreditPaymentService {
    /* 9,99% /12 /100 = 0,008325 | 0.002775 ежемесячная проц ставка
       0,008325*(1+0,008325)^12/((1+0,008325)^12—1)=? коэф на срок 12 месяцев
       0,008325 * 1.1046035141003447 / 0.1046035141003447 = 0.0091958242548853696275 / 0.1046035141003447
       0.0879112364
     */

    public double calculate (int term) {
        double percent = 9.99;
        double percentMonth = percent / 12 / 100;
        double a = 1 + percentMonth;
        int b = term;
        double pow = Math.pow(a, b);
        double coefficient = percentMonth * pow / (pow - 1);
        double dpayment = 1000000 *  coefficient;
        int payment = (int) dpayment;
        return payment;
    }
}
