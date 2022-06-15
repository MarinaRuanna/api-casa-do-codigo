package br.com.ruana.marina.casadocodigo.dto.response;

public class CategoriaResponse {

    private Integer id;
    private String nome;

    public CategoriaResponse(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
