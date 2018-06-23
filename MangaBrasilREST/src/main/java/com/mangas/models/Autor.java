package com.mangas.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAutor;
	
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public long getIdAutor() {
		return idAutor;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}