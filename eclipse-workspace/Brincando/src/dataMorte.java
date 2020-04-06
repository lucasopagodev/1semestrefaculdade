import java.io.BufferedReader;
import java.io.InputStreamReader;

public class dataMorte {
	public static void main (String args [])throws Exception {
		String leitor = "";
		int dia = 0;
		int mes = 0;
		int ano = 0;
		int resultadodia = 0;
		int resultadomes = 0;
		int resultadoano = 0;
		
		System.out.print("Me diga o que dia que você nasceu: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		dia = Integer.parseInt(leitor);
		
		System.out.print("Me diga em forma de número o mês que você nasceu: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		mes = Integer.parseInt(leitor);
		
		System.out.print("Me diga agora o ano em que nasceu: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		ano = Integer.parseInt(leitor);
		
		resultadodia = dia + 10;
		resultadomes = mes + 3;
		resultadoano = ano + 28;
		
		System.out.println("Data de Nascimento: " + dia + "/" + mes + "/" + ano);
		System.out.print("Data da sua Morte: " + resultadodia + "/" + resultadomes + "/" + resultadoano);
	}
}
