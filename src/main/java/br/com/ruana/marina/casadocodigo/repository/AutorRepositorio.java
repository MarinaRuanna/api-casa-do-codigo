package br.com.ruana.marina.casadocodigo.repository;

import br.com.ruana.marina.casadocodigo.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor, Integer> {

   Autor findByEmail(String email);

   Autor findByNome(String nome);

}
