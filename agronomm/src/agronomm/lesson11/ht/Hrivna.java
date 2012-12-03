package agronomm.lesson11.ht;

/**
 * Created with IntelliJ IDEA.
 * User: Ленчик
 * Date: 03.12.12
 * Time: 22:00
 * To change this template use File | Settings | File Templates.
 */
public class Hrivna extends Money {
    private int value;

    public Hrivna() {
        super(1, "UAH");
    }

    public Hrivna(int rate) {
        super(rate, "UAH");
    }

    @Override
    public void setValue(int value) {
        if (value == 20 || value == 50
                || value == 100 || value == 200 || value == 500) {
            this.value = value;
        } else {
            System.out.println("ERROR!!!!!! - " + value + " - is incorrect");
        }
    }

    @Override
    public int getValue() {
        return value;
    }
}
