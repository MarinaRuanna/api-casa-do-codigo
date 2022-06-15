package br.com.ruana.marina.casadocodigo.repository;

import br.com.ruana.marina.casadocodigo.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepositorio extends JpaRepository<Livro, Integer> {

    Livro findByTitulo(String livro);


}
