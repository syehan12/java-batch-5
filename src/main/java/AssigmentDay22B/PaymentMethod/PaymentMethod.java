package AssigmentDay22B.PaymentMethod;

public abstract class PaymentMethod {

    protected String transactionId;
    protected double balance;

    public PaymentMethod(
            String transactionId,
            double balance) {

        this.transactionId = transactionId;
        this.balance = balance;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getBalance() {
        return balance;
    }

    public abstract boolean pay(double amount);
}