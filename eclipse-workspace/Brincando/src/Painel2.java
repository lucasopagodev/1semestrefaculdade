import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Painel2 extends JFrame{
	private static final long serialVersionUID = 1L;
	/*public static void main(String[] args) {
		 javax.swing.JFrame myWindow;
		 myWindow = new javax.swing.JFrame ();
		 myWindow.setSize(300, 200);
		 myWindow.setTitle("My First Java Program");
		 myWindow.setVisible(true);
	}*/
	/*public static void main(String[] args) {

		 String nome = JOptionPane.showInputDialog("Digite o nome: ");
		 String sobreNome = JOptionPane.showInputDialog("Digite o sobrenome: ");

		 String nomeCompleto = nome + " " + sobreNome;

		 JOptionPane.showMessageDialog(null, "Nome Completo: "+nomeCompleto,"Cadastro",JOptionPane.
		INFORMATION_MESSAGE);
		
	}*/
	public static void main(String[] args) {
		 float nota1, nota2, calculaMedia;

		 nota1 = Float.parseFloat(JOptionPane.showInputDialog ("Digite a primeira nota"));
		 nota2 = Float.parseFloat (JOptionPane.showInputDialog("Digite a segunda nota"));
		 calculaMedia = (nota1 + nota2) / 2;

		 JOptionPane.showMessageDialog(null, "Resultado da Média = "+ calculaMedia,"Resultado", JOptionPane.
		WARNING_MESSAGE);
	}
	public Painel2() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
