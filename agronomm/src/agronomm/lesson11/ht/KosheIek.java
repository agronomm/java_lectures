package agronomm.lesson11.ht;

/**
 * Created with IntelliJ IDEA.
 * User: ������
 * Date: 10.12.12
 * Time: 23:08
 * To change this template use File | Settings | File Templates.
 */
public class KosheIek extends Koshelek{
    /**
     * �����������, ������� ����� �������
     *
     * @param capacity - ������ ��������
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
