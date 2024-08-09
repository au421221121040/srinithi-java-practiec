import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/test2")
public class MyServlet2 extends GenericServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("servlet class is loaded");
	}
	
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw =resp.getWriter();
		pw.println("<html>  <body bgcolor=red>"
				+ "<h1 color=black>Kvcet training</h1>");			
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("servlet is destroyed");
	}

}
