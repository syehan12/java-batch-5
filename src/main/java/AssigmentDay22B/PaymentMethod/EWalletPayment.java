package AssigmentDay22B.PaymentMethod;

public class EWalletPayment
        extends PaymentMethod {

    private double cashbackRate;

    public EWalletPayment(
            String transactionId,
            double balance,
            double cashbackRate) {

        super(transactionId, balance);

        this.cashbackRate = cashbackRate;
    }

    @Override
    public boolean pay(double amount) {

        if (amount <= 0) {
            return false;
        }

        if (amount > balance) {
            return false;
        }

        balance = balance - amount;

        double cashback =
                amount * cashbackRate;

        balance = balance + cashback;

        return true;
    }
}