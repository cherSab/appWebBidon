/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Serie;

/**
 *
 * @author tom
 */
public class SerieDAO {
    public Serie rechercherParId(Long id){
     EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.find(Serie.class, id);   
    }
    
    public List<Serie> listerTous(){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.createQuery("SELECT f FROM Serie f").getResultList();
    }
     public void ajouter(Serie s) {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(s);
        em.getTransaction().commit();
    }
}
