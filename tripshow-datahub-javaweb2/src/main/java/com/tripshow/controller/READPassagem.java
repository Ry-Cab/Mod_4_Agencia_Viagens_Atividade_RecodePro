package com.tripshow.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tripshow.connection.DAODestino;
import com.tripshow.connection.DAOPassagem;
import com.tripshow.models.Destino;
import com.tripshow.models.Passagem;

/**
 * Servlet implementation class READPassagem
 */
@WebServlet({ "/READPassagem", "/Passagem.Read" })
public class READPassagem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public READPassagem() {
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
			DAOPassagem daopassagem = new DAOPassagem();
			
			Passagem passagem = new Passagem();
			
			passagem.setId_passagem(Integer.parseInt(request.getParameter("txtIdPas")));
			
			passagem = daopassagem.consultarPassagem(passagem);
			
			request.setAttribute("passagem", passagem);
		
			despacho = request.getRequestDispatcher("DETALHESPassagem.jsp");
			
			
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
