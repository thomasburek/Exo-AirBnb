package com.simplon.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplon.Bean.Logement;
import com.simplon.Bean.Proprietaire;
import com.simplon.DAO.LogementDAO;
import com.simplon.DAO.ProprietaireDAO;

/**
 * Servlet implementation class Profil
 */
@WebServlet("/Profil")
public class Profil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LogementDAO logementdao = new LogementDAO();
		Proprietaire proprio = (Proprietaire)request.getSession().getAttribute("sessionProprio");
		List<Logement> liste = logementdao.showList(proprio.getId());		
		request.setAttribute("liste", liste );
		this.getServletContext().getRequestDispatcher("/WEB-INF/profil.jsp").forward( request, response );
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ProprietaireDAO propriodao = new ProprietaireDAO();
		Proprietaire proprio = propriodao.findProprio(request.getParameter("uid"), request.getParameter("pwd"));
		request.getSession().setAttribute("sessionProprio", proprio);
		
		LogementDAO logementdao = new LogementDAO();
		
		request.setAttribute("liste", logementdao.showList(proprio.getId()));
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/profil.jsp").forward( request, response );
	}

}
