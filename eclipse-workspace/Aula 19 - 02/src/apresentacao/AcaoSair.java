package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class AcaoSair implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?") == 0) {
			System.exit(0);
		}
	}

}
