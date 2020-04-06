package apresentacao;

import negocio.Esportivo;
import negocio.Marca;
import negocio.Moto;
import negocio.Sedan;
import negocio.Suv;

public class Principal {

	public static void main(String[] args) {
		Marca objSuzuki = new Marca("Suzuki", "Japão");
		Marca objVolkswagen = new Marca("Volkswagen", "Alemanha");
		Marca objFiat = new Marca("Fiat", "Itália");
		Marca objLandRover = new Marca("Land Rover", "Inglaterra");
		Marca objHyundai = new Marca(" Hyundai", "Coreia do Sul");
		
		Moto objMoto = new Moto("2145435768a35482", objSuzuki, "GSX-S 750", "Preto", 2018, 750);
		
		Suv objSuv = new Suv();
		objSuv.setChassi("25487dfgzdr75825");
		objSuv.setObjMarca(objLandRover);
		objSuv.setModelo("Evoque");
		objSuv.setCor("Azul");
		objSuv.setAno(2019);
		objSuv.setVolumeMotor("3.8");
		
		Esportivo objEsportivo = new Esportivo();
		objEsportivo.setChassi("5sg4g8dr525");
		objEsportivo.setObjMarca(objVolkswagen);
		objEsportivo.setModelo("Golf Gti");
		objEsportivo.setCor("Branco");
		objEsportivo.setAno(2019);
		objEsportivo.setVolumeMotor("3.0");
		
		Sedan objSedan = new Sedan();
		objSedan.setChassi("DFAfsd545425sF");
		objSedan.setObjMarca(objHyundai);
		objSedan.setModelo("Azera");
		objSedan.setCor("Cinza");
		objSedan.setAno(2015);
		objSedan.setVolumeMotor("3.6");
		
		System.out.println("---------------------");
		
		System.out.println(objMoto.getObjMarca().getDescricao() + " " + 
		                                    objMoto.getModelo()); 
		objMoto.empinar();
		
		System.out.println("---------------------");
		
		System.out.println(objSuv.getObjMarca().getDescricao() + " " + 
                objSuv.getModelo()); 
		objSuv.ligar4x4();
		
		System.out.println("---------------------");
		
		System.out.println(objEsportivo.getObjMarca().getDescricao() + " " + 
                objEsportivo.getModelo()); 
		objEsportivo.abrirTeto();
		
		System.out.println("---------------------");
		
		Sedan objSedan2 = new Sedan("5331338359836", objFiat, "Cronos", "Branco", 2019, "1.3");
		
		System.out.println(objSedan2.getObjMarca().getDescricao() + " " + 
                objSedan2.getModelo()); 
		objSedan2.ligarArCondicionado();
	}

}
