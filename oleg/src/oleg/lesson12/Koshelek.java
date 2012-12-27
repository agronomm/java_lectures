package oleg.lesson12;

public class Koshelek {
	Money[] moneys;
	int current;

	public Koshelek(int capacity) {
		current = 0;
		moneys = new Money[capacity];
	}

	public void bay() {
		moneys[current--] = null;
	}

	public void put(Money money) {
		moneys[current++] = money;
	}

	public int howMach() {
		int resultSumm = 0;
		for (int i = 0; i < current && i < moneys.length; i++) {
			Money m = moneys[i];
			resultSumm += m.getValue() * m.getRate();
		}
		return resultSumm;
	}

	public String toString() {
		int summUAH = 0;
		int summUSD = 0;
		int summEUR = 0;
		for (int i = 0; i < current; i++) {
			Money m = moneys[i];
			if (m.getCurrensy().equals("UAH")) {
				summUAH += m.getValue();
			} else if (m.getCurrensy().equals("USD")) {
				summUSD += m.getValue();
			} else if (m.getCurrensy().equals("EUR")) {
				summEUR += m.getValue();
			} else {
				System.out.println("Ты уверен, что это деньги?");

			}
		}
		return "В кошельке нахится" + summUAH + "грнивень" + summUSD + "долларов" + summEUR + "евро";
	
	public 
	}
}
