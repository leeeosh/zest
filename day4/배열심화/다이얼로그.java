package �迭��ȭ;

import javax.swing.JOptionPane;

public class ���̾�α� {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "ȯ���մϴ�."); /*�տ� null�� ���ο� �Ǵٸ� â�� ��� ������ ���� ���̴�. 
															���� ��ɾ�ó�� �̷��� ���� ����ϴ� ��ǰ�� new ���� �ٷ� ��� �����ϴ�.*/
		
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���"); //â���� �Է��� ���ڿ��� name�̶�� ������ ���� �Ǵ� �ý���!
		JOptionPane.showMessageDialog(null, "����� �̸��� "+name);
		
		String input = JOptionPane.showInputDialog("���� �Է�"); /*scanner�� ����ϸ� �ڵ����� int�� �������༭ ���ѵ� ��� �ƽ��Ե� �װ� �Ұ����ϴ�. 
												�̷��� �Է� �޴� ���� ���� ���ڿ��� ���´�. ���� int�� �ٲ��ִ� �� ����ؾ��Ѵ�.*/
		int age = Integer.parseInt(input); // �̰͵� ���� ����ϴ� ��ǰ�̱⿡ new ���� �ٷ� ����ϰ� �տ� �빮�ڷ� ���´�.
		JOptionPane.showMessageDialog(null, "����� ���̴� "+age);	
		
																//�̷��� �Է��ϰ� �ϴ� �׷����� ���̾�α��̴�.
		
		
		
	}

}
