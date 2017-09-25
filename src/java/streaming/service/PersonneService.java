/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Personne;

/**
 *
 * @author tom
 */
public class PersonneService {
    
    public List<Personne> lister(){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT f FROM Personne f ORDER BY f.nom, f.prenom").getResultList();
    }
}
