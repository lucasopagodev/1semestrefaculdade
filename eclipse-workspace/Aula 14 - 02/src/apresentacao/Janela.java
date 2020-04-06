package apresentacao;

import javax.swing.JFrame;

//Só estende o JFrame - janela / todos os outros serão instanciados
// instancia Janela (Frame) no 'main' / configura no método construtor
public class Janela extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		Janela objeto = new Janela();
		objeto.setVisible(true);
	}
	
	public Janela() {
		setTitle("Minha primeira janela Java !");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Painel objPainel = new Painel();
		add(objPainel);
	}

}
