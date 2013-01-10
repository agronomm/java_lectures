package roman.lesson12;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Ленчик
 * Date: 10.01.13
 * Time: 22:51
 * To change this template use File | Settings | File Templates.
 */
public class ArrayKoshelek {
    // масив денег - ссылка на несуществующий массив
    private ArrayList<Money> moneys;


    public ArrayKoshelek(int capacity) {
        // масиву денег присваиваем новый обьект - массив из денег в количестве
        // capacity штук
        moneys = new ArrayList<Money>(capacity);
    }


    /**
     * кладет деньги в кощелек
     *
     * @param money
     *            - конкретная деньга(гривна или бакс) даже купюра я бы сказал
     */
    public void put(Money money) {
        // положить купюру на место номер current, а саму current после этого
        // увеличить на 1
        moneys.add(money);
    }


    /**
     * сколько всего денег в кошельке
     *
     * @return количество денег, в гривне, в кошельке с учетом курса доллара
     */
    public int howMuch() {
        int resultSumm = 0;

        // альтернатива
        // пока у нас есть деньги и кошелек не закончился
        // к сумме прибавляем значение купюры умноженное на курс
        resultSumm = 0;
        for (Money m : moneys) {
            resultSumm += m.getValue() * m.getRate();
        }

        return resultSumm;
    }

    //публичный метод который ничего не требует что бы его вызвали,
    // но он обязан вернуть Money
    public Money get() {
        Money resultMoney = moneys.get(moneys.size() - 1);
        moneys.remove(resultMoney);
        return resultMoney;
    }
}
