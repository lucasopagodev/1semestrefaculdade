package apresentacao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Janela extends JFrame {
	private static final long serialVersionUID = 1L;
	
	//Propriedades da Classe/ Controles da Classe
	private JPanel objPainel = new JPanel();
	private JLabel lblNome = new JLabel();
	private JLabel lblEndereco = new JLabel();
	private JTextField txtNome = new JTextField();
	private JTextField txtEndereco = new JTextField();
	private JButton btnCopiar = new JButton();
	private JButton btnSair = new JButton();
	private JButton btnSomar = new JButton();
 	private JLabel lblObservacoes = new JLabel();
	private JTextArea txaObservacoes = new JTextArea();
	private JScrollPane scpBarra = new JScrollPane(txaObservacoes);
	
	
	public static void main(String[] args) {
		new Janela().setVisible(true);
	}
	public Janela() {
		setTitle("Janela de teste de Botões");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		objPainel.setLayout(null); //Painel com controle do programador
		getContentPane().add(objPainel); //Colocando o painel na janela
		
		lblNome.setText("Nome");
		lblNome.setBounds(30, 30, 100, 20);
		objPainel.add(lblNome);
		
		lblEndereco.setText("Endereço");
		lblEndereco.setBounds(30, 80, 100, 20);
		objPainel.add(lblEndereco);
		
		txtNome.setBounds(30, 50, 300, 20);
		objPainel.add(txtNome);
		
		txtEndereco.setBounds(30, 100, 500, 20);
		objPainel.add(txtEndereco);
		
		btnCopiar.setText("Copiar");
		btnCopiar.setBounds(540, 500, 100, 30);
		btnCopiar.addActionListener(new AcaoCopiar(txtNome, txtEndereco));//Se o botão nao interagir com alguem = construtor cheio se não construtor Vazio
		objPainel.add(btnCopiar);
		
		btnSair.setText("Sair");
		btnSair.setBounds(650, 500, 100, 30);
		btnSair.addActionListener(new AcaoSair());
		objPainel.add(btnSair);
		
		lblObservacoes.setText("Observações");
		lblObservacoes.setBounds(30, 130, 500, 20);
		objPainel.add(lblObservacoes);
		
		scpBarra.setBounds(30, 150, 400, 100);
		txaObservacoes.setLineWrap(true);
		objPainel.add(scpBarra);
		
		btnSomar.setText("Somar");
		btnSomar.setBounds(430, 500, 100, 30);
		btnSomar.addActionListener(new AcaoSomar(txtNome, txtEndereco, txaObservacoes));
		objPainel.add(btnSomar);
	}
}
