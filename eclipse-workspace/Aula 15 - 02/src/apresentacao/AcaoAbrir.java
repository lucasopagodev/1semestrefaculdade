package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;

public class AcaoAbrir implements ActionListener{
	private JDesktopPane contenedorDeJanelas = new JDesktopPane();
	
	public AcaoAbrir(JDesktopPane contenedorDeJanelas) {
		this.contenedorDeJanelas = contenedorDeJanelas;
	}

	public void actionPerformed(ActionEvent e) {
		JanelaAbrir objeto = new JanelaAbrir();
		contenedorDeJanelas.add(objeto);
		objeto.setVisible(true);
	}

}
