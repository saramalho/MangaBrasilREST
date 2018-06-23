package com.mangas.models;

import com.mangas.models.Autor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import org.springframework.lang.NonNull;



@Entity
public class Manga {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	
	@NonNull
	private String titulo;
		
	@NonNull
	@OneToOne
	@MapsId
	private Autor autor;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public long getCodigo() {
		return codigo;
	}
	
	
}
