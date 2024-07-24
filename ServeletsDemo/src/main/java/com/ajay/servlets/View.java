package com.ajay.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;




/**
 * Servlet implementation class View
 */
@WebServlet("/View")
public class View extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public View() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		 
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	    PrintWriter out=response.getWriter();
		
			
		    out.println("<table>");
		    out.println("<tr>");		   
		    out.println("<th>");
		    out.println("this ");
		    out.println("</th>");
		    out.println("<th>");
		    out.println("is ");
		    out.println("</th>");
		    out.println("<th>");
		    out.println("just ");
		    out.println("</th>");
		    out.println("<th>");
		    out.println("demo ");
		    out.println("</th>");
		    out.println("<th>");
		    out.println("bye! ");
		    out.println("</th>");
		    out.println("</tr>");
		    out.println("</table>");
		    
		    out.println("<br>");
		   
		
	
			
			
		}
	}
