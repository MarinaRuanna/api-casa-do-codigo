package br.com.ruana.marina.casadocodigo.service;

import br.com.ruana.marina.casadocodigo.models.Categoria;
import br.com.ruana.marina.casadocodigo.repository.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepositorio repositorio;

    protected void nomeUnico(String nome) throws Exception {

        Categoria categoria= repositorio.findByNome(nome);

        if (categoria != null) {
            throw new Exception("Categoria já existe.");
        }
    }

    public Categoria buscarNomeCategoria (String nome) {
        Categoria categoria = repositorio.findByNome(nome);

        if (!categoria.getNome().equalsIgnoreCase(nome)) {
            System.out.println("Categoria já existe.");
        }
        return categoria;
    }

    public Optional<Categoria> buscarCategoria(Integer categoriaId) {
        Optional<Categoria> categoria = repositorio.findById(categoriaId);
        return categoria;
    }

    public void salvar(Categoria categoria) throws Exception {
        nomeUnico(categoria.getNome());
        repositorio.save(categoria);
    }

}
