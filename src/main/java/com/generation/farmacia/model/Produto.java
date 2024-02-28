package com.generation.farmacia.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")

public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome é Obrigatório!")
	@Size(min = 3, max = 200, message = "O nome deve conter no mínimo 03 e no màximo 200 caracteres")
	private String nome;
	
	@NotBlank(message = "A descrição é Obrigatório!")
	@Size(min = 5, max = 400, message = "A descrição deve conter no mínimo 05 e no màximo 400 caracteres")
	private String descricao;
	
	@NotNull
	@Min(0)
	private Long quantidade;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
    @NotNull(message = "O Preço é obrigatório!")
    @Min(1)
    private Double preco;
	
	@Size(max = 1000, message = "O atributo foto deve conter no maximo 1000 caracteres")
	private String foto;
	
	
	@NotNull(message = "A data de validade é obrigatória!")
	private LocalDate datavalidade;
	
	@ManyToOne
	@JsonIgnoreProperties("protudo")
	private Categoria categoria;
	
	


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
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


	public Long getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public LocalDate getDatavalidade() {
		return datavalidade;
	}


	public void setDatavalidade(LocalDate datavalidade) {
		this.datavalidade = datavalidade;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}  
	
	
	
}

