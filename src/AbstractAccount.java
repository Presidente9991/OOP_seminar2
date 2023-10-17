public abstract class AbstractAccount implements Account {
    protected double balance;

    public AbstractAccount(double balance) {
        this.balance = balance;
    }

    public double getAmount() {
        return balance;
    }

    public void put(double amount) {
        // Пополнение счета
        balance += amount;
    }

    public void take(double amount) {
        // Снятие средств со счета
        balance -= amount;
    }
}