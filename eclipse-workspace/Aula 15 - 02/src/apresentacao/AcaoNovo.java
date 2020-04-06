package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcaoNovo implements ActionListener {
	public void actionPerformed(ActionEvent arg0) {
		JanelaNovo objeto = new JanelaNovo();
		objeto.setVisible(true);
	}
}