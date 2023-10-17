public class FixedAmountAccount extends AbstractAccount {
    public FixedAmountAccount(double balance) {
        super(balance);
    }

    public void put(double amount) {
        /* Метод НЕ должен изменять баланс.
        Попытка вызвать метод выбросит исключение "Неподдерживаемая операция" с сообщением.
        */
        throw new UnsupportedOperationException("Операция 'Пополнение счёта' не позволена!");
    }

    public void take(double amount) {
        /* Метод НЕ должен изменять баланс.
        Попытка вызвать метод выбросит исключение "Неподдерживаемая операция" с сообщением.
        */
        throw new UnsupportedOperationException("Операция 'Снятие со счёта' не позволена!");
    }
}
