/**
 * 
 */
package entidade;

/**
 * @author tatianirodrigues
 *
 */
public class UsuarioAdministrador extends Usuario{
	
	//Construtor
	public UsuarioAdministrador(String nome, String email, String cpf, String arroba, int senha) {
		super(nome, email, cpf, arroba, senha);
	}
	
	//Metodos
	public void bloquearPruu(Pruu pruuBloqueado) {
		pruuBloqueado.setBloquado(true);
	}	
}
