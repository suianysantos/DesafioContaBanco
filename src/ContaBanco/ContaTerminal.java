package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main (String []args) throws Exception {
		
		//TODO: Conhecer e importar a classe Scanner
		//Exibir as mensagens para o nosso usuário
		//Obter pela scanner os valores digitados no terminal
		//Exibir  a mensagem conta criada
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor , digite o número da sua Agência !");
		int agencia = scanner.nextInt();
	
		System.out.println("Por favor , digite o número da sua Conta !");
		String numeroConta = scanner.next();
		
		System.out.println("Por favor , digite o seu nome !");
		String nome = scanner.next();
	
		System.out.println("Por favor , digite o seu saldo !");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá , " + nome + " obrigado por criar uma conta com o nosso banco, sua agência é " + agencia + ", conta " + numeroConta + 
				" e seu saldo de " + saldo + " já está disponível para saque "   );
		
	}

}
