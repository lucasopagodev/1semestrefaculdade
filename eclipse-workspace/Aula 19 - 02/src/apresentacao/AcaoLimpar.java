package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AcaoLimpar implements ActionListener{

	private JTextField txtCodigo = null;
	private JTextArea txaDescricao = null;
	private JTextField txtPreco = null;	
	private JComboBox<String> cboCategoria = null;
	private JCheckBox chkPerecivel = null;
	
	public AcaoLimpar(JTextField txtCodigo, JTextArea txaDescricao, JTextField txtPreco, JComboBox<String> cboCategoria,
			JCheckBox chkPerecivel) {
		super();
		this.txtCodigo = txtCodigo;
		this.txaDescricao = txaDescricao;
		this.txtPreco = txtPreco;
		this.cboCategoria = cboCategoria;
		this.chkPerecivel = chkPerecivel;
	}

	public void actionPerformed(ActionEvent e) {
		txtCodigo.setText("");
		txaDescricao.setText("");
		txtPreco.setText("");
		cboCategoria.setSelectedIndex(0);
		chkPerecivel.setSelected(false);
		
	}

}
