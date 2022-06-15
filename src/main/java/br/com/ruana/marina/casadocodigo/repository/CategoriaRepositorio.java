package br.com.ruana.marina.casadocodigo.repository;

import br.com.ruana.marina.casadocodigo.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositorio extends JpaRepository <Categoria, Integer> {

    Categoria findByNome(String nome);
}
