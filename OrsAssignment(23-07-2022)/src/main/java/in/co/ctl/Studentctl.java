package in.co.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.Bean.MarksheetBean;
import in.co.Bean.StudentBean;
import in.co.model.MarksheetModel;
import in.co.model.StudentModel;

@WebServlet("/Student")
public class Studentctl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post");

		StudentBean sb = new StudentBean();
		StudentModel sm = new StudentModel();

		sb.setRollNo(req.getParameter("rollNo"));
		sb.setFirstName(req.getParameter("firstName"));
		sb.setLastName(req.getParameter("lastName"));
		sb.setSession(req.getParameter("session"));

		String op = req.getParameter("operation");

		if (op.equals("Add")) {
			try {
				sm.add(sb);
				RequestDispatcher rd = req.getRequestDispatcher("StudentManagementView.jsp");
				req.setAttribute("ok", "Student Added Succesfully ");
				rd.forward(req, resp);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (op.equals("Modify")) {
			try {
				sm.update(sb);
				RequestDispatcher rd = req.getRequestDispatcher("StudentManagementView.jsp");
				req.setAttribute("ok", "Student Updated Succesfully ");
				rd.forward(req, resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (op.equals("Delete")) {
			try {
				sm.delete(sb);
				RequestDispatcher rd = req.getRequestDispatcher("StudentManagementView.jsp");
				req.setAttribute("ok", "Student Record Deleted Succesfully ");
				rd.forward(req, resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
