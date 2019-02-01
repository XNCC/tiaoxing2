package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { // 接收get方式请求，并将数据返回
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// response.getWriter().println(username + "--" + password);
		response.getWriter().println("123" + "--" + "123");
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { // 接收post方式请求，并将数据返回
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		response.getWriter().println("123" + "--" + "123");

	}
}
