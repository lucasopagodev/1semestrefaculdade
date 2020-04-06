package apresentacao;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Janela extends JFrame {
	private JPanel objPainel = new JPanel();
	
	private JLabel lblCodigo = new JLabel("Codigo");
	private JTextField txtCodigo = new JTextField();
	
	private JLabel lblDescricao = new JLabel("Descri��o");
	private JTextArea txaDescricao = new JTextArea();
	private JScrollPane jspBarra = new JScrollPane(txaDescricao);
	
	private JLabel lblPreco = new JLabel("Pre�o");
	private JTextField txtPreco = new JTextField();
	
	private JLabel lblCategoria = new JLabel("Categoria");
	private JComboBox<String> cboCategoria = new JComboBox<String>();
	
	private JCheckBox chkPerecivel = new JCheckBox("Perecivel");
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		new Janela().setVisible(true);
	}
	
	public Janela() {
		setTitle("Cadastro");
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		lblCodigo.setBounds(20, 20, 200, 20);
		objPainel.add(lblCodigo);
		txtCodigo.setBounds(20, 40, 50, 20);
		objPainel.add(txtCodigo);
		
		lblDescricao.setBounds(20, 70, 200, 20);
		objPainel.add(lblDescricao);
		jspBarra.setBounds(20, 90, 250, 150);
		objPainel.add(jspBarra);
		
		lblPreco.setBounds(20, 250, 200, 20);
		objPainel.add(lblPreco);
		txtPreco.setBounds(20, 270, 100, 20);
		objPainel.add(txtPreco);
		
		lblCategoria.setBounds(20, 290, 200, 20);
		objPainel.add(lblCategoria);
		cboCategoria.setBounds(20, 310, 150, 20);
		cboCategoria.addItem("");
		cboCategoria.addItem("Limpeza");
		cboCategoria.addItem("Aliment�cio");
		cboCategoria.addItem("Cosm�tico");
		cboCategoria.addItem("Farmac�utico");
		objPainel.add(cboCategoria);
		
		chkPerecivel.setBounds(18, 350, 200, 20);
		objPainel.add(chkPerecivel);
		
		btnGravar.setBounds(260, 380, 100, 30);
		btnGravar.addActionListener(new AcaoGravar(txtCodigo, 
												   txaDescricao, 
												   txtPreco, 
												   cboCategoria, 
												   chkPerecivel));
		objPainel.add(btnGravar);
		
		btnLimpar.setBounds(380, 380, 100, 30);
		btnLimpar.addActionListener(new AcaoLimpar(txtCodigo, 
												   txaDescricao, 
												   txtPreco, 
												   cboCategoria, 
												   chkPerecivel));
		objPainel.add(btnLimpar);
		
		btnSair.setBounds(500, 380, 100, 30);
		btnSair.addActionListener(new AcaoSair());
		objPainel.add(btnSair);
		
		
	}
	
}