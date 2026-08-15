package AssigmentDay22B.PaymentMethod;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment cc =
                new CreditCardPayment(
                        "TXN-01",
                        100.0,
                        500.0
                );

        System.out.println(
                "Credit Card Pay: "
                        + cc.pay(200.0)
        );

        System.out.println(
                "Credit Card Balance: "
                        + cc.getBalance()
        );

        System.out.println(
                "Credit Limit: "
                        + cc.getCreditLimit()
        );

        System.out.println(
                "Credit Card Refund: "
                        + cc.processRefund(50.0)
        );

        System.out.println(
                "Balance After Refund: "
                        + cc.getBalance()
        );

        System.out.println();

        EWalletPayment wallet =
                new EWalletPayment(
                        "TXN-02",
                        100.0,
                        0.10
                );

        System.out.println(
                "E-Wallet Pay: "
                        + wallet.pay(50.0)
        );

        System.out.println(
                "E-Wallet Balance: "
                        + wallet.getBalance()
        );

        System.out.println();

        // Interface Type Checking
        System.out.println(
                "Credit Card is Refundable: "
                        + (cc instanceof Refundable)
        );

        System.out.println(
                "E-Wallet is Refundable: "
                        + (wallet instanceof Refundable)
        );
    }
}