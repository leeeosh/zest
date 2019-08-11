package Inter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public interface 모든처리기 imple {
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "블루를 누르셨군요");
	}

}
