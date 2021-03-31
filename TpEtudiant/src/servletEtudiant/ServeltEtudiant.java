package servletEtudiant;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import etudiant.Etudiant;

/**
 * Servlet implementation class ServeltEtudiant
 */
@WebServlet("/ServletEtudiant")
public class ServeltEtudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeltEtudiant() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String moyenne = request.getParameter("moyenne");
		
		float a = Float.parseFloat(moyenne);
		
		Etudiant etudiant = new Etudiant();
		etudiant.setMoyenne(a);
		
		PrintWriter out = response.getWriter();
		if (etudiant.calculMoyenne()) 
		{
			out.println("Vous n'avez pas la moyenne");
		}
		else 
		{
			out.println("Vous avez la moyenne");
		}
		
	
	}

}
