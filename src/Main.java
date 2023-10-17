/*
1. Класс Account превратить в интерфейс с методами:
double getAmount() - получение текущего баланса
# void put(double amount) - пополнить счет
# void take(double amount) - снять средства со счета

2. Создать базовый абстрактный класс AbstractAccount, в котором будет общая часть:
поле с балансом
конструктор, который принимает начальное значение баланса
реализация всех методов

3. Добавить еще один класс FixedAmountAccount с особенностью: методы put, take НЕ изменяют баланс.

4. Класс AbstractAccount можно реализовать хитрее. Пример ниже. */

// public abstract class AbstractAccount /* implements Account */ {

// поля класса

// @Override
// public final void take(double amount) {
//        if (amount >= 0) {
//        doTake(amount);
// } else {
// throw new IllegalArgumentException("Сумма снятия должна быть положительной");
//     }
//      }
//
//protected void doTake(double amount) {
//      this.amount -= amount;
//        }
//
//        }
//
//        }
//
//

public class Main {
    public static void main(String[] args) {

        Account account = new FixedAmountAccount(1000);

        // Вывести текущий баланс счёта
        double balance = account.getAmount();
        System.out.println("Текущий баланс: " + balance);

        // Попытка пополнить баланс счёта
        account.put(500);
        balance = account.getAmount();
        System.out.println("Новый баланс после пополнения: " + balance);

        // Попытка вывести средства со счёта
        account.take(200);
        balance = account.getAmount();
        System.out.println("Новый баланс после снятия: " + balance);
    }
}