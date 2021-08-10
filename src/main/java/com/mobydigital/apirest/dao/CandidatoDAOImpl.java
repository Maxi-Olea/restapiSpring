package com.mobydigital.apirest.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobydigital.apirest.entity.Candidato;

@Repository
public class CandidatoDAOImpl implements CandidatoDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Candidato> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);		
		Query<Candidato> theQuery = currentSession.createQuery("from Candidato", Candidato.class);		
		List<Candidato> personas = theQuery.getResultList();
		return personas;
	}

	@Override
	public Candidato findById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);		
		Candidato persona = currentSession.get(Candidato.class, id);
		return persona;
	}

	@Override
	public void save(Candidato persona) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(persona);
		
	}

	@Override
	public void deleteById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Candidato> theQuery = currentSession.createQuery("delete from Candidato where id=:idCandidato");
		
		theQuery.setParameter("idCandidato", id);
		theQuery.executeUpdate();
		
	}

}
