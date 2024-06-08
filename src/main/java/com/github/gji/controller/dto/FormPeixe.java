package com.github.gji.controller.dto;

import java.time.LocalDate;

import com.github.gji.model.Peixe;

public class FormPeixe {

	private long id;
	private String nome;
	private String descricao;
	private long pesoMax;
	private LocalDate dataCatalogacao;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public long getPesoMax() {
		return pesoMax;
	}
	public void setPesoMax(long pesoMax) {
		this.pesoMax = pesoMax;
	}
	public LocalDate getDataCatalogacao() {
		return dataCatalogacao;
	}
	public void setDataCatalogacao(LocalDate dataCatalogacao) {
		this.dataCatalogacao = dataCatalogacao;
	}
	
	
	
	public FormPeixe toForm(Peixe peixe) {
		this.id = peixe.getId();
		this.nome = peixe.getNome();
		this.descricao = peixe.getDescricao();
		this.pesoMax = peixe.getPesoMax();
		this.dataCatalogacao = peixe.getDataCatalogacao();
		return this;
	}

	public Peixe toModel() {
		Peixe peixe = new Peixe();
		peixe.setId(this.getId());
		peixe.setNome(this.getNome());
		peixe.setDescricao(this.getDescricao());
		peixe.setPesoMax(this.getPesoMax());
		peixe.setDataCatalogacao(this.getDataCatalogacao());
		return peixe;
	}
	
	
}
