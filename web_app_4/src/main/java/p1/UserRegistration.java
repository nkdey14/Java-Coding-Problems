package p1;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registerUser")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserRegistration() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		
		System.out.println(name);
		System.out.println(phone);
		System.out.println(email);
		System.out.println(city);
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_app_4","root","nitin");
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("insert into Registration values ('"+name+"', '"+phone+"', '"+email+"', '"+city+"')");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
