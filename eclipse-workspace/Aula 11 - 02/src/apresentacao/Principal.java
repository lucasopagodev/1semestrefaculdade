package apresentacao;

import negocio.Caipirinha;
import negocio.Drink;
import negocio.DryMartini;

public class Principal {
	public static void main(String[] args) {
		Drink obj1 = new Caipirinha();
		obj1.misturar();
		((Caipirinha) obj1).beber();
		
		obj1 = new DryMartini();
		obj1.misturar();
		((DryMartini) obj1).beber();
	}
}
