/**
 * 
 */
package principal;

import java.util.ArrayList;
import java.util.Scanner;

import entidade.Usuario;
import entidade.UsuarioAdministrador;

/**
 * @author tati
 *
 */
public class PrincipalComMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0, menuInicial = 0;
		int codigoAdm = 1234;
	
		ArrayList <Usuario> usuarios = new ArrayList();

		Scanner entrada = new Scanner(System.in);
		System.out.println("***********************+****************************************************************");
		System.out.println("***********************+**** pruu Bem-Vindo ao Pombo pruu ******************************");
		System.out.println("***********************+****************************************************************");
		System.out.println("1 - Cadastrar novo usuario ou 2 - Entrar ");

		menuInicial = entrada.nextInt();
		entrada.nextLine();
		switch (menuInicial) {
		
		case 1:
			System.out.println("***********************+****************************************************************");
			System.out.println("*********************+**** pruu CADASTRO DO NOVO POMBO pruu ****************************");
			System.out.println("***********************+****************************************************************");
			System.out.println("Qual e o seu nome?");
			String nome = entrada.nextLine();
			System.out.println("Qual e o seu cpf?");
			String cpf = entrada.nextLine();
			System.out.println("Qual e o seu e-mail?");
			String email = entrada.nextLine();
			System.out.println("Escolha uma senha apenas com numeros:");
			int senha = entrada.nextInt();
			entrada.nextLine();	
			System.out.println("Columba livia é um nome muito chato, escolha um nome de Pombo unico para voce!");
			String arroba = entrada.nextLine();				
			System.out.println("voce e um adm? 1- sim, 2- nao");
			
				
			Usuario usuario = new Usuario (nome, email, cpf,arroba, senha);
			usuarios.add(usuario);
	
			System.out.println("***********************+****************************************************************");
			System.out.println("***********************+*** pruu Voce foi cadastrado!pruu ******************************");
			System.out.println("***********************+****************************************************************");
			System.out.println("Seu nome de usuario agora é " + usuario);
			
//			int confirmarAdm = entrada.nextInt();
//			if (confirmarAdm == 1) {
//				System.out.println("Digite o codigo de confirmacao");
//				int numeroDigitado = entrada.nextInt();
//				if (codigoAdm == numeroDigitado) {
//					usuario = new UsuarioAdiministrador (nome, email, cpf,arroba, senha);
//					usuarios.add(usuario);								
//				
//
//				}else {
//					System.out.println("Codigo errado! Voce foi cadastrado como usuario comum");
//					usuario = new Usuario (nome, email, cpf,arroba, senha);
//					usuarios.add(usuario);
//					System.out.println("Seu nome de usuario agora é " + usuario);
//				}
//			}else {
//				System.out.println("Codigo errado! Voce foi cadastrado como usuario comum");
		}
	}
}