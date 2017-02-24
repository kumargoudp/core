package com.emids.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MailServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		System.out.println("Path " + path);

		if ("/allmail.do".equals(path)) {
			String result="1 A,2 A,3 A,4 A";
			List<String> mailList = new ArrayList<String>();
			// try {
			/*
			 * Class myClass = Class.forName("com.emids.controller.Demo");
			 * System.out.println("myClass.getName() = " + myClass.getName());
			 * try { Demo demo = (Demo)myClass.newInstance();
			 * System.out.println(demo);
			 */
			System.out.println("Test++");
			/*
			 * } catch (InstantiationException | IllegalAccessException e) { //
			 * TODO Auto-generated catch block e.printStackTrace(); } } catch
			 * (ClassNotFoundException e) { // TODO Auto-generated catch block
			 * //e.printStackTrace(); }
			 */
			mailList.add("1 A");
			mailList.add("2 A");
			mailList.add("3 A");
			mailList.add("4 A");
			mailList.add("5 A");
			request.setAttribute("allmails", mailList);
			System.out.println("Result "+result);
			response.getWriter().write(result);
			
		}
	}

}
