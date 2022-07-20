package in.co.ctl;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(filterName = "front", urlPatterns = "*.do")
public class FrontCtrl implements Filter {

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		HttpSession session = ((HttpServletRequest) req).getSession();
		if (session.getAttribute("Login") == null) {
			RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
			request.setAttribute("Error", "Session Expired please Login.....||||");
			rd.forward(request, response);
		} else {
			chain.doFilter(req, resp);

		}
	}

	public void init(FilterConfig fConfig) throws ServletException { //
	}

	public void destroy() {

	}

}
