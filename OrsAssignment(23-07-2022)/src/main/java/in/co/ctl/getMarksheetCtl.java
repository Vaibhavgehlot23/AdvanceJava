package in.co.ctl;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.Bean.MarksheetBean;
import in.co.Bean.RegistrationBean;
import in.co.Bean.StudentBean;
import in.co.model.MarksheetModel;
import in.co.model.RegistrationModel;
import in.co.model.StudentModel;

@WebServlet("/getctl")
public class getMarksheetCtl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget");
		String s = req.getParameter("operation");

		MarksheetBean bean = new MarksheetBean();
		bean.setRollno(req.getParameter("rno"));
		MarksheetModel model = new MarksheetModel();
		List<MarksheetBean> list = null;
		try {

			list = model.get(bean);
			RequestDispatcher rd = req.getRequestDispatcher("GetMarksheetView.jsp");
			req.setAttribute("ok", list);
			rd.forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post");

		String s = req.getParameter("operation");

		MarksheetBean bean = new MarksheetBean();
		bean.setRollno(req.getParameter("rno"));
		MarksheetModel model = new MarksheetModel();
		List<MarksheetBean> list = null;
		try {

			list = model.get(bean);
			RequestDispatcher rd = req.getRequestDispatcher("GetMarksheetView.jsp");
			req.setAttribute("ok", list);
			rd.forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
