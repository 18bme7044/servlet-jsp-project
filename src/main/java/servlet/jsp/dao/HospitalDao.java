package servlet.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Person;

import servlet.jsp.dto.Hospital;

public class HospitalDao {
	public Hospital saveHospital(Hospital hsp) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkat");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(hsp);
		et.commit();
		return hsp;
	}
	public Hospital updateHospital(Hospital hsp) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkat");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.merge(hsp);
		et.commit();
		return hsp;
	}
	public Hospital deleteHospital(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkat");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Hospital hsp = em.find(Hospital.class, id);
		if (hsp != null) {
			et.begin();
			em.remove(hsp);
			et.commit();
			return hsp;
			
		}
		return null;

	}
	public List<Hospital> getAllHospitals() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkat");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("select a from Hospital a");
		List<Hospital> list = query.getResultList();
		return list;
																
		}
	public Hospital getHospitalById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("venkat");
		EntityManager em = emf.createEntityManager();

		Hospital hsp = em.find(Hospital.class, id);
		
		return hsp;
	}

}
