package ����ó��;

import javax.swing.JOptionPane;

public class ����ó�� {
	public static void main(String[] args) {
		int sum = 0;
		int sco = 0;
		
		String i1 = JOptionPane.showInputDialog("�̸� �Է�");
		String i2 = JOptionPane.showInputDialog("�Ҽ� �Է�");
		for (int j = 0; j < 3; j++) {
			String i3 = JOptionPane.showInputDialog("���� �Է�");
			sco = Integer.parseInt(i3);
			sum = sum + sco;
		}
		
		
		
		��� lay = new ���(i1, i2, sco);
		JOptionPane.showMessageDialog(null, lay);
		JOptionPane.showMessageDialog(null, "���� : "+sum+" ��� : "+(sum/3));
		
		
		
		
		
		
		
		
	}
	
}
