package br.com.ruana.marina.casadocodigo.dto.request;

import br.com.ruana.marina.casadocodigo.models.Autor;

import java.util.Date;

public class LivroRequest {

    private String titulo;
    private String resumo;
    private String sumario;
    private double preco;
    private int paginas;
    private String isbn;
    private Date lancamento;

    private Integer autorId;

    private Integer categoriaId;


    public String getTitulo() {
        return titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public String getSumario() {
        return sumario;
    }

    public double getPreco() {
        return preco;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public Integer getAutorId() {
        return autorId;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public LivroRequest(String titulo, String resumo, String sumario, double preco, int paginas, String isbn, Date lancamento, Integer autorId, Integer categoriaId) {
        this.titulo = titulo;
        this.resumo = resumo;
        this.sumario = sumario;
        this.preco = preco;
        this.paginas = paginas;
        this.isbn = isbn;
        this.lancamento = lancamento;
        this.autorId = autorId;
        this.categoriaId = categoriaId;
    }
}
