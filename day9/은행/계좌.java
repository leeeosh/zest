package 은행;

public class 계좌 {
	//전역 변수에 해당한다.
	String account;
	String name;
	int money;
	
	public 계좌(String account, String name, int money) {
		this.account = account;
		this.name = name;
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "계좌 : "+account + " 이름 : " + name+" 금액 : "+money;
	}
}
