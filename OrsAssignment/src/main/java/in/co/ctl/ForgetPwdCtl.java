package in.co.ctl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import in.co.Bean.RegistrationBean;
import in.co.model.RegistrationModel;

@WebServlet("/Forget")
public class ForgetPwdCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post");
		String s = req.getParameter("login");

		RegistrationModel rm = new RegistrationModel();
		RegistrationBean rb = new RegistrationBean();

		try {
			rb = rm.forget(s);
			RequestDispatcher rd = req.getRequestDispatcher("ForgetPassword.jsp");
			req.setAttribute("Nmsg", rb.getPassword());
			rd.forward(req, resp);

		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}
}
