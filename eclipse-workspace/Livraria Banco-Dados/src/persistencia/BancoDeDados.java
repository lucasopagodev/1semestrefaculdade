package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BancoDeDados {
	private Connection objConexao = null;
	private Statement objExecucao = null;
	
	public void conectar() throws Exception {
		objConexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/livraria?user=root&password=root&useSSL=false");
	}
	public void desconectar() throws Exception {
		objConexao.close();
	}
	public void executarInstrucao(String instrucaoSQL) throws Exception {
		objExecucao = objConexao.createStatement();
		objExecucao.executeUpdate(instrucaoSQL);
		objExecucao.close();
	}
	public ResultSet executarPesquisa(String instrucaoSQL) throws Exception {
		ResultSet retorno = null;
		
		objExecucao = objConexao.createStatement();
		retorno = objExecucao.executeQuery(instrucaoSQL);
		
		return retorno;
	}
}
