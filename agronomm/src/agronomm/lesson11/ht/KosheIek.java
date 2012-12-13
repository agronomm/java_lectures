package agronomm.lesson11.ht;

/**
 * Created with IntelliJ IDEA.
 * User: Ленчик
 * Date: 10.12.12
 * Time: 23:08
 * To change this template use File | Settings | File Templates.
 */
public class KosheIek extends Koshelek{
    /**
     * конструктор, создает новый кошелек
     *
     * @param capacity - размер кошелька
     */
    public KosheIek(int capacity) {
        super(capacity);
    }

    @Override
    public void bay() {
        moneys = new Money[10];
        current = 0;
    }
}
