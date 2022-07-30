/**
 * 
 */
package principal;

import java.util.ArrayList;

import entidade.Usuario;
import entidade.UsuarioAdministrador;
import entidade.Pruu;


/**
 * @author tatianirodigues
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList <Usuario> usuarios =  new ArrayList();

		Usuario anna = new Usuario("Anna de Arendelle", "annadofilmefrozen@tatimail.com", "4563728929-89", "aninhaPrincesa");
		usuarios.add(anna);
		Usuario elsa = new Usuario ("Elsa de Arendelle", "elsadofilmefrozen@tatimail.com", "4387273827-22", "aVerdadeiraFrozen");
		usuarios.add(elsa);

		UsuarioAdministrador olaf = new UsuarioAdministrador ("Olaf Snowman", "olafdofilmefrozen@tatimail.com", "8372856735-88", "bonecoDeGelo");
		usuarios.add(olaf);

		//Pruus da Ana
		ArrayList <Pruu> pruusDaAna =  new ArrayList();
		anna.setPruus(pruusDaAna);
		Pruu primeiroPruuDaAna = new Pruu ("         ", anna);
		pruusDaAna.add(primeiroPruuDaAna);
		Pruu segundoPruuDaAna = new Pruu ("É meio doido vc finaliza meus....", anna);
		pruusDaAna.add(segundoPruuDaAna);
		Pruu terceiroPruuDaAna = new Pruu ("Sanduiches!", anna);
		pruusDaAna.add(terceiroPruuDaAna);

		//Pruus da Elsa
		ArrayList <Pruu> pruusDaElsa =  new ArrayList();
		elsa.setPruus(pruusDaElsa);
		Pruu primeiroPruuDaElsa = new Pruu ("Oi sou a Elsa, esse e meu primeiro Pruuuuu", elsa);
		pruusDaElsa.add(primeiroPruuDaElsa);
		Pruu segundoPruuDaElsa = new Pruu ("Oi sou a Elsa, esse e meu segundo Pruuuuu", elsa);
		pruusDaElsa.add(segundoPruuDaElsa);

		//Pruus do Olaf 
		ArrayList <Pruu> pruusDoOlaf =  new ArrayList();
		olaf.setPruus(pruusDoOlaf);
		Pruu primeiroPruuDoOlaf = new Pruu ("Eu gosto de abraços quentinhos!!", olaf);
		pruusDoOlaf.add(primeiroPruuDoOlaf);
		Pruu segundoPruuDoOlaf = new Pruu ("Voce sabia que agua tem memoria?", olaf);
		pruusDoOlaf.add(segundoPruuDoOlaf);

		//ver todos os Pruus da Ana
		System.out.println("*************************** PRUUS DA ANA ***************************");
		
		for (Pruu p: anna.getPruus()) {
			System.out.println(p);	
		}
		
		olaf.bloquearPruu(segundoPruuDaAna);
		elsa.darLike(primeiroPruuDoOlaf);
		anna.darLike(primeiroPruuDoOlaf);
		
		//ver todos os Pruus
		System.out.println("*************************** TODOS OS PRUUS ***************************");
		
		for(Usuario usuarioAtual: usuarios) {
			for (Pruu pruuAtual: usuarioAtual.getPruus()) {
				System.out.println(pruuAtual);
			}
		}
	}
}
