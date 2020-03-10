package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.StringUtils;
import com.service.UserService;

/**
 * Servlet implementation class contrl
 */
@WebServlet("/contrl")
public class contrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserService us = new UserService();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		String userId = request.getParameter("userId");
		String userPsw = request.getParameter("userPsw");
		String userEmail = request.getParameter("userEmail");
		if(StringUtils.isNullOrEmpty(userId) || StringUtils.isNullOrEmpty(userPsw) 
				|| StringUtils.isNullOrEmpty(userEmail)) {
			request.getRequestDispatcher("bbs-project/regist.jsp").forward(request, response);
			return;
		}
		else if(us.finduser(userId)==null) {
			request.getRequestDispatcher("bbs-project/regist.jsp").forward(request, response);
			return;
		}
		else {
			request.getRequestDispatcher("bbs-project/regist.jsp").forward(request, response);
			return;
		}
		}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
