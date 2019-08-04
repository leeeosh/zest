package 재정의2;

public class Goodbank extends Bank {
	@Override
	public void getint() {
		// TODO Auto-generated method stub
		super.getint();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "GoodBank의 이자율 : "+rate;
	}
}
