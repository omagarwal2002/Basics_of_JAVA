package lab12;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextAttributeSetter
 */
@WebServlet("/ContextAttributeSetter")
public class ContextAttributeSetter extends HttpServlet {
	
	ServletContext servletContext;
	public void init(ServletConfig config)throws ServletException {
		//blind an object that is to be shared among other servlets
		servletContext= config.getServletContext();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw= response.getWriter();
		pw.print("Context Parameters are: ");
		
		pw.println("<BR>");
		pw.println("Password is: " +servletContext.getInitParameter("password"));
		pw.println("<BR>");
		
		servletContext.setAttribute("password", "dingdong");
		
		pw.println("<BR>");
		pw.println("Nwe Password Attribute: "+servletContext.getAttribute("password"));
		pw.println("<BR>");
		pw.println("Password parameter: "+servletContext.getInitParameter("password"));
	}
}
