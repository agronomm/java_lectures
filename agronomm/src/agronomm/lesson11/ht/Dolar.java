package agronomm.lesson11.ht;

/**
 * Created with IntelliJ IDEA.
 * User: Ленчик
 * Date: 03.12.12
 * Time: 21:59
 * To change this template use File | Settings | File Templates.
 */
public class Dolar extends Money {
    private int value;

    public Dolar() {
        super(8, "USD");
    }

    public Dolar(int rate) {
        super(rate, "USD");
    }

    @Override
    public void setValue(int value) {
        if (value == 1 || value == 2 || value == 5 || value == 10 || value == 20 || value == 50
                || value == 100) {
            this.value = value;
        } else {
            System.out.println("ERROR!!!!!! - " + value + " - is incorrect");
        }
    }

    @Override
    public int getValue() {
        return value;
    }

    public int getByRate() {
        return getValue() * getRate();
    }
}
