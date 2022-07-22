/**
 * 
 */
package entidade;

import java.util.Date;

/**
 * @author tatianirodrigues
 *
 */

public class Pruu {
	private String texto;
	private Date dataCricao = new Date();
	private int numeroDeLikes;
	private boolean like;
	private boolean bloquado;
	private Usuario usuario;
	private static int idPruu;
	private int id;
	
	
	//Construtor
	public Pruu(String texto, Usuario usuario) {
		super();
		if (validaTexto(texto)) {
			this.texto = texto;
		} else {
			this.texto = "ERRO!!! Número de caracter inválido!!!"; 
		} 
		this.usuario = usuario;
		Pruu.idPruu++;
		this.id = Pruu.idPruu;
	}
	
	// toString
	@Override
	public String toString() {
		if(this.isBloquado()) {
		return usuario.getNome() + ": " + usuario + " - Pruuu:" + "Esse Pruu está bloqueado";	
		}else {
		return usuario.getNome() + ": " + usuario + " - Pruuu:" + "'" + texto + "'" +  " Likes: " + numeroDeLikes;
		}
	}
	
	//Metodos 
	public void editarTexto(String texto) {
		this.texto = texto;
	}
	public void somarNovoLike() {
		this.numeroDeLikes++;
	}
	public boolean validaTexto(String texto) {
		texto = texto.trim();
		int caracters = texto.length();
		if (caracters > 1 && caracters < 300) {
			return true;
		}else
			return false;
	}
	
	//Getters and Setters
	public String getTexto() {
		return texto;
	}

	public Date getDataCricao() {
		return dataCricao;
	}

	public int getNumeroDeLikes() {
		return numeroDeLikes;
	}

	public void setNumeroDeLikes(int numeroDeLikes) {
		this.numeroDeLikes = numeroDeLikes;
	}

	public boolean isBloquado() {
		return bloquado;
	}

	public void setBloquado(boolean bloquado) {
		this.bloquado = bloquado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean isLike() {
		return like;
	}

	public void setLike(boolean like) {
		this.like = like;
		this.somarNovoLike();
	}
	public int getId() {
		return id;
	}
}