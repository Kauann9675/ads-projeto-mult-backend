package br.com.senaisp.bauru.prjCtrlFinanceiro.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Lancamento {

    private BigDecimal valor;
    //Indicará no banco de dados que a coluna vai se chamar data_lancamento
    @Column(name = "data_lancamento")
    private LocalDate dataLancamento;

    private String observacao;
   

	//Indicará no banco de dados que a coluna vai se chamar categoria_id e irá relacionar-se com a tabela de categorias
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    //Indicará no banco de dados que a coluna vai se chamar usuario_id e irá relacionar-se com a tabela de usuarios
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
	
    public Lancamento(BigDecimal valor, LocalDate dataLancamento, String observacao, Categoria categoria, Usuario usuario) {
        this.valor = valor;
        this.dataLancamento = dataLancamento;
        this.observacao = observacao;
        this.categoria = categoria;
        this.usuario = usuario;
}
//Getters e setters
public BigDecimal getValor() {
    return valor;
}

public void setValor(BigDecimal valor) {
    this.valor = valor;
}

public LocalDate getDataLancamento() {
    return dataLancamento;
}

public void setDataLancamento(LocalDate dataLancamento) {
	this.dataLancamento = dataLancamento;
}

public Categoria getCategoria() {
    return categoria;
}

public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
}

public String getObservacao() {
    return observacao;
}
public void setObservacao(String observacao) {
	this.observacao = observacao;
}

public Usuario getUsuario() {
    return usuario;
}

public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
}
}

