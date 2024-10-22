package apresentacao;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Janela extends JFrame{
	private static final long serialVersionUID = 1L;

	private JPanel objPainel = new JPanel();
	
	private JLabel lblAcessorios = new JLabel("Acess�rios");
	
	private JCheckBox chkRadio = new JCheckBox("R�dio");
	private JCheckBox chkRodaDeLigaLeve = new JCheckBox("Roda Liga Leve");
	private JCheckBox chkCameraDeRe = new JCheckBox("C�mera de R�");
	private JCheckBox chkFarolDeNeon = new JCheckBox("Farol de Neon");
	
	private JButton btnConfirmar = new JButton("Confirmar");
	private JButton btnSair = new JButton("Sair");
	
	private JLabel lblCombustivel = new JLabel("Combust�vel");
	private ButtonGroup grpCombustivel = new ButtonGroup();
	private JRadioButton rbtGasolina = new JRadioButton("Gasolina");
	private JRadioButton rbtAlcool = new JRadioButton("Alcool");
	private JRadioButton rbtDiesel = new JRadioButton("Diesel");
	
	private JLabel lblUF = new JLabel("UF");
	private JComboBox<String> cboUF = new JComboBox<String>();
	
	
	public static void main(String[] args) {
		new Janela().setVisible(true);
	}
	
	public Janela() {
		setTitle("Janela de Configura��o de Ve�culos");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		objPainel.setLayout(null);
		getContentPane().add(objPainel);
		
		lblAcessorios.setBounds(30, 30, 200, 20);
		objPainel.add(lblAcessorios);
		
		chkRadio.setBounds(30, 50, 200, 20);
		objPainel.add(chkRadio);
		
		chkRodaDeLigaLeve.setBounds(30, 70, 200, 20);
		objPainel.add(chkRodaDeLigaLeve);
		
		chkFarolDeNeon.setBounds(30, 90, 200, 20);
		objPainel.add(chkFarolDeNeon);
		
		chkCameraDeRe.setBounds(30, 110, 200, 20);
		objPainel.add(chkCameraDeRe);
		
		lblCombustivel.setBounds(300, 30, 200, 20);
		objPainel.add(lblCombustivel);
		
		grpCombustivel.add(rbtGasolina);
		grpCombustivel.add(rbtAlcool);
		grpCombustivel.add(rbtDiesel);
		rbtGasolina.setSelected(true);
		
		rbtGasolina.setBounds(300, 50, 200, 20);
		objPainel.add(rbtGasolina);
		
		rbtAlcool.setBounds(300, 70, 200, 20);
		objPainel.add(rbtAlcool);
		
		rbtDiesel.setBounds(300, 90, 200, 20);
		objPainel.add(rbtDiesel);
		
		btnConfirmar.setBounds(530, 500, 100, 30);
		btnConfirmar.addActionListener(new AcaoConfirmar(chkRadio, chkRodaDeLigaLeve, chkFarolDeNeon, chkCameraDeRe, rbtGasolina, rbtAlcool, rbtDiesel, cboUF));
		objPainel.add(btnConfirmar);
		
		btnSair.setBounds(650, 500, 100, 30);
		btnSair.addActionListener(new AcaoSair());
		objPainel.add(btnSair);
		
		lblUF.setBounds(300, 120, 200, 20);
		objPainel.add(lblUF);
		
		cboUF.setBounds(300, 140, 55, 20);
		cboUF.addItem("DF");
		cboUF.addItem("SP");
		cboUF.addItem("RS");
		cboUF.addItem("GO");
		cboUF.addItem("MS");
		cboUF.addItem("MT");
		cboUF.addItem("BA");
		objPainel.add(cboUF);
		
		
	}
	
}
