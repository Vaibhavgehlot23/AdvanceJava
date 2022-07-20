package in.co.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.Bean.MarksheetBean;
import in.co.model.MarksheetModel;
@WebServlet("/Mark")
public class AddMarksheetCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget");
                
                  
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		MarksheetBean mb = new MarksheetBean();
		MarksheetModel mm = new MarksheetModel();

		mb.setRollno(req.getParameter("Rollno"));
		mb.setName(req.getParameter("Name"));
		mb.setPhy(Integer.parseInt(req.getParameter("Physics")));
		mb.setChem(Integer.parseInt(req.getParameter("Chemistry")));
		mb.setMaths(Integer.parseInt(req.getParameter("Maths")));

		try {
			mm.add(mb);
			RequestDispatcher rd = req.getRequestDispatcher("AddMarksheet.jsp");
			req.setAttribute("ok", "Succesfully added Record ");
			rd.forward(req, resp);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
