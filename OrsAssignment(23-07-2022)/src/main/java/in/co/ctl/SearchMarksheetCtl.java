package in.co.ctl;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.Bean.MarksheetBean;
import in.co.model.MarksheetModel;

import javax.servlet.http.HttpServlet;


	

	

	@WebServlet("/markView2.do")
	public class SearchMarksheetCtl extends HttpServlet {

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			System.out.println("do get");

			MarksheetBean bean = new MarksheetBean();
			MarksheetModel Model = new MarksheetModel();
			ArrayList<MarksheetBean> li = new ArrayList<MarksheetBean>();

			try {
				li = (ArrayList<MarksheetBean>) Model.search(bean);

				RequestDispatcher rd = request.getRequestDispatcher("MarkListView.jsp");
				request.setAttribute("ok", li);
				rd.forward(request, response);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

		}

	}



