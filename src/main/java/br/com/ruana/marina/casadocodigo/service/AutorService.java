package br.com.ruana.marina.casadocodigo.service;


import br.com.ruana.marina.casadocodigo.models.Autor;
import br.com.ruana.marina.casadocodigo.repository.AutorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AutorService {

    @Autowired
    AutorRepositorio repositorio;

    public void emailUnico(String email) throws Exception {
        Autor autor = repositorio.findByEmail(email);

        if (autor != null) {
            throw new Exception("O email já existe.");
        }
    }
    public Optional<Autor> buscarAutor(Integer autorId) {
        Optional<Autor> autor = repositorio.findById(autorId);
        return autor;
    }

    public Autor buscarNome(String nome) {
        Autor autor = repositorio.findByNome(nome);

        if (!autor.getNome().equalsIgnoreCase(nome)) {
            System.out.println("Autor não encontrado");;
        }
        return autor;
    }
    public void salvar(Autor autor) throws Exception {
        emailUnico(autor.getEmail());
        repositorio.save(autor);
    }
}
