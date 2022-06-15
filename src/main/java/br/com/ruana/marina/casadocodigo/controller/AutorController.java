package br.com.ruana.marina.casadocodigo.controller;

import br.com.ruana.marina.casadocodigo.dto.request.AutorRequest;
import br.com.ruana.marina.casadocodigo.dto.response.AutorResponse;
import br.com.ruana.marina.casadocodigo.models.Autor;
import br.com.ruana.marina.casadocodigo.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AutorController {


    @Autowired
    AutorService service;


    @PostMapping("/novo-autor")
    public ResponseEntity<AutorResponse> novoAutor(@RequestBody AutorRequest request) throws Exception {
        Autor autor = new Autor(request.getNome(), request.getEmail(), request.getDescricao());
        service.salvar(autor);
        AutorResponse autorResponse = new AutorResponse(autor.getNome(), autor.getEmail());
        return ResponseEntity.status(HttpStatus.CREATED).body(autorResponse);
    }

    @GetMapping("/buscar-autor-id")
    public ResponseEntity<AutorResponse> buscarAutorId (@RequestParam Integer id) {
        Optional<Autor> autorOptional = service.buscarAutor(id);
        Autor autor = autorOptional.get();
        AutorResponse autorResponse = new AutorResponse(autor.getNome(), autor.getEmail());
        return ResponseEntity.status(HttpStatus.OK).body(autorResponse);
    }

    @GetMapping("/buscar-autor")
    public ResponseEntity<AutorResponse> buscarAutor (@RequestParam String nome) {
        Autor autor = service.buscarNome(nome);
        AutorResponse autorResponse = new AutorResponse(autor.getNome(), autor.getEmail());
        return ResponseEntity.status(HttpStatus.OK).body(autorResponse);
    }
}
