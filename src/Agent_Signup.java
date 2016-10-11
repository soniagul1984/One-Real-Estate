//updated

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Agent_Signup
 */
@WebServlet("/Agent_Signup")
public class Agent_Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
int status = 0;
		
	    PrintWriter out = response.getWriter();
	    Userbean user = new Userbean();
		user.setUsername(request.getParameter("user_name"));
        user.setPassword(request.getParameter("password"));
        user.setF_name(request.getParameter("first_name"));
        user.setL_name(request.getParameter("last_name"));
        user.setEmailid(request.getParameter("email"));
        user.setPhone_no(request.getParameter("phone"));
        user.setAddress(request.getParameter("address"));
        user.setState(request.getParameter("state"));
        user.setCity(request.getParameter("city"));
        		
    status = Validate.userSignup_Agent(user);
      if ( status == 0)
     {
    	  out.println("please enter correct information");
          RequestDispatcher rs = request.getRequestDispatcher("agent sign up.html");
           rs.include(request, response);
        
     }
      
     else
     
     {
     	   
	          RequestDispatcher rs = request.getRequestDispatcher("successpage.html");
	           rs.include(request, response);
	           
     }
	}

}
