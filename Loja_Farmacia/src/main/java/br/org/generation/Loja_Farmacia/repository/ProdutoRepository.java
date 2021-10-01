package br.org.generation.Loja_Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.Loja_Farmacia.model.Produto;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List <Produto> findAllByTituloContainingIgnoreCase(String titulo);
	
	

}
