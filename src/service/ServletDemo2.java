package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { // ����get��ʽ���󣬲������ݷ���
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// response.getWriter().println(username + "--" + password);
		response.getWriter().println("123" + "--" + "123");
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { // ����post��ʽ���󣬲������ݷ���
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		response.getWriter().println("123" + "--" + "123");

	}
}
