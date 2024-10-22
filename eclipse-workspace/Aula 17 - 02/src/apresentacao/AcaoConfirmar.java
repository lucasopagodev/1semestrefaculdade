package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class AcaoConfirmar implements ActionListener{
	private JCheckBox chkRadio = null;
	private JCheckBox chkRodaDeLigaLeve = null;
	private JCheckBox chkCameraDeRe = null;
	private JCheckBox chkFarolDeNeon = null;
	
	private JRadioButton rbtGasolina = null;
	private JRadioButton rbtAlcool = null;
	@SuppressWarnings("unused")
	private JRadioButton rbtDiesel = null;
	
	private JComboBox<String> cboUF = null;
	
	

	public AcaoConfirmar(JCheckBox chkRadio, JCheckBox chkRodaDeLigaLeve, JCheckBox chkCameraDeRe,
			JCheckBox chkFarolDeNeon, JRadioButton rbtGasolina, JRadioButton rbtAlcool, JRadioButton rbtDiesel,
			JComboBox<String> cboUF) {
		super();
		this.chkRadio = chkRadio;
		this.chkRodaDeLigaLeve = chkRodaDeLigaLeve;
		this.chkCameraDeRe = chkCameraDeRe;
		this.chkFarolDeNeon = chkFarolDeNeon;
		this.rbtGasolina = rbtGasolina;
		this.rbtAlcool = rbtAlcool;
		this.rbtDiesel = rbtDiesel;
		this.cboUF = cboUF;
	}



	public void actionPerformed(ActionEvent e) {
		String acessorios = "";
		String combustivel = "";
		boolean escolheuPeloMenosUmAcessorio = false;
		
		if (chkRadio.isSelected()) {
			acessorios += ", Radio";
			escolheuPeloMenosUmAcessorio = true;
		}
		if (chkRodaDeLigaLeve.isSelected()) {
			acessorios += ", Roda de Liga Leve";
			escolheuPeloMenosUmAcessorio = true;
		}
		if (chkCameraDeRe.isSelected()) {
			acessorios += ", C�mera de R�";
			escolheuPeloMenosUmAcessorio = true;
		}
		if (chkFarolDeNeon.isSelected()) {
			acessorios += ", Farol de Neon";
			escolheuPeloMenosUmAcessorio = true;
		}
		if (! escolheuPeloMenosUmAcessorio) {
			acessorios = "Carro de Pobre !!!!";
		}else {
			acessorios = "Lista de Acess�rios: " + acessorios.substring(2);
		}
		
		if(rbtGasolina.isSelected()) {
			combustivel = "Gasolina";
		} else if (rbtAlcool.isSelected()) {
			combustivel = "Alcool";
		}else {
			combustivel = "Diesel";
		}
		
		
		
		JOptionPane.showMessageDialog(null, acessorios + "\n" + combustivel + "\n" + cboUF.getSelectedItem());
	}

}
