package apresentacao;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JanelaPessoa extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel objPainel = new JPanel();
	
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	
	private JLabel lblCpf = new JLabel("CPF");
	private JTextField txtCpf = new JTextField();
	
	private JLabel lblSexo = new JLabel("Sexo");
	private ButtonGroup grpSexo = new ButtonGroup();
	private JRadioButton rbtMasculino = new JRadioButton("Masculino");
	private JRadioButton rbtFeminino = new JRadioButton("Feminino");
	
	private JLabel lblDataNascimento = new JLabel("Data de Nascimento");
	private JTextField txtDataNascimento = new JTextField();
	
	private JLabel lblEndereco = new JLabel("Endereço");
	private JTextField txtEndereco = new JTextField();
	
	private JLabel lblUf = new JLabel("UF");
	private JComboBox<String> cboUf = new JComboBox<String>();
	
	private JButton btnGravar = new JButton("Gravar");	
	private JButton btnLimpar = new JButton("Limpar");	
	private JButton btnSair = new JButton("Sair");	
	
	public static void main(String[] args) {
		new JanelaPessoa().setVisible(true);
	}
	
	public JanelaPessoa() {
		setTitle("Cadastro de Pessoas");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Toolkit ferramenta = Toolkit.getDefaultToolkit();
		Dimension tamanhoTela = ferramenta.getScreenSize();
		setLocation((int) (tamanhoTela.getWidth() - 800) / 2,
				    (int) (tamanhoTela.getHeight() - 600) / 2);
		
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		lblNome.setBounds(30, 30, 200, 20);
		objPainel.add(lblNome);
		
		txtNome.setBounds(30, 50, 400, 20);
		objPainel.add(txtNome);
		
		lblCpf.setBounds(30, 70, 200, 20);
		objPainel.add(lblCpf);
		
		txtCpf.setBounds(30, 90, 100, 20);
		objPainel.add(txtCpf);
		
		lblSexo.setBounds(300, 70, 200, 20);
		objPainel.add(lblSexo);
		
		grpSexo.add(rbtMasculino);
		grpSexo.add(rbtFeminino);
		rbtMasculino.setSelected(true);
		
		rbtMasculino.setBounds(300, 90, 100, 20);
		objPainel.add(rbtMasculino);
		
		rbtFeminino.setBounds(400, 90, 100, 20);
		objPainel.add(rbtFeminino);
		
		lblDataNascimento.setBounds(30, 110, 200, 20);
		objPainel.add(lblDataNascimento);
		
		txtDataNascimento.setBounds(30, 130, 80, 20);
		objPainel.add(txtDataNascimento);
		
		lblEndereco.setBounds(30, 150, 200, 20);
		objPainel.add(lblEndereco);
		
		txtEndereco.setBounds(30, 170, 500, 20);
		objPainel.add(txtEndereco);
		
		lblUf.setBounds(550, 150, 200, 20);
		objPainel.add(lblUf);
		
		cboUf.setBounds(550, 170, 70, 20);
		objPainel.add(cboUf);
		cboUf.addItem("");
		cboUf.addItem("DF");
		cboUf.addItem("SP");
		cboUf.addItem("RS");
		
		btnGravar.setBounds(410, 500, 100, 30);
		btnGravar.addActionListener(new AcaoGravar(txtNome,
				   								   txtCpf,
				   								   rbtMasculino,
				   								   txtDataNascimento,
				   								   txtEndereco,
				   								   cboUf));
		objPainel.add(btnGravar);
		
		btnLimpar.setBounds(530, 500, 100, 30);
		btnLimpar.addActionListener(new AcaoLimpar(txtNome,
												   txtCpf,
												   rbtMasculino,
												   txtDataNascimento,
												   txtEndereco,
												   cboUf));
		objPainel.add(btnLimpar);
		
		btnSair.setBounds(650, 500, 100, 30);
		btnSair.addActionListener(new AcaoSair());
		objPainel.add(btnSair);
		
	}
}