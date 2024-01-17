package servletdemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		String name = request.getParameter("name");
		System.out.println("Your name is " + name);
		String email = request.getParameter("email");
		System.out.println("Your email is " + email);
		String password = request.getParameter("password");
		System.out.println("Your email is " + password);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancedjava", "root",
					"kaushalya@2017");
			//Statement stmt = con.createStatement();		
			String sql = "insert into user(name,email,password) values(?,?,?)";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, name);
			statement.setString(2, email);
			statement.setString(3, password);
			System.out.println("sql ##"+sql);
			int result = statement.executeUpdate();
			System.out.println("records inserted " + result);

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		PrintWriter writer = response.getWriter();
		// writer.println("Thanks for registering with us "+name);
		String msg = "Thanks for registering with us " + name;
		writer.println("<h1>" + msg + "</h1>");
		writer.flush();

	}

}
