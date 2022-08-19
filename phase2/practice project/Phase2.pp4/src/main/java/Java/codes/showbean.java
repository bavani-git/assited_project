package Java.codes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class showbean
 */
@WebServlet("/showbean")
public class showbean extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showbean() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		
		ProductBean p= new ProductBean();
		p.setProductId("12");
		p.setPrice(1234);
		p.setProductName("suna pana");
		
		
		out.print("<jsp:useBean id=\"productBean\" class=\"Java.codes.ProductBean\" scope=\"session\"></jsp:useBean>\r\n"
				+ "       <jsp:setProperty property=\"*\" name=\"productBean\"/>");
		
		out.print("<a href=\"showbean.jsp\">Access bean properties from another page</a><br>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
