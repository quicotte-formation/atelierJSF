/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.entity.Pays;
import streaming.entity.Personne;
import streaming.service.FilmService;
import streaming.service.GenreService;
import streaming.service.PaysService;
import streaming.service.PersonneService;

/**
 *
 * @author tom
 */
@ManagedBean
@SessionScoped
public class FilmBean {
    
    private Film film;

    public List<Personne> getPersonnes(){
        
        return new PersonneService().lister();
    }
    
    public List<Pays> getPays(){
        
        return new PaysService().lister();
    }
    
    public List<Genre> getGenres(){
        
        return new GenreService().lister();
    }

//    public void setFilm(Film film) {
//        this.film = film;
//    }
    
    public Film getFilm() {
        return film;
    }
    
    public String modifierPOST(){
        
        new FilmService().modifier(this.film);
        
        return "lister_films.xhtml";
    }
    
    public String modifierGET(long id){
        this.film = new FilmService().rechercher(id);
        
        return "modifier_film.xhtml";
    }
    
    public String supprimerFilm(long id){
        new FilmService().supprimer(id);
        return "lister_films.xhtml";
    }
    
    public List<Film> listerFilms(){
        return new FilmService().lister();
    }
}
