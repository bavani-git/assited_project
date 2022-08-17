package phase2.pp2.codes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Product_serv")
public class Product_serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private static final String url = "jdbc:mysql://localhost:3306/db_world";
	    private static final String user = "root";
	    private static final String password = "root";
	    
	    Connection con;
	    PreparedStatement prSt;
	    Statement stmt;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product_serv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String Id=request.getParameter("id");
		
		String query = "select Id,Name,Price from product where Id=?";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            //out.print(Id);
			 prSt = con.prepareStatement(query);
			prSt.setString(1, Id);
			ResultSet rs=prSt.executeQuery();
			if(rs.next())
			{
				out.println(" Product Id is :"+ rs.getInt(1));
				out.println("Product Name :"+ rs.getString(2));
				out.println("Price is : "+ rs.getInt(3));
			}
			else
			{
				out.println("There is no Product with Product id "+Id);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
