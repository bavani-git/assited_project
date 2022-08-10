package javacode.phase2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.net.httpserver.HttpServer;

public class Validate extends HttpServlet 
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		PrintWriter out= res.getWriter();
		String user = req.getParameter("user");
		String pass = req.getParameter("password");
		
		String name="bavani";
		String word="sankar";
		
		if(user.equals(name)&&pass.equals(word))
		{
			out.println("valid");
		}
		else
		{
			out.print(" not- valid");
		}
		
		out.println();
	}
}
