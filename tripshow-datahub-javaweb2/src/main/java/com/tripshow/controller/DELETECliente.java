package com.tripshow.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tripshow.connection.DAOCliente;
import com.tripshow.models.Cliente;

/**
 * Servlet implementation class DELETECliente
 */
@WebServlet({ "/DELETECliente", "/Cliente.Delete" })
public class DELETECliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DELETECliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher despacho = null;
				
				try {
				DAOCliente daocliente = new DAOCliente();
				
				Cliente cliente = new Cliente();
				
				cliente.setId_cliente(Integer.parseInt(request.getParameter("txtIdCli")));
				
				daocliente.excluirCliente(cliente);
				
				despacho = request.getRequestDispatcher("sucesso.jsp");
				
				
				}catch(Exception exception) {
					despacho = request.getRequestDispatcher("erro.jsp");
					exception.printStackTrace();
				}finally {
					despacho.forward(request, response);
				}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
