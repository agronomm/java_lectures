package agronomm.lesson11.ht;

/**
 * Created with IntelliJ IDEA.
 * User: Ленчик
 * Date: 29.11.12
 * Time: 23:28
 * To change this template use File | Settings | File Templates.
 */
public abstract class Money {
    //сумма
    int value;
    //валюта
    String currency;
    //курс
    int rate;

    public abstract void setValue(int value);


}
