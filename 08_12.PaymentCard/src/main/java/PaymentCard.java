public class PaymentCard {

    private double balance;
    private final double amountAffordably = 2.6;
    private final double amountHeartily = 4.6;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        if ((balance - amountAffordably) >= 0) {
            balance -= amountAffordably;
        }
    }

    public void eatHeartily() {
        if ((balance - amountHeartily) >= 0) {
            balance -= amountHeartily;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            if (balance + amount > 150) {
                balance = 150;
            } else {
                balance += amount;
            }
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}
