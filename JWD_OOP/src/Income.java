
public class Income {

	protected double income;

	public double getTax() {
		return income * 0.1;
	}

	public double totalTax(Income... incomes) {
		double total = 0;
		for (Income income : incomes) {
			total = total + income.getTax();
		}
		return total;
	}

	public static void main(String[] args) {
		Income myincome = new Income();
		myincome.totalTax();
	}
}
