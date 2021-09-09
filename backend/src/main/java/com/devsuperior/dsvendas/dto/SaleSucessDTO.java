package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSucessDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Long visite;
	private Long deals;

	public SaleSucessDTO() {
		// TODO Auto-generated constructor stub
	}

	public SaleSucessDTO(Seller seller, Long visite, Long deals) {
		sellerName = seller.getName();
		this.visite = visite;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisite() {
		return visite;
	}

	public void setVisite(Long visite) {
		this.visite = visite;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

}
