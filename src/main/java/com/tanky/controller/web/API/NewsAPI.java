package com.tanky.controller.web.API;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tanky.Utils.HttpUtils;
import com.tanky.model.UserModel;

@WebServlet(urlPatterns = {"/api-news"})
public class NewsAPI extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json");
		
		HttpUtils.of(req.getReader());
		
	}
	
}
