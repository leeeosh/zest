package 성적처리;

public class 명단 {
	String name;
	String sub;
	int score;
	public 명단(String name, String sub, int score) {
		this.name = name;
		this.sub = sub;
		this.score = score;
	}
	@Override
	public String toString() {
		return "명단 [name=" + name + ", sub=" + sub + ", score=" + score + "]";
	}
	
	
	

}
