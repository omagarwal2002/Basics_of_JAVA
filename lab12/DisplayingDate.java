package lab12;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
/**
 * Servlet implementation class DisplayingDate
 */
@WebServlet("/DisplayingDate")
public class DisplayingDate extends HttpServlet {public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
			PrintWriter out = response.getWriter();
			Date today= new Date(0);
			 out.println("<HTML>");
			 out.println("<HEAD>");
			 out.println("<TITLE>Display Date</TITLE>");
			 out.println("</HEAD>");
			 out.println("<BODY>");
			 out.println("<H1>Today Date is</H1>");
			 out.println("<b>"+ today+ "</b>");
			 out.println("</BODY>");
			 out.println("</HTML>");
			

}

}
