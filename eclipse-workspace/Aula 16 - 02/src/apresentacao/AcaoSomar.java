package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AcaoSomar implements ActionListener {
	private JTextField txtOrigem1 = null;
	private JTextField txtOrigem2 = null;
	private JTextArea txaDestino = null;
	
	public AcaoSomar(JTextField txtOrigem1, JTextField txtOrigem2, JTextArea txaDestino) {
		super();
		this.txtOrigem1 = txtOrigem1;
		this.txtOrigem2 = txtOrigem2;
		this.txaDestino = txaDestino;
	}
	public void actionPerformed(ActionEvent e) {
		try {
			double origem1 = Double.parseDouble(txtOrigem1.getText());
			double origem2 = Double.parseDouble(txtOrigem2.getText());
			txaDestino.setText("" + (origem1 + origem2));
		}catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "ERRO!\n" + erro);
		}
	}

}
