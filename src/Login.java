

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        
	        //String admin = request.getParameter("admin");
	        //String advertiser = request.getParameter("advertiser");
	        //String agent = request.getParameter("agent");
	        //String buyer = request.getParameter("buyer");
	        String username = request.getParameter("login");
	        String password = request.getParameter("password");
	   
	         if ( Validate.userLogin_Admin(username, password))
	        {
	        
	            RequestDispatcher rs = request.getRequestDispatcher("admin.html");
	            rs.forward(request, response);
	           
	        }
	         
	        else
	        
	        {
	        	out.println("Username or Password incorrect");
		          RequestDispatcher rs = request.getRequestDispatcher("login1.html");
		           rs.include(request, response);
		           
	        }
	        
	    }  
	
	}


