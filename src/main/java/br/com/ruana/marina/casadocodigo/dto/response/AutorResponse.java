package br.com.ruana.marina.casadocodigo.dto.response;

public class AutorResponse {

    private String nome;
    private String email;

    public AutorResponse(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
