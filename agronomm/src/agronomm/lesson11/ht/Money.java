package agronomm.lesson11.ht;

/**
 * Created with IntelliJ IDEA.
 * User: Ленчик
 * Date: 29.11.12
 * Time: 23:28
 * To change this template use File | Settings | File Templates.
 */
public abstract class Money {

    //валюта
    protected String currency;
    //курс
    private int rate;

    public void setValue(int value) {
        value = 0;
    }

    public int getValue() {
        return 0;
    }

    public Money(int rate, String currency) {
        this.rate = rate;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public int getRate() {
        return rate;
    }

}
