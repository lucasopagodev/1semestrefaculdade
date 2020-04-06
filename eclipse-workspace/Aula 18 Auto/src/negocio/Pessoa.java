package negocio;

public class Pessoa {
	private String nome = "";
	private String cpf = "";
	private boolean sexo = false;
	private String dataNasc = "";
	private String endereco = "";
	private UF objUf = null;
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String cpf, boolean sexo, String dataNasc, String endereco, UF objUf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
		this.objUf = objUf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public UF getObjUf() {
		return objUf;
	}

	public void setObjUf(UF objUf) {
		this.objUf = objUf;
	}
	
}