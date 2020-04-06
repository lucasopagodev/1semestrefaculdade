
public class Pessoa {
	// Propriedades
	String nome;
	String sexo;
	double altura;
	int idade;
	String endereco;
	String telefone;

	public static void main(String[] args) {
		Pessoa objeto1 = new Pessoa ();
		objeto1.nome = "Jr";
		objeto1.sexo = "Masculino";
		objeto1.altura = 1.78;
		objeto1.idade = 42;
		objeto1.endereco = "SQS 207";
		objeto1.telefone = "99995";
		
		Pessoa objeto2 = new Pessoa();
		objeto2.nome = "Lucas";
		objeto2.sexo = "Masculino";
		objeto2.altura = 1.84;
		objeto2.idade = 19;
		objeto2.endereco = "Cond. Solar de Athenas Mod. M Cs. 02";
		objeto2.telefone = "983340444";
		
		System.out.println("O nome do vagabundo é: " + objeto1.nome);
		System.out.println(objeto2.nome);
		System.out.println(objeto2.sexo);
		System.out.println(objeto2.altura);
		System.out.println(objeto2.idade);
		System.out.println(objeto2.endereco);
		System.out.println(objeto2.telefone);
		
		
	}
}
