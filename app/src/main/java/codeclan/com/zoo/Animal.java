package codeclan.com.zoo;

/**
 * Created by user on 10/11/2017.
 */

public abstract class Animal {

    private int cashValue;

    public Animal(int cashValue) {
        this.cashValue = cashValue;
    }

    public int getCashValue() {
        return cashValue;
    }
}
