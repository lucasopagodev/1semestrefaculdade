package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.Categoria;
import negocio.Produto;

public class AcaoGravar implements ActionListener{

	private JTextField txtCodigo = null;
	private JTextArea txaDescricao = null;
	private JTextField txtPreco = null;	
	private JComboBox<String> cboCategoria = null;
	private JCheckBox chkPerecivel = null;
	
	public AcaoGravar(JTextField txtCodigo, JTextArea txaDescricao, JTextField txtPreco, JComboBox<String> cboCategoria,
			JCheckBox chkPerecivel) {
		super();
		this.txtCodigo = txtCodigo;
		this.txaDescricao = txaDescricao;
		this.txtPreco = txtPreco;
		this.cboCategoria = cboCategoria;
		this.chkPerecivel = chkPerecivel;
	}

	public void actionPerformed(ActionEvent e) {
		Produto objProduto = new Produto();
		
		try {
			objProduto.setCodigo(Integer.parseInt(txtCodigo.getText()));
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "BURRO!!! Digite um n�mero!");
			return;
		}
		
		if (txaDescricao.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "BURRO!!! Escreva algo na descric�o!");
			return;
		}
		objProduto.setDescricao(txaDescricao.getText());
		
		
		try {
			objProduto.setPreco(Double.parseDouble(txtPreco.getText()));
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "BURRO!!! Digite algum pre�o!");
			return;
		}
		
		if (cboCategoria.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null, "BURRO!!! Selecione alguma categoria!");
			return;
		}
		objProduto.setObjCategoria(new Categoria(cboCategoria.getSelectedItem().toString()));
		
		objProduto.setPerecivel(chkPerecivel.isSelected());
		
		JOptionPane.showMessageDialog(null, "Grava��o realizada com sucesso!!");
		
	}
}
