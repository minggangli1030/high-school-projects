package Class12.Jul16;

public class Machine_2 {

	public static void main(String[] args) {
		Machine m = new Machine();

		m.insertCash(5);
		m.insertCash(10);
		m.insertCash(1);
		m.insertCash(100);

		// 按一下按钮
		int coins = m.exchange();
		System.out.println("拿到了" + coins + "个游戏币");

	}
}