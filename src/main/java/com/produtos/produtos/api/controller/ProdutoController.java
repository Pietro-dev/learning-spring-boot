package com.produtos.produtos.api.controller;

import com.produtos.produtos.api.model.Produto;
import com.produtos.produtos.api.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;
    }


}
