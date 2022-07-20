package in.co.ctl;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.Bean.MarksheetBean;
import in.co.model.MarksheetModel;

@WebServlet("/MeritCtl")
public class MarksheetMeritListCtl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget");
		MarksheetModel mm = new MarksheetModel();
		MarksheetBean mb = new MarksheetBean();
		List<MarksheetBean> list = null;
		try {

			list = mm.getMeritList();
			RequestDispatcher rd = req.getRequestDispatcher("MarksheetMeritList.jsp");
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

		MarksheetModel mm = new MarksheetModel();
		MarksheetBean mb = new MarksheetBean();
		List<MarksheetBean> list = null;
		try {

			list = mm.getMeritList();
			RequestDispatcher rd = req.getRequestDispatcher("MarksheetMeritList.jsp");
			req.setAttribute("ok", list);
			rd.forward(req, resp);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}