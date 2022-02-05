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
 * Servlet implementation class UPDATECliente
 */
@WebServlet({ "/UPDATECliente", "/Cliente.Update" })
public class UPDATECliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UPDATECliente() {
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
			
			Cliente cliente =  new Cliente();
			cliente.setId_cliente(Integer.parseInt(request.getParameter("txtIdCli")));
			cliente.setNome_cliente(request.getParameter("txtNomeCli"));
			cliente.setEmail_cliente(request.getParameter("txtEmailCli"));
			cliente.setData_nascimento(request.getParameter("txtDataNascCli"));
			cliente.setEstado_cliente(request.getParameter("txtEstadoCli"));
			cliente.setCidade_cliente(request.getParameter("txtCidadeCli"));
			cliente.setData_ida(request.getParameter("txtDataIdaCli"));
			cliente.setData_volta(request.getParameter("txtDataVoltaCli"));
			
			daocliente.alterarCliente(cliente);
			
			despacho = request.getRequestDispatcher("sucesso.jsp");
			
		}catch(Exception exception) {
			despacho = request.getRequestDispatcher("erro.jsp");
			
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
