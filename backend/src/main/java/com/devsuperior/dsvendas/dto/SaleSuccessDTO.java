package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO() {
	}

	//vai receber o nome como parametro para realizar a consulta


	public String getSellerName() {
		return sellerName;
	}

	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	
}
