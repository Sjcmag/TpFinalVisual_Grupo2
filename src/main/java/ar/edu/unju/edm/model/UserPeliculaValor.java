package ar.edu.unju.edm.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity

@Table(name="UserPeliculaValor")
public class UserPeliculaValor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer idUsePeli;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id")
	private Usuario usuario;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idPelicula")
	private Pelicula pelicula;
	
	@Column
	private String tur;
	@Column
	private Integer valoracion_user;
	@Column
	private String comentario;
	@Column
	private LocalTime tiempo;
	@Column
	private LocalDate date;
public LocalTime getTiempo() {
		return tiempo;
	}
	public void setTiempo(LocalTime tiempo) {
		this.tiempo = tiempo;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
public String getTur() {
		return tur;
	}
	public void setTur(String tur) {
		this.tur = tur;
	}
public UserPeliculaValor() {
	// TODO Auto-generated constructor stub
}
public Integer getIdUsePeli() {
	return idUsePeli;
}
public void setIdUsePeli(Integer idUsePeli) {
	this.idUsePeli = idUsePeli;
}
public Usuario getUsuario() {
	return usuario;
}
public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}
public Pelicula getPelicula() {
	return pelicula;
}
public void setPelicula(Pelicula pelicula) {
	this.pelicula = pelicula;
}
public Integer getValoracion_user() {
	return valoracion_user;
}
public void setValoracion_user(Integer valoracion_user) {
	this.valoracion_user = valoracion_user;
}
public String getComentario() {
	return comentario;
}
public void setComentario(String comentario) {
	this.comentario = comentario;
}

}
