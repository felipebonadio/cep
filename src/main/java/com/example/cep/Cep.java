package com.example.cep;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cep")
public class Cep {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "cidade")
	private String cidade;

	@Column(name = "numeroCep")
	private String numeroCep;

	@Column(name = "rua")
	private String rua;
	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "uf")
	private String uf;
	
	public Cep() {
	}

	public Cep(String cidade, String numeroCep, String rua, String bairro, String uf ) {
		super();
		this.cidade = cidade;
		this.numeroCep = numeroCep;
		this.rua = rua;
		this.bairro = bairro;
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNumeroCep() {
		return numeroCep;
	}

	public void setNumeroCep(String numeroCep) {
		this.numeroCep = numeroCep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Cep [id=" + id + ", cidade=" + cidade + ", cep=" + numeroCep + ", rua=" + rua + ", bairro=" + bairro + ", uf="
				+ uf + "]";
	}	

}