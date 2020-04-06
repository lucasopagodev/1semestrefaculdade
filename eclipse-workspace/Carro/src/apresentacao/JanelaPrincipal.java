package apresentacao;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JanelaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JMenuBar barraDeMenu = new JMenuBar();
	
	private JMenu menuCarro = new JMenu("Ve�culo");
	private JMenuItem itemCadastrar = new JMenuItem("Cadastrar");
	private JMenuItem itemPesquisarPendentes = new JMenuItem("Pesquisar Pendentes");
	private JMenuItem itemPesquisarFinalizados = new JMenuItem("Pesquisar Finalizados");
	private JMenuItem itemConsultar = new JMenuItem("Consultar");
	
	private JPanel objPainel = new JPanel();
	
	private JLabel lblModeloVeiculo = new JLabel("Modelo");
	private JTextField txtModelo = new JTextField();
	
	private JLabel lblChassiVeiculo = new JLabel("Chassi");
	private JTextField txtChassi = new JTextField();
	
	private JLabel lblAnoVeiculo = new JLabel("Ano");
	private JComboBox<String> cboAno = new JComboBox<String>();
	
	private JLabel lblCorVeiculo = new JLabel("Cor/C�digo");
	private JTextField txtCor = new JTextField();
	
	private JLabel lblObservacaoVeiculo = new JLabel("Observa��es");
	private JTextArea txaObservacao = new JTextArea();
	private JScrollPane scpBarra = new JScrollPane(txaObservacao);
	
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	private JButton btnGravar = new JButton("Gravar");
	
	public static void main(String[] args) {
		new JanelaPrincipal().setVisible(true);
	}
	
	public JanelaPrincipal() {
		//Janela
		setTitle("Sistema de Ve�culos");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		setJMenuBar(barraDeMenu);
		barraDeMenu.add(menuCarro);
		menuCarro.add(itemCadastrar);
		menuCarro.add(itemPesquisarPendentes);
		menuCarro.add(itemPesquisarFinalizados);
		menuCarro.add(itemConsultar);
		
		lblModeloVeiculo.setBounds(30, 30, 200, 20);
		objPainel.add(lblModeloVeiculo);
		
		txtModelo.setBounds(30, 50, 300, 20);
		objPainel.add(txtModelo);
		
		lblChassiVeiculo.setBounds(30, 70, 200, 20);
		objPainel.add(lblChassiVeiculo);
		
		txtChassi.setBounds(30, 90, 300, 20);
		objPainel.add(txtChassi);
		
		lblAnoVeiculo.setBounds(400, 30, 200, 20);
		objPainel.add(lblAnoVeiculo);
		
		cboAno.setBounds(400, 50, 60, 20);
		objPainel.add(cboAno);
		cboAno.addItem("");
		cboAno.addItem("2000");
		cboAno.addItem("2001");
		cboAno.addItem("2002");
		cboAno.addItem("2003");
		cboAno.addItem("2004");
		cboAno.addItem("2005");
		cboAno.addItem("2006");
		cboAno.addItem("2007");
		cboAno.addItem("2008");
		cboAno.addItem("2009");
		cboAno.addItem("2010");
		cboAno.addItem("2011");
		cboAno.addItem("2012");
		cboAno.addItem("2013");
		cboAno.addItem("2014");
		cboAno.addItem("2015");
		cboAno.addItem("2016");
		cboAno.addItem("2017");
		cboAno.addItem("2018");
		cboAno.addItem("2019");
		cboAno.addItem("2020");
		cboAno.addItem("2021");
		cboAno.addItem("2022");
		
		lblCorVeiculo.setBounds(30, 115, 200, 20);
		objPainel.add(lblCorVeiculo);
		
		txtCor.setBounds(30, 135, 300, 20);
		objPainel.add(txtCor);
		
		lblObservacaoVeiculo.setBounds(30, 155, 200, 20);
		objPainel.add(lblObservacaoVeiculo);
		
		scpBarra.setBounds(30, 175, 300, 150);
		txaObservacao.setLineWrap(true);
		objPainel.add(scpBarra);
		
		btnSair.setBounds(650, 500, 100, 30);
		btnSair.addActionListener(new AcaoSair());
		objPainel.add(btnSair);
		
		btnLimpar.setBounds(545, 500, 100, 30);
		btnLimpar.addActionListener(new AcaoLimpar(txtModelo,
												   txtChassi,
				                                   cboAno,
											       txtCor,
												   txaObservacao));
		objPainel.add(btnLimpar);
		
		btnGravar.setBounds(440, 500, 100, 30);
		btnGravar.addActionListener(new AcaoGravar(txtModelo, 
				   								     txtChassi,
				                                   	 cboAno, 
				                                     txtCor, 
				                                     txaObservacao));
		objPainel.add(btnGravar);
		
	}
}