package com.algaworks.financeiro.model;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class LivrosBean {

	private List<Livro> livros;
	private Livro novoLivro;



	public LivrosBean() {
		super();
		this.livros = new ArrayList<>();
		this.novoLivro =  new Livro();
	}
	
	public void adicionar(){
		this.novoLivro = new Livro();
		this.livros.add(novoLivro);
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Livro getNovoLivro() {
		return novoLivro;
	}

}
