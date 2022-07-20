package in.co.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.co.Bean.RegistrationBean;
import in.co.model.RegistrationModel;

@WebServlet("/Login")
public class LoginCtl extends HttpServlet {

	HttpSession session = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget");
		session = req.getSession();
		session.invalidate();
		resp.sendRedirect("LoginView.jsp");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post");

		String t = req.getParameter("login");
		String r = req.getParameter("pwd");
		String s = req.getParameter("SignIn");
		String LoginReg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String passRegs = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,15})";

		RegistrationModel rm = new RegistrationModel();
		RegistrationBean rb = new RegistrationBean();

		if (s.equals("SignIn")) {
			if (t.equals("") && r.equals("")) {
				RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
				req.setAttribute("Lmsg", "Enter Email id");
				req.setAttribute("Pmsg", "Enter password ");
				rd.forward(req, resp);

			} else if (t.equals("")) {
				RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
				req.setAttribute("Lmsg", "Enter Email Id");

				rd.forward(req, resp);
			} else if (!t.matches(LoginReg)) {
				RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
				req.setAttribute("Lmsg", "Enter Correct Email Id");

				rd.forward(req, resp);
			} else if (r.equals("")) {
				RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");

				req.setAttribute("Pmsg", "Enter password ");
				rd.forward(req, resp);
			} else if (!r.matches(passRegs)) {
				RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");

				req.setAttribute("Pmsg", "Enter Correct password ");
				rd.forward(req, resp);
			} else {

				try {
					rb = rm.Authenticate(t, r);
					session = req.getSession();
					if (rb.getFirstName() != null) {
						session.setAttribute("Nmsg", rb.getFirstName());
						RequestDispatcher rd = req.getRequestDispatcher("wlcm.do");

						rd.forward(req, resp);

					} else {
						RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
						req.setAttribute("msg", "Please Enter Correct Login Id pwd");
						rd.forward(req, resp);
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Error in Authenticate ");

				}
			}
		}
	}
}