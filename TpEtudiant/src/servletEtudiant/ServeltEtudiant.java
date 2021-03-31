package servletEtudiant;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import etudiant.EtudiantJavaBean;

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
		String code = request.getParameter("code");
		
		EtudiantJavaBean etudiantJavaBean = new EtudiantJavaBean();
		
		int codeEtudiant = Integer.parseInt(code);
		etudiantJavaBean.setCodeEtudiant(codeEtudiant);
		
		request.setAttribute("nom", etudiantJavaBean.getNom());
		
		if (etudiantJavaBean.calculMoyenne()) 
		{
			request.getRequestDispatcher("/admis.jsp").forward(request, response);
		}
		else 
		{
			request.getRequestDispatcher("/refus.jsp").forward(request, response);

		}
		
	
	}

}
