package ����;

public class ���� {
	//���� ������ �ش��Ѵ�.
	String account;
	String name;
	int money;
	
	public ����(String account, String name, int money) {
		this.account = account;
		this.name = name;
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "���� : "+account + " �̸� : " + name+" �ݾ� : "+money;
	}
}
