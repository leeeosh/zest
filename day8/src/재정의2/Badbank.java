package 재정의2;

public class Badbank extends Bank {
	@Override
	public void getint() {
		// TODO Auto-generated method stub
		super.getint();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BadBank의 이자율 : "+rate;
	}

}
