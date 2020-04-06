package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class AcaoSair implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		//JOptionPane.showConfirmDialog(null, "Deseja mesmo sair?");
		JOptionPane.showMessageDialog(null, "Obrigado pela participação!!");
		System.exit(0);
	}

}
