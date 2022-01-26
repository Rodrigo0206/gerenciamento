package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//oi deploy
//@WebServlet(urlPatterns="/oi")
public class OiMundoServlet extends HttpServlet  {
	
	public OiMundoServlet() {
		System.out.println("Criando oi mundo servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Oi mundo, parabens voc� escreveu o primeiro servlet");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("o servlet OiMundo foi chamado");
		
	}

}
