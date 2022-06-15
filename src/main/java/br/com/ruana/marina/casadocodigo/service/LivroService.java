package br.com.ruana.marina.casadocodigo.service;

import br.com.ruana.marina.casadocodigo.models.Livro;
import br.com.ruana.marina.casadocodigo.repository.LivroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class LivroService {

    @Autowired
    LivroRepositorio repositorio;

    @Autowired
    CategoriaService categoriaService;

    @Autowired
    AutorService autorService;

    public Livro titulolUnico(String titulo) throws Exception {
        Livro livro = repositorio.findByTitulo(titulo);

        if (!livro.getTitulo().equalsIgnoreCase(titulo)) {
            throw new Exception("Titulo não encontrado");
        }

        return livro;
    }

    public Livro buscarTitulo(String titulo)  {
        Livro livro = repositorio.findByTitulo(titulo);

        if (!livro.getTitulo().equalsIgnoreCase(titulo)) {
            System.out.println("O email já existe.");
        }
        return livro;
    }

    public Livro buscarLivro (Integer id) {
        Optional<Livro> livro = repositorio.findById(id);
        return livro.get();
    }
    public void salvar(Livro livro, Integer autorId, Integer categoriaId) throws Exception {
        livro.setAutor(autorService.buscarAutor(autorId).get());
        livro.setCategoria(categoriaService.buscarCategoria(categoriaId).get());
        titulolUnico(livro.getTitulo());
        repositorio.save(livro);
    }

}
