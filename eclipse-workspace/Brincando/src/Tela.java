import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tela extends JFrame {
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		Tela objeto = new Tela();
		objeto.setVisible(true);
	}
	public Tela() {
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		/*A classe mais simples do Swing é a JOptionPane que mostra janelinhas de mensagens, confirmação e erros, entre outras.
		 */
		
		
		JOptionPane.showMessageDialog(null, "HELLO!!");
		
		/*A classe JFileChooser é a responsável por mostrar uma janela de escolha de arquivos. 
		 * É possível indicar o diretório inicial, os tipos de arquivos a serem mostrados, selecionar 
		 * um ou vários e muitas outras opções.
		 */
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.showOpenDialog(null);
	
		
	}
}