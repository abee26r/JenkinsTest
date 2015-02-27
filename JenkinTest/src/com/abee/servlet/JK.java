package com.abee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.abee.logic.ProcessSomething;

/**
 * Servlet implementation class JK
 */
@WebServlet("/jk.do")
public class JK extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProcessSomething ps = new ProcessSomething();

    /**
     * Default constructor. 
     */
    public JK() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST >>");
		request.setAttribute("message", ps.process(request.getParameter("name")));
		request.getRequestDispatcher("/resp.jsp").forward(request, response);
		System.out.println("POST <<");
	}

}
