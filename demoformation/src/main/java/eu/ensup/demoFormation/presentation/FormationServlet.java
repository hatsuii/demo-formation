package eu.ensup.demoFormation.presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.ensup.demoFormation.domaine.Formation;
import eu.ensup.demoFormation.service.FormationService;

/**
 * Servlet implementation class FormationServlet
 */
@WebServlet(value = "/ajoutFormation")
public class FormationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// "nomformation" valeur récupérer dans la jsp , via methode doPost, qui
		// appel doGet
		Formation formation = new Formation(request.getParameter("nomformation"));
		FormationService fs = new FormationService();
		fs.creationFormation(formation);

		response.sendRedirect("succesAjoutFormation.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
