package br.com.ruana.marina.casadocodigo.controller;

import br.com.ruana.marina.casadocodigo.dto.request.CategoriaRequest;
import br.com.ruana.marina.casadocodigo.dto.response.CategoriaResponse;
import br.com.ruana.marina.casadocodigo.models.Categoria;
import br.com.ruana.marina.casadocodigo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CategoriaController {

    @Autowired
    CategoriaService service;

    @PostMapping("/categoria")
    public ResponseEntity<?> novaCategoria (@RequestBody CategoriaRequest request) throws Exception {
        Categoria categoria = new Categoria(request.getNome());
        service.salvar(categoria);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/buscar-categoria-id")
    public ResponseEntity<CategoriaResponse> buscarCategoriaId (@RequestParam Integer id) {
        Optional<Categoria> categoriaOptional = service.buscarCategoria(id);
        Categoria categoria = categoriaOptional.get();
        CategoriaResponse categoriaResponse = new CategoriaResponse(categoria.getId(), categoria.getNome());
        return ResponseEntity.status(HttpStatus.OK).body(categoriaResponse);
    }

    @GetMapping("/buscar-categoria")
    public ResponseEntity<CategoriaResponse> buscarCategoria (@RequestParam String nome) {
        Categoria categoria = service.buscarNomeCategoria(nome);
        CategoriaResponse categoriaResponse = new CategoriaResponse(categoria.getId(), categoria.getNome());
        return ResponseEntity.status(HttpStatus.OK).body(categoriaResponse);
    }
}
