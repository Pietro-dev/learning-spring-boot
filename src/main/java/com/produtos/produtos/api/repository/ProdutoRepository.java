package com.produtos.produtos.api.repository;

import com.produtos.produtos.api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
