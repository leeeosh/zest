package Static;

public class Acc {

	String product;
	String name;
	int mon;
	static int total;
	static int count;

	public Acc(String product, String name, int mon) {

		this.product = product;
		this.name = name;
		this.mon = mon;
		count++;
		total = total + mon;
	}

	@Override
	public String toString() {
		return "내 비상금 통장에는 "+mon+"만원이 들어있어요 ";
	}

}
