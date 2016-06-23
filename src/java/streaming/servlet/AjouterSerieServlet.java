/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.entity.Genre;
import streaming.entity.Serie;
import streaming.service.GenreService;
import streaming.service.SerieService;

/**
 *
 * @author cherg
 */
@WebServlet(name = "AjouterSerieServlet", urlPatterns = {"/AjouterSerie"})
public class AjouterSerieServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Récup genre des series
        long genreId =Long.parseLong( request.getParameter("genre_id"));
        Genre genre = new GenreService().rechercherParId(genreId);
        
        //Construie une serie
        Serie s=new Serie();
      s.setTitre(request.getParameter("titre"));
      genre.getSeries().add(s);
      s.setGenre(genre);
      
      //Persiste
      new SerieService().ajouter(s);
      //Forward vers liste series
      response.sendRedirect("series_lister" );
      
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         // Récup genres
        List<Genre> mesGenres = new GenreService().lister();
           // Init attributs pr JSP
        request.setAttribute("genres", mesGenres);
           // Forward vers JSP forumlaire
        request.getRequestDispatcher("new_serie.jsp").forward(request, response);
    }
}
    
        
        
  
