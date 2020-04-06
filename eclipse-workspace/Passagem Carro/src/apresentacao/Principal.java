package apresentacao;

import negocio.Motorista;
import negocio.Passageiro;
import negocio.Viagem;

public class Principal {

	public static void main(String[] args) {
		Motorista objMotorista = new Motorista("Lucas", "Grande Colorado, Solar de Athenas M 02", "(61)98334-0444", "012345678-91", "00123456789");
		Motorista objMotorista2 = new Motorista("Pedro", "SQN 102", "(61)99785-4123", "369852147-23", "99874563210");
		
		Passageiro objPassageiro = new Passageiro("Maria Clara", "SQS 308", "(61)99887-8888", "987654321-00", "4089.6541.2013.5498");
		Passageiro objPassageiro2 = new Passageiro("Marcelo", "SHN 104", "(61)99365-5214", "014785236-12", "4089.6589.3201.4521");
		
		Viagem objViagem = new Viagem(objMotorista, objPassageiro, "Brasília, DF -15° 47' + 47° 55'", "Goiás,GO -16° 40' + 49° 15' ", 150.00);
		Viagem objViagem2 = new Viagem(objMotorista, objPassageiro2, "Brasília, DF -15° 47' + 47° 55'", "Palmas,TO -10° 14' + 48° 21' ", 350.00);
		Viagem objViagem3 = new Viagem(objMotorista2, objPassageiro, "Goiás,GO -16° 40' + 49° 15'", "Brasília, DF -15° 47' + 47° 55'", 160.00);

		
		
		System.out.println("VIAGEM 1:");
		System.out.println("Origem: " + objViagem.getCoordenadaOrigem() + " | Destino: " + objViagem.getCoordenadaDestino());
		System.out.println("Motorista: " + objViagem.getObjMotorista().getNome() + " / Passageiro: " + objViagem.getObjPassageiro().getNome());
		System.out.println("Preço: R$" + objViagem.getPreco());
		System.out.println();
		
		System.out.println("VIAGEM 2:");
		System.out.println("Origem: " + objViagem2.getCoordenadaOrigem() + " | Destino: " + objViagem2.getCoordenadaDestino());
		System.out.println("Motorista: " + objViagem2.getObjMotorista().getNome() + " / Passageiro: " + objViagem2.getObjPassageiro().getNome());
		System.out.println("Preço: R$" + objViagem2.getPreco());
		System.out.println();
		
		System.out.println("VIAGEM 3:");
		System.out.println("Origem: " + objViagem3.getCoordenadaOrigem() + " | Destino: " + objViagem3.getCoordenadaDestino());
		System.out.println("Motorista: " + objViagem3.getObjMotorista().getNome() + " / Passageiro: " + objViagem3.getObjPassageiro().getNome());
		System.out.println("Preço: R$" + objViagem3.getPreco());

	}

}
