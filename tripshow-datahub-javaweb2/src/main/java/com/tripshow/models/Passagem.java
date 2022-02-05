package com.tripshow.models;


public class Passagem {
	private int id_passagem;
	private String data_compra;
	private int FK_id_cliente;
	private int FK_id_destino;
	
	
	public int getId_passagem() {
		return id_passagem;
	}
	public void setId_passagem(int id_passagem) {
		this.id_passagem = id_passagem;
	}
	public String getData_compra() {
		return data_compra;
	}
	public void setData_compra(String data_compra) {
		this.data_compra = data_compra;
	}
	public int getFK_id_cliente() {
		return FK_id_cliente;
	}
	public void setFK_id_cliente(int fK_id_cliente) {
		FK_id_cliente = fK_id_cliente;
	}
	public int getFK_id_destino() {
		return FK_id_destino;
	}
	public void setFK_id_destino(int fK_id_destino) {
		FK_id_destino = fK_id_destino;
	}
	
	
}


