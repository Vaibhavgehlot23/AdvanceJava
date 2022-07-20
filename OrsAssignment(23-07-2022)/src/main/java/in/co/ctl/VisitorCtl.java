package in.co.ctl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VisitorCount")
public class VisitorCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget");
		ServletContext ctx = getServletContext();
		Integer count = (Integer) ctx.getAttribute("visitCount");
		if (count == null) {
			count = 1;

		} else {
			count++;
		}
		
		ctx.setAttribute("visitCount", count);
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body><center>");
		out.println("<h1>Vistor Count : " + count + "<h1>");
		out.println("</center></body></html>");
		
		

	}


	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post");
	}}