/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streaming.entity.Utilisateur;

/**
 *
 * @author cherg
 */
public class UtilisateurDAO {
    public Utilisateur verifier( String login,String mdp){
     EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
    Query query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.login= :login AND u.mdp = :mdp ");
            query.setParameter("login",login);
            query.setParameter("mdp",mdp);
            return(Utilisateur)query.getSingleResult();
           
      } } 

