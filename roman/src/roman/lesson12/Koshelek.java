package roman.lesson12;

public class Koshelek {
	// масив денег - ссылка на несуществующий массив
	Money[] moneys;
	// текущее место для вставки денег
	int current;

	/**
	 * конструктор, создает новый кошелек
	 * 
	 * @param capacity
	 *            - размер кошелька
	 */
	public Koshelek(int capacity) {
		// текушее место для вставки денег в кошелек(начнем с 0)
		current = 0;
		// масиву денег присваиваем новый обьект - массив из денег в количестве
		// capacity штук
		moneys = new Money[capacity];
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
		moneys[current++] = money;
	}

	/**
	 * сколько всего денег в кошельке
	 * 
	 * @return количество денег, в гривне, в кошельке с учетом курса доллара
	 */
	public int howMuch() {
		int resultSumm = 0;
		// пока у нас есть деньги и кошелек не закончился, посмотреть что за
		// купюра
		// если гривна - добавить к результату, если доллар - умножить на курс и
		// все
		// равно добавить к результату
		for (int i = 0; i < current && i < moneys.length; i++) {
			Money m = moneys[i];
			if (m.getCurrency().equals("UAH")) {
				resultSumm += m.getValue();
			} else if (m.getCurrency().equals("USD")) {
				resultSumm += m.getValue() * m.getRate();
			}
			else if (m.getCurrency().equals("EUR")) {
				resultSumm += m.getValue() * m.getRate();
			}
		}
		// альтернатива
		// пока у нас есть деньги и кошелек не закончился
		// к сумме прибавляем значение купюры умноженное на курс

		for (int i = 0; i < current && i < moneys.length; i++) {
			Money m = moneys[i];
			resultSumm += m.getValue() * m.getRate();
		}

		return resultSumm;
	}

	// возвращает нам описание того - что лежит в кошельке
	// так сказать ответ на вопрос "Что у тебя там?"
	//
	public String toString() {
		return "В кошельке";
	}
}
