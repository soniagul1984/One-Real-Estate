import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate 
{

	 public static boolean userLogin_Admin(String username,String password) 
     {
      boolean st =false;
      try
      {

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/database","root","Sweetheart@35");
         PreparedStatement ps =con.prepareStatement
                             ("select * from admin where username=? and password=?");
         ps.setString(1, username);
         ps.setString(2, password);
         ResultSet rs =ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
      return st; 
     }
      
      public static boolean userLogin_Advertiser(String username,String password)
      {
    	  boolean st =false;
          try
          {

    	 //loading drivers for mysql
             Class.forName("com.mysql.jdbc.Driver");

     	 //creating connection with the database 
             Connection con=DriverManager.getConnection
                            ("jdbc:mysql://localhost:3306/database","root","Sweetheart@35");
             PreparedStatement ps =con.prepareStatement
                                 ("select * from advertiser where username=? and password=?");
             ps.setString(1, username);
             ps.setString(2, password);
             ResultSet rs =ps.executeQuery();
             st = rs.next();
            
          }catch(Exception e)
          {
              e.printStackTrace();
          }
          return st; 
    	  
      }
      public static boolean userLogin_Agent(String username, String password)
      {
    	  
    	  boolean st =false;
          try{

    	 //loading drivers for mysql
             Class.forName("com.mysql.jdbc.Driver");

     	 //creating connection with the database 
             Connection con=DriverManager.getConnection
                            ("jdbc:mysql://localhost:3306/database","root","Sweetheart@35");
             PreparedStatement ps =con.prepareStatement
                                 ("select * from owner where username=? and password=?");
             ps.setString(1, username);
             ps.setString(2, password);
             ResultSet rs =ps.executeQuery();
             st = rs.next();
            
          }catch(Exception e)
          {
              e.printStackTrace();
          }
          return st; 
      }
      
      
                         
      public static boolean userLogin_Buyer(String username, String password)
      {
    	  
    	  boolean st =false;
          try
          {

    	 //loading drivers for mysql
             Class.forName("com.mysql.jdbc.Driver");

     	 //creating connection with the database 
             Connection con=DriverManager.getConnection
                            ("jdbc:mysql://localhost:3306/database","root","Sweetheart@35");
             PreparedStatement ps =con.prepareStatement
                                 ("select * from buyer where username=? and password=?");
             ps.setString(1, username);
             ps.setString(2, password);
             ResultSet rs =ps.executeQuery();
             st = rs.next();
            
          }catch(Exception e)
          {
              e.printStackTrace();
          }
          return st; 
      } 
	
	
      public static int userSignup_Admin(Userbean  user)
      {
    	  String query = "INSERT INTO admin(username, f_name,l_name, password, email_address, phone, address, city, state )" + "values(?,?,?,?,?,?,?,?,?)";
    	  
    	  int st = 0;
          try
          {

    	 //loading drivers for mysql
             Class.forName("com.mysql.jdbc.Driver");

     	 //creating connection with the database 
             Connection con=DriverManager.getConnection
                            ("jdbc:mysql://localhost:3306/database","root","Sweetheart@35");
            
             PreparedStatement ps =con.prepareStatement(query);
             ps.setString(1,user.getUsername());
             ps.setString(2,user.getPassword());
            // ps.setString(3,"2");
             ps.setString(3,user.getF_name());
             ps.setString(4,user.getL_name());
             ps.setString(5,user.getEmailid());
             ps.setString(6,user.getPhone_no());
             ps.setString(7,user.getAddress());
             ps.setString(8,user.getCity());
             ps.setString(9,user.getState());
             
           
          
             st = ps.executeUpdate();
             
            
          }catch(Exception e)
          {
              e.printStackTrace();
          }
          return st; 
      } 
      public static int userSignup_Buyer(Userbean  user)
      {
    	  String query = "INSERT INTO buyer(username, password, f_name, l_name, email_address, phone, address, city, state )" + "values(?,?,?,?,?,?,?,?,?)";
    	  
    	  int st = 0;
          try
          {

    	 //loading drivers for mysql
             Class.forName("com.mysql.jdbc.Driver");

     	 //creating connection with the database 
             Connection con=DriverManager.getConnection
                            ("jdbc:mysql://localhost:3306/database","root","Sweetheart@35");
            
             PreparedStatement ps =con.prepareStatement(query);
             ps.setString(1,user.getUsername());
             ps.setString(2,user.getPassword());
            // ps.setString(3,"2");
             ps.setString(3,user.getF_name());
             ps.setString(4,user.getL_name());
             ps.setString(5,user.getEmailid());
             ps.setString(6,user.getPhone_no());
             ps.setString(7,user.getAddress());
             ps.setString(8,user.getCity());
             ps.setString(9,user.getState());
             
           
          
             st = ps.executeUpdate();
             
            
          }catch(Exception e)
          {
              e.printStackTrace();
          }
          return st; 
	
}
      public static int userSignup_Advertiser(Userbean  user)
      {
    	  String query = "INSERT INTO advertiser(username, password, f_name, l_name, email, phone, address, city, state )" + "values(?,?,?,?,?,?,?,?,?)";
    	  
    	  int st = 0;
          try
          {

    	 //loading drivers for mysql
             Class.forName("com.mysql.jdbc.Driver");

     	 //creating connection with the database 
             Connection con=DriverManager.getConnection
                            ("jdbc:mysql://localhost:3306/database","root","Sweetheart@35");
            
             PreparedStatement ps =con.prepareStatement(query);
             ps.setString(1,user.getUsername());
             ps.setString(2,user.getPassword());
            // ps.setString(3,"2");
             ps.setString(3,user.getF_name());
             ps.setString(4,user.getL_name());
             ps.setString(5,user.getEmailid());
             ps.setString(6,user.getPhone_no());
             ps.setString(7,user.getAddress());
             ps.setString(8,user.getCity());
             ps.setString(9,user.getState());
             
           
          
             st = ps.executeUpdate();
             
            
          }catch(Exception e)
          {
              e.printStackTrace();
          }
          return st; 
	
}
    
    

      public static int userSignup_Agent(Userbean  user)
      {
    	  String query = "INSERT INTO owner(username, password, f_name, l_name, email, phone, address, city, state )" + "values(?,?,?,?,?,?,?,?,?)";
    	  
    	  int st = 0;
          try
          {

    	 //loading drivers for mysql
             Class.forName("com.mysql.jdbc.Driver");

     	 //creating connection with the database 
             Connection con=DriverManager.getConnection
                            ("jdbc:mysql://localhost:3306/database","root","Sweetheart@35");
            
             PreparedStatement ps =con.prepareStatement(query);
             ps.setString(1,user.getUsername());
             ps.setString(2,user.getPassword());
            // ps.setString(3,"2");
             ps.setString(3,user.getF_name());
             ps.setString(4,user.getL_name());
             ps.setString(5,user.getEmailid());
             ps.setString(6,user.getPhone_no());
             ps.setString(7,user.getAddress());
             ps.setString(8,user.getCity());
             ps.setString(9,user.getState());
             
           
          
             st = ps.executeUpdate();
             
            
          }catch(Exception e)
          {
              e.printStackTrace();
          }
          return st; 
	
}
      
      
      
      
}
