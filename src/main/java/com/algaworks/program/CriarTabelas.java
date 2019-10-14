package com.algaworks.program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.algaworks.financeiro.model.Pessoa;

public class CriarTabelas {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FinanceiroPU");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = new Pessoa();
		p.setNome("Juliano");
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
