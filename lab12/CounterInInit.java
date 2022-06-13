package lab12;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class CounterInInit
 */
@WebServlet("/CounterInInit")
public class CounterInInit extends HttpServlet {
	int counter;
	public void init() {
		counter=2;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		 PrintWriter pw= response.getWriter();
		 counter++;
		 pw.println("Since loading this servlet has been accessed "+counter+ "");
	}

}
