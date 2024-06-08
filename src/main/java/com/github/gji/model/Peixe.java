package com.github.gji.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "peixes")
public class Peixe extends AbstractEntity<Long>{

	@Column(name = "nome_peixe", nullable = false, length = 60)
	private String nome;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false, columnDefinition = "NUMERIC(5,2)")
	private long pesoMax;
	
	@Column(nullable = true, columnDefinition = "DATE")
	private LocalDate dataCatalogacao;
	
	
	
	
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
	
	
}
