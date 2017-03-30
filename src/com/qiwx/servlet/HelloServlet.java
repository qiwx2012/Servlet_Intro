package com.qiwx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *@Author qiwx
 *@time  2017��3��30�� ����3:53:20
 *@Des
 **/
public class HelloServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String urlString=req.getRequestURL().toString();
		System.out.print(urlString);
		
		PrintWriter outPrintWriter=resp.getWriter();
		outPrintWriter.println("HelloServlet!!");
	}

}
