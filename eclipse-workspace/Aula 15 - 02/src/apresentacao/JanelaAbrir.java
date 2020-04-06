package apresentacao;

import javax.swing.JInternalFrame;

public class JanelaAbrir extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	
	public JanelaAbrir() {
		setTitle("Janela");
		setSize(785, 540);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setMaximizable(true);
		setClosable(true);
	}
}
