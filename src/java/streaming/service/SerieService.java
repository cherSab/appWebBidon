/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.SerieDAO;
import streaming.entity.Serie;

/**
 *
 * @author cherg
 */
public class SerieService {
    
    public Serie rechercherParId(long id){
        
        SerieDAO dao = new SerieDAO();
        
        return dao.rechercherParId(id);
    }
      
    public List<Serie> lister(){
        
        SerieDAO dao = new SerieDAO();
        
        return dao.listerTous();
    }
    
    public void ajouter(Serie s) {
      new SerieDAO().ajouter(s);
    }
    
}
