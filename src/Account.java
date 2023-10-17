public interface Account {
    double getAmount(); // получение текущего баланса
    void put(double amount); // пополнить счёт
    void take(double amount); // снять средства со счета
}