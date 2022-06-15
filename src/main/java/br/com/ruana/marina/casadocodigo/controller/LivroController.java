package br.com.ruana.marina.casadocodigo.controller;

import br.com.ruana.marina.casadocodigo.dto.request.LivroRequest;
import br.com.ruana.marina.casadocodigo.dto.response.LivroResponse;
import br.com.ruana.marina.casadocodigo.models.Livro;
import br.com.ruana.marina.casadocodigo.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class LivroController {

    @Autowired
    LivroService service;

    @PostMapping("/novo-livro")
    public ResponseEntity<?> novoLivro(@RequestBody LivroRequest request) throws Exception {

        Livro livro = new Livro(request.getTitulo(), request.getResumo(), request.getSumario(), request.getPreco(), request.getPaginas(), request.getIsbn(), request.getLancamento());
        service.salvar(livro, request.getAutorId(), request.getCategoriaId());

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/buscar-livro-id")
    public  ResponseEntity<LivroResponse> buscarLivroId(@RequestParam Integer id) {
        Livro livro = service.buscarLivro(id);
        LivroResponse livroResponse = new LivroResponse(livro.getTitulo(), livro.getResumo(), livro.getIsbn(), livro.getAutor().getNome(), livro.getCategoria().getNome());
        return ResponseEntity.status(HttpStatus.OK).body(livroResponse);
    }

    @GetMapping("/buscar-livro")
    public ResponseEntity<LivroResponse> buscarLivro (@RequestParam String titulo) {
        Livro livro = service.buscarTitulo(titulo);
        LivroResponse livroResponse = new LivroResponse(livro.getTitulo(), livro.getResumo(), livro.getIsbn(), livro.getAutor().getNome(), livro.getCategoria().getNome());
        return ResponseEntity.status(HttpStatus.OK).body(livroResponse);
    }

}
