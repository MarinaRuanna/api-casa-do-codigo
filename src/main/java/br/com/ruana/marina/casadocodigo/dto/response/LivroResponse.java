package br.com.ruana.marina.casadocodigo.dto.response;

public class LivroResponse {
    private String titulo;
    private String resumo;
    private String isbn;
    private String autor;
    private String categoria;

    public LivroResponse(String titulo, String resumo, String isbn, String autor, String categoria) {
        this.titulo = titulo;
        this.resumo = resumo;
        this.isbn = isbn;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }
}
