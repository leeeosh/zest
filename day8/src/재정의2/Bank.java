package ������2;

import javax.swing.JOptionPane;

public class Bank {
	
	double rate;
	
	public Bank() {
		String i = JOptionPane.showInputDialog("������ �Է�");
		rate = Double.parseDouble(i);
	}
	
	public void getint() {
		System.out.println("������ : "+rate);
		
	}
	
	
}
