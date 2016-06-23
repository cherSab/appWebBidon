/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streaming.service.UtilisateurService;

/**
 *
 * @author cherg
 */
@WebServlet(name = "UtilisateurServlet", urlPatterns = {"/UtilisateurServlet"})
public class UtilisateurServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
      String email=req.getParameter("email");
      String password=req.getParameter("password");
        
        new UtilisateurService().verifier(email,password);
        req.getRequestDispatcher("connecte.jsp").forward(req, resp);
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("utilisateur.jsp").forward(req, resp);
    }  
    
    }
    




 
         


