package AssigmentDay22B.PaymentMethod;

public class CreditCardPayment
        extends PaymentMethod
        implements Refundable {

    private double creditLimit;

    public CreditCardPayment(
            String transactionId,
            double balance,
            double creditLimit) {

        super(transactionId, balance);

        if (creditLimit < 0) {
            this.creditLimit = 0.0;
        } else {
            this.creditLimit = creditLimit;
        }
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    @Override
    public boolean pay(double amount) {

        if (amount <= 0) {
            return false;
        }

        if (amount > balance + creditLimit) {
            return false;
        }

        if (amount <= balance) {

            balance = balance - amount;

        } else {

            double remaining =
                    amount - balance;

            balance = 0.0;

            creditLimit =
                    creditLimit - remaining;
        }

        return true;
    }

    @Override
    public boolean processRefund(double amount) {

        if (amount <= 0) {
            return false;
        }

        balance = balance + amount;

        return true;
    }
}