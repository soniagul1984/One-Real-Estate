

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Agent_Login
 */
@WebServlet("/Agent_Login")
public class Agent_Login extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  PrintWriter out = response.getWriter();
		String username = request.getParameter("login");
        String password = request.getParameter("password");
   
         if ( Validate.userLogin_Agent(username, password))
        {
        
            RequestDispatcher rs = request.getRequestDispatcher("agenthomepage.html");
            rs.forward(request, response);
           
        }
         
        else
        
        {
        	out.println("Username or Password incorrect");
	          RequestDispatcher rs = request.getRequestDispatcher("agentlogin.html");
	           rs.include(request, response);
	           
        }
        
    }  
	}


