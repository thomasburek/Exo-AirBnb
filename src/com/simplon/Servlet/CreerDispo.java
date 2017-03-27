package com.simplon.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplon.Bean.Dispo;
import com.simplon.Bean.Logement;
import com.simplon.Bean.Proprietaire;
import com.simplon.DAO.DispoDAO;
import com.simplon.DAO.LogementDAO;


@WebServlet("/CreerDispo")
public class CreerDispo extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		this.getServletContext().getRequestDispatcher("/WEB-INF/dispo.jsp").forward(request, response);	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String dateDebut = request.getParameter("dateDebut");
			String dateFin = request.getParameter("dateFin");
			String idLogement = request.getParameter("idLogement");
			
			Dispo dispo = new Dispo();
					
			dispo.setDateDebut(dateDebut);
			dispo.setDateFin(dateFin);
			dispo.setLogement(new Logement());
			dispo.getLogement().setId(Integer.parseInt(idLogement));
			
						
			DispoDAO dispodao = new DispoDAO();	
			dispodao.addDispo(dispo);
			
			this.getServletContext().getRequestDispatcher("/Profil").forward(request, response);
	}

}
