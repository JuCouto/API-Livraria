package com.residencia.firstapi.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "livro")
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "livro_id")
	private Integer livroId;

	@Column(name = "livro_nome")
	private String livroNome;

	@ManyToOne
	@JoinColumn(name = "editora_id", referencedColumnName = "editora_id")
	//@JsonIgnore
	private Editora editora;

	@ManyToOne
	@JoinColumn(name = "autor_id", referencedColumnName = "autor_id")
	//@JsonIgnore
	private Autor autor;

	public Integer getLivroId() {
		return livroId;
	}

	public void setLivroId(Integer livroId) {
		this.livroId = livroId;
	}

	public String getLivroNome() {
		return livroNome;
	}

	public void setLivroNome(String livroNome) {
		this.livroNome = livroNome;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
//	public Livro() {}
//	public Livro(Integer livroId, String livroNome, Editora editora, Autor autor) {
//		super();
//		this.livroId = livroId;
//		this.livroNome = livroNome;
//		this.editora = editora;
//		this.autor = autor;
//	}

	
}
