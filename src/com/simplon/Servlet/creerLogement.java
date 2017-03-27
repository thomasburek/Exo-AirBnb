package com.simplon.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.simplon.Bean.Logement;
import com.simplon.Bean.Proprietaire;
import com.simplon.DAO.LogementDAO;
import com.simplon.Service.AddForm;


@WebServlet("/creerLogement")
public class creerLogement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/creerLogement.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		AddForm form = new AddForm();
		
		Logement logement = form.creerLogement(request);
		logement.setProprio((Proprietaire)request.getSession().getAttribute("sessionProprio"));
		LogementDAO logementdao = new LogementDAO();	
		logementdao.addLogement(logement);			
		
		this.getServletContext().getRequestDispatcher("/Index.jsp").forward( request, response );
		
	}

}
