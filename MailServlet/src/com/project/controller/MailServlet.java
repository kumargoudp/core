package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;

public class MailServlet extends HttpServlet {
Connection con;
	

	public void init(ServletConfig config) throws ServletException {
		System.out.println("############Inside init() method");
		String strDriver = config.getInitParameter("driver");
		String strUrl = config.getInitParameter("dburl");
		String strUserId = config.getInitParameter("dbuid");
		String strPassword = config.getInitParameter("dbpwd");
		try {
			Class.forName(strDriver);
			con = DriverManager.getConnection(strUrl, strUserId, strPassword);
		} catch (ClassNotFoundException cnfe) {
			System.out.println(cnfe);
		} catch (SQLException sqle) {
			System.out.println(sqle);
		}
	}
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException{
		String path= request.getServletPath();
		if("/allmails.do".equalsIgnoreCase(path)){
				//Statement st=con.createStatement();
			}
	
	else if("/newmails.do".equalsIgnoreCase(path)){
		
	}
	}
}
