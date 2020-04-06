package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import negocio.Pessoa;
import negocio.UF;

public class AcaoGravar implements ActionListener {
	private JTextField txtNome = null;
	private JTextField txtCpf = null;
	private JRadioButton rbtMasculino = null;
	private JTextField txtDataNascimento = null;
	private JTextField txtEndereco = null;
	private JComboBox<String> cboUf = null;
	
	public AcaoGravar(JTextField txtNome, JTextField txtCpf, JRadioButton rbtMasculino, JTextField txtDataNascimento,
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
		Pessoa objPessoa = new Pessoa();
		objPessoa.setNome(txtNome.getText());
		objPessoa.setCpf(txtCpf.getText());
		objPessoa.setSexo(rbtMasculino.isSelected());
		objPessoa.setDataNasc(txtDataNascimento.getText());
		objPessoa.setEndereco(txtEndereco.getText());
		objPessoa.setObjUf(new UF(cboUf.getSelectedItem().toString(),
								  cboUf.getSelectedItem().toString()));
		
		JOptionPane.showMessageDialog(null, "Gravação Realizada com Sucesso !\n" +
									  objPessoa.getNome());
	}
}