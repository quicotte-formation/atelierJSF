/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import streaming.entity.Film;
import streaming.service.FilmService;

/**
 *
 * @author tom
 */
@ManagedBean
public class FilmBean {
    
    public List<Film> listerFilms(){
        return new FilmService().lister();
    }
}
