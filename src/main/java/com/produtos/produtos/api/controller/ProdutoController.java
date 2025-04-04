package com.produtos.produtos.api.controller;

import com.produtos.produtos.api.model.Produto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        return produto;
    }
}
