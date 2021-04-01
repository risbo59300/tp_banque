package addServlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistance.entities.Etudiant;

import persistence.Dao.EtudiantDaoImpl;

/**
 * Servlet implementation class addServletEtudiant
 */
@WebServlet("/addServletEtudiant")
public class addServletEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addServletEtudiant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//recuppération des données saisi dans le formulaire
		String code = request.getParameter("code");
		String nom = request.getParameter("nom");
		String moyenne = request.getParameter("moyenne");
		
		//conversion des données dans le bon format
		BigDecimal cod = new BigDecimal(code);
		double moy = Float.parseFloat(moyenne);
		
		//Ajout des étudiant dans la base de données
		Etudiant etudiant = new Etudiant();
		etudiant.setCode(cod);
		etudiant.setNom(nom);
		etudiant.setMoyenne(moy);
		
		//Ajout des étudiant dans la base de données
		EtudiantDaoImpl  dao=new EtudiantDaoImpl();
		dao.add(etudiant);
		
		
		
		//consultation de la liste des étudiants qui ont été ajouté
		List<Etudiant> lEtudiant = dao.findAll();
		request.setAttribute("listeE", lEtudiant);
		
		request.getRequestDispatcher("/listEtudiants.jsp").forward(request, response);
		
	}

}
