package in.co.ctl;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;

import in.co.Bean.RegistrationBean;
import in.co.model.RegistrationModel;

@WebServlet(urlPatterns = "/regctl")

public class RegCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String login = req.getParameter("login");
		String pwd = req.getParameter("pwd");
		String gender = req.getParameter("gender");
		String dob = req.getParameter("dob");
		String mob = req.getParameter("mob");

		RegistrationBean bean = new RegistrationBean();

		bean.setFirstName(fname);
		bean.setLastName(lname);
		bean.setLogin(login);
		bean.setPassword(pwd);
		bean.setGender(gender);
		try {
			bean.setDob(sdf.parse(dob));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		bean.setMobileNo(mob);

		String FirstNamereg = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
		String LastNamereg = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String passreg = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
		String mobreg = "^(\\+\\d{1,3}[- ]?)?\\d{10}$";
		RegistrationModel rm = new RegistrationModel();
		RegistrationBean rb = new RegistrationBean();

		if (fname.equals("") && lname.equals("") && login.equals("") && pwd.equals("") && dob.equals("")
				&& mob.equals("")) {
			RequestDispatcher rd = req.getRequestDispatcher("RegView.jsp");
			req.setAttribute("fmsg", "Enter Firstname");
			req.setAttribute("lmsg", "Enter Lastname ");
			req.setAttribute("lomsg", "Enter LoginId ");
			req.setAttribute("pmsg", "Enter Enter password ");
			req.setAttribute("gsg", "Enter gender ");
			req.setAttribute("dmsg", "Enter date of Birth ");
			req.setAttribute("mmsg", "Enter Mobile no.. ");
			rd.forward(req, resp);

		}
		if (fname.equals("")) {
			RequestDispatcher rd = req.getRequestDispatcher("RegView.jsp");
			req.setAttribute("fmsg", "Enter FirstName");

			rd.forward(req, resp);
		} else if (!fname.matches(FirstNamereg)) {
			RequestDispatcher rd = req.getRequestDispatcher("RegView.jsp");
			req.setAttribute("fmsg", "Enter Aplhabet only");
			// req.setAttribute("Pmsg", "Enter password ");
			rd.forward(req, resp);
		} else if (lname.equals("")) {
			RequestDispatcher rd = req.getRequestDispatcher("RegView.jsp");

			req.setAttribute("lmsg", "Enter LastName ");
			rd.forward(req, resp);
		} else if (!lname.matches(LastNamereg)) {
			RequestDispatcher rd = req.getRequestDispatcher("RegView.jsp");

			req.setAttribute("lmsg", "Enter Aplhabet only");
			rd.forward(req, resp);
		} else if (login.equals("")) {
			RequestDispatcher rd = req.getRequestDispatcher("RegView.jsp");

			req.setAttribute("lomsg", "Enter Email Id ");
			rd.forward(req, resp);
		} else if (!login.matches(emailreg)) {
			RequestDispatcher rd = req.getRequestDispatcher("RegView.jsp");

			req.setAttribute("lomsg", "Enter Correct Email ID");
			rd.forward(req, resp);
		} else if (pwd.equals("")) {
			RequestDispatcher rd = req.getRequestDispatcher("RegView.jsp");

			req.setAttribute("pmsg", "Enter PWD ");
			rd.forward(req, resp);
		} else if (!pwd.matches(passreg)) {
			RequestDispatcher rd = req.getRequestDispatcher("RegView.jsp");

			req.setAttribute("pmsg", "Enter pwd in alphanumeric");
			rd.forward(req, resp);
		}
		/*
		 * if (gender.equals("")) { RequestDispatcher rd =
		 * req.getRequestDispatcher("RegView.jsp");
		 * 
		 * req.setAttribute("dmsg", "Enter Gender "); rd.forward(req, resp); }
		 */
		else if (dob.equals("")) {
			RequestDispatcher rd = req.getRequestDispatcher("RegView.jsp");

			req.setAttribute("dmsg", "Enter Dob ");
			rd.forward(req, resp);
		} else if (mob.equals("")) {
			RequestDispatcher rd = req.getRequestDispatcher("RegView.jsp");

			req.setAttribute("mmsg", "Enter mob ");
			rd.forward(req, resp);
		} else if (!mob.matches(mobreg)) {
			RequestDispatcher rd = req.getRequestDispatcher("RegView.jsp");

			req.setAttribute("mmsg", "Enter Digits only");
			rd.forward(req, resp);
		}

		else {

			try {
				rm.add(bean);
				RequestDispatcher rd = req.getRequestDispatcher("LoginView.jsp");
				req.setAttribute("msg", "Registered Successfully Please login");
				rd.forward(req, resp);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}