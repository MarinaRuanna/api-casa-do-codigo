package br.com.ruana.marina.casadocodigo.models;


import javax.persistence.*;
import java.util.Date;


@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true, nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String resumo;
    @Column(nullable = false, length = 500)
    private String sumario;
    @Column(nullable = false, length = 20)
    private double preco;
    @Column(nullable = false)
    private int paginas;
    @Column(unique = true, nullable = false)
    private String isbn;
    @Column
    private Date lancamento;

    @JoinColumn(name = "autorId", unique = true, nullable = false)
    @ManyToOne
    private Autor autor;

    @JoinColumn(name = "categoriaId", unique = true, nullable = false)
    @ManyToOne
    private Categoria categoria;

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Livro() {
    }

    public Livro(String titulo, String resumo, String sumario, double preco, int paginas, String isbn, Date lancamento) {
        this.titulo = titulo;
        this.resumo = resumo;
        this.sumario = sumario;
        this.preco = preco;
        this.paginas = paginas;
        this.isbn = isbn;
        this.lancamento = lancamento;
    }


    public Integer getId() {
        return id;
    }

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

    public Autor getAutor() {
        return autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
