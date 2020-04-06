package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AcaoLimpar implements ActionListener{
	private JTextField txtNome = null;
	private JTextField txtCpf = null;
	private JRadioButton rbtMasculino = null;
	private JTextField txtDataNascimento = null;
	private JTextField txtEndereco = null;
	private JComboBox<String> cboUf = null;
	
	public AcaoLimpar(JTextField txtNome, JTextField txtCpf, JRadioButton rbtMasculino, JTextField txtDataNascimento,
			JTextField txtEndereco, JComboBox<String> cboUf) {
		super();
		this.txtNome = txtNome;
		this.txtCpf = txtCpf;
		this.rbtMasculino = rbtMasculino;
		this.txtDataNascimento = txtDataNascimento;
		this.txtEndereco = txtEndereco;
		this.cboUf = cboUf;
	}
	
	public void actionPerformed(ActionEvent e) {
		txtNome.setText("");
		txtCpf.setText("");
		rbtMasculino.setSelected(true);
		txtDataNascimento.setText("");
		txtEndereco.setText("");
		cboUf.setSelectedIndex(0);
	}

}
