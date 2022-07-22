/**
 * 
 */
package entidade;

import java.util.ArrayList;

/**
 * @author tatianirodrigues
 *
 */
public class Usuario {
	private String nome;
	private String arroba;
	private String email;
	private String cpf;
	private int senha;
	private ArrayList <Pruu> pruus;
	
	//Construtor
	public Usuario(String nome, String email, String cpf, String arroba,int senha ) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.arroba = arroba;
		this.senha = senha;
	}
	public Usuario() {
		
	}
	
	//Métodos
	public void darLike(Pruu pruuCurtido) {
		pruuCurtido.somarNovoLike();
	}
	//ToString
	@Override
	public String toString() {
		return "@" + arroba;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public ArrayList<Pruu> getPruus() {
		return pruus;
	}
	public void setPruus(ArrayList<Pruu> pruus) {
		this.pruus = pruus;
	}

	public int getSenha() {
		return senha;
	}
	
}
