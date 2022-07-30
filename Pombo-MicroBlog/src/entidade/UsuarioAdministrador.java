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
	public UsuarioAdministrador(String nome, String email, String cpf, String arroba) {
		super(nome, email, cpf, arroba);
	}
	
	//Metodos
	public void bloquearPruu(Pruu pruuBloqueado) {
		pruuBloqueado.setBloquado(true);
	}	
}
