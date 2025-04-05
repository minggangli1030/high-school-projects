package Class12.Jul16;

public class GetterandSetter {
	public String id;   // 学号
	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	protected String name;  // 姓名
	private boolean sex; // true: 男 false 女
	public String cellphone; // 手机号
	public int score; //分数
	
	public static void main(String[] args) {
		

	}

}
