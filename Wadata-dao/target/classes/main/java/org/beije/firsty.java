package org.beije;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firsty
 */
@WebServlet("/home")
public class firsty extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@javax.ejb.EJB
	private BeijeBean bean;
	
	/**
	 * With this kind of implementation you can use DI with Objects that aren't EJB's 
	 * 
	 * */
	@javax.inject.Inject
	private BeijeClass beije;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final java.io.Writer writer = response.getWriter();
		
		writer.append("<html>");
		writer.append("<head>");
		writer.append("<script type=\"text/javascript\" src=\"scripts/jquery-2.2.0.js\"></script>");
		writer.append("</head>");
		writer.append("<body>");
		writer.append("<h1>Nothing special</h1>");
		
		writer.append("<h1>" + bean.from() + "</h1>");
		writer.append("<h1>" + beije.from() + "</h1>");
		writer.append("</body>");
		writer.append("</html>");
		
	}

}
