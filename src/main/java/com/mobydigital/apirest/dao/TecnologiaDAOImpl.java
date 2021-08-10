package com.mobydigital.apirest.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mobydigital.apirest.entity.Tecnologia;

@Repository
public class TecnologiaDAOImpl implements TecnologiaDAO {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Tecnologia> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);		
		Query<Tecnologia> theQuery = currentSession.createQuery("from Tecnologia", Tecnologia.class);		
		List<Tecnologia> tecnologia = theQuery.getResultList();
		return tecnologia;
	}

	@Override
	public Tecnologia findById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);		
		Tecnologia tecnologia = currentSession.get(Tecnologia.class, id);
		return tecnologia;
	}

	@Override
	@Transactional
	public void save(Tecnologia tecnologia) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(tecnologia);
		
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Tecnologia> theQuery = currentSession.createQuery("delete from Tecnologia where id=:idTecnologia");
		
		theQuery.setParameter("idTecnologia", id);
		theQuery.executeUpdate();
		
	}

}
