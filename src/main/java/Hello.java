//package net.javatutorial.tutorials;


import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
//    private static final long serialVersionUID = -4751096228274971485L;
//	@Override
   
    private String message;
   public void init() throws ServletException {
      // Do required initialization
      message = "Hello World";
   }
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      // Set response content type
      response.setContentType("text/html");
      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<h1>" + message + "</h1>");
   }
   public void destroy() {
      // do nothing.
   }
   
//    public static void main(String args[]){
//        
//        String serverIP = "127.0.0.1";
//        String keyspace = "bank";
//
//        Cluster cluster = Cluster.builder()
//          .addContactPoints(serverIP)
//          .build();
//
//        Session session = cluster.connect(keyspace);
//        
//        StringBuilder sb = 
//        new StringBuilder("SELECT * FROM admins");
// 
//        String query = sb.toString();
//        ResultSet rs = session.execute(query);
//
//        rs.forEach(r -> {
//            System.out.println(r.getString("name") + " " + r.getString("password"));
//        });
//    }


}
