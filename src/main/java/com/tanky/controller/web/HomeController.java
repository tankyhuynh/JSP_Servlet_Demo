package com.tanky.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tanky.Utils.HttpUtils;
import com.tanky.model.UserModel;
import com.tanky.service.IUserService;

@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet {

	@Inject
	private IUserService userService;
	
	private static final long serialVersionUID = 1L;

//	@Inject
//	private IUserService userService;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		req.setAttribute("users", userService.fillAll());
		
//		String userName = req.getParameter("username");
//		String passWord = req.getParameter("password");
//		
//		UserModel userModel = new UserModel();
//		userModel.setUserName(userName);
//		userModel.setPassWord(passWord);
//		
//		req.setAttribute("UserModel", userModel);
//		
//		
//		if (userName.equalsIgnoreCase("admin") && passWord.equalsIgnoreCase("admin")) {
//			req.setAttribute("message", "<p>Dang Nhap Thanh Cong</p>");
//			
//			RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
//			rd.forward(req, resp);
//		}
//		else {
//			req.setAttribute("message", "<p>Tai Khoan Khong Hop Le</p>");
//			
//			RequestDispatcher rd = req.getRequestDispatcher("/views/web/login.jsp");
//			rd.forward(req, resp);
//		}
		
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		HttpUtils.of(req.getReader());
		
		
		
		
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher rd= req.getRequestDispatcher("/views/web/login.jsp");
		rd.forward(req, resp);
	}
	
	
	
	
	
}
