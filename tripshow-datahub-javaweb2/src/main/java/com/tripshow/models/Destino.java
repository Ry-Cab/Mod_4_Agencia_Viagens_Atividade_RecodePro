package com.tripshow.models;

public class Destino {
	private int id_destino;
	private String cidade_destino;
	private String estado_destino;
	private double preco_destino;
	
	public int getId_destino() {
		return id_destino;
	}
	public void setId_destino(int id_destino) {
		this.id_destino = id_destino;
	}
	public String getCidade_destino() {
		return cidade_destino;
	}
	public void setCidade_destino(String cidade_destino) {
		this.cidade_destino = cidade_destino;
	}
	public String getEstado_destino() {
		return estado_destino;
	}
	public void setEstado_destino(String estado_destino) {
		this.estado_destino = estado_destino;
	}
	public double getPreco_destino() {
		return preco_destino;
	}
	public void setPreco_destino(double preco_destino) {
		this.preco_destino = preco_destino;
	}
	
}

