package seminars.fourth.card;

public class PaymentForm {
    private CreditCard creditCard;

    public PaymentForm(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void pay(double amount) {

        double summ = amount * 0.97;
        creditCard.charge(summ);
    }
}
