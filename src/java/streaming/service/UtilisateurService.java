/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import streaming.dao.UtilisateurDAO;
import streaming.entity.Utilisateur;

/**
 *
 * @author cherg
 */
public class UtilisateurService {
    
    
    public Utilisateur verifier (String login,String mdp){
      return new UtilisateurDAO().verifier(login,mdp);
    }
}
