package br.com.codigopostal.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Principal {
	
	@JsonProperty("bairro")
	private String bairro;
	@JsonProperty("cep")
	private String cep;
	@JsonProperty("cidade")
	private String cidade;
	@JsonProperty("estado")
	private String estado;
	
	@JsonProperty("cidade_info")
	private CidadeInfo cidadeInfo;
	
	@JsonProperty("estado_info")
	private EstadoInfo estadoInfo;
	
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public CidadeInfo getCidadeInfo() {
		return cidadeInfo;
	}
	public void setCidadeInfo(CidadeInfo cidadeInfo) {
		this.cidadeInfo = cidadeInfo;
	}
	public EstadoInfo getEstadoInfo() {
		return estadoInfo;
	}
	public void setEstadoInfo(EstadoInfo estadoInfo) {
		this.estadoInfo = estadoInfo;
	}
	@Override
	public String toString() {
		return "Principal [bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado
				+ ", cidadeInfo=" + cidadeInfo + ", estadoInfo=" + estadoInfo + "]";
	}
	
	
}
