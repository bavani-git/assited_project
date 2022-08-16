package Coding;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class welcome
 */
@WebServlet("/welcome")
public class welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
		      response.setContentType("text/html");
		      PrintWriter pwriter = response.getWriter();
		     
		      HttpSession session=request.getSession(false);
		      
		      String myName=(String)session.getAttribute("uname");
		      String myPass=(String)session.getAttribute("upass");
		      
		      pwriter.println("session creation time" + session.getCreationTime());
		      pwriter.println("session max interval time" +session.getMaxInactiveInterval());
		      pwriter.println("session servelt context" +session.getServletContext());
		    
		      pwriter.print("Name: "+myName+" Pass: "+myPass);
		      pwriter.close();
		  }catch(Exception exp){
		      System.out.println(exp);}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
