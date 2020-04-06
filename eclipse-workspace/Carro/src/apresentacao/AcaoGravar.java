package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.Veiculo;

public class AcaoGravar implements ActionListener {
	private JTextField txtModelo = null;
	private JTextField txtChassi = null;
	private JComboBox<String> cboAno = null;
	private JTextField txtCor = null;
	private JTextArea txaObservacao = null;
	
	public AcaoGravar(JTextField txtModelo, JTextField txtChassi, JComboBox<String> cboAno, JTextField txtCor,
			JTextArea txaObservacao) {
		super();
		this.txtModelo = txtModelo;
		this.txtChassi = txtChassi;
		this.cboAno = cboAno;
		this.txtCor = txtCor;
		this.txaObservacao = txaObservacao;
	}

	public void actionPerformed(ActionEvent e) {
		Veiculo objVeiculo = new Veiculo();
		
		objVeiculo.setModelo(txtModelo.getText());
		objVeiculo.setChassi(txtChassi.getText());
		objVeiculo.setAno((cboAno.getSelectedItem().toString()));
		objVeiculo.setCor(txtCor.getText());
		objVeiculo.setObservacao(txaObservacao.getText());
		
		JOptionPane.showMessageDialog(null, "Veículo gravado com sucesso!\n" + txtModelo);
	}
}
