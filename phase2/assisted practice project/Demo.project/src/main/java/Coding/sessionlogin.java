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
 * Servlet implementation class sessionlogin
 */
@WebServlet("/sessionlogin")
public class sessionlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sessionlogin() {
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

		      String name = request.getParameter("userName");
		      String password = request.getParameter("userPassword");
		      
		      pwriter.print("Hello "+name);
		      pwriter.print("Your Password is: "+password);
		      
		      //creating the HttpSession below
		      HttpSession session=request.getSession(); 
		      
		      session.setAttribute("uname",name);
		      session.setAttribute("upass",password);
		      
		      pwriter.print("<a href='welcome'>view details</a>");
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
