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
		return "�� ���� ���忡�� "+mon+"������ ����־�� ";
	}

}
