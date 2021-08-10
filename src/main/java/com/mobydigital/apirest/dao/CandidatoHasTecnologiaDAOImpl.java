package com.mobydigital.apirest.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mobydigital.apirest.entity.CandidatoHasTecnologia;

@Repository
public class CandidatoHasTecnologiaDAOImpl implements CandidatoHasTecnologiaDAO{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<CandidatoHasTecnologia> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);		
		Query<CandidatoHasTecnologia> theQuery = currentSession.createQuery("from CandidatoHasTecnologia", CandidatoHasTecnologia.class);		
		List<CandidatoHasTecnologia> candidatoTecnologia = theQuery.getResultList();
		return candidatoTecnologia;
	}

	@Override
	@Transactional
	public void save(CandidatoHasTecnologia candidatoTecnologia) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(candidatoTecnologia);	
	}

	@Override
	@Transactional
	public void deleteById(int idRelacion) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<CandidatoHasTecnologia> theQuery = currentSession.createQuery("delete from CandidatoHasTecnologia where id=:idRelacion");
		
		theQuery.setParameter("idRelacion", idRelacion);
		theQuery.executeUpdate();
		
	}

	@Override
	public CandidatoHasTecnologia findById(int idRelacion) {
		Session currentSession = entityManager.unwrap(Session.class);		
		CandidatoHasTecnologia relacion = currentSession.get(CandidatoHasTecnologia.class, idRelacion);
		return relacion;
	}

}
