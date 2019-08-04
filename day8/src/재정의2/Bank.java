package 재정의2;

import javax.swing.JOptionPane;

public class Bank {
	
	double rate;
	
	public Bank() {
		String i = JOptionPane.showInputDialog("이자율 입력");
		rate = Double.parseDouble(i);
	}
	
	public void getint() {
		System.out.println("이자율 : "+rate);
		
	}
	
	
}
