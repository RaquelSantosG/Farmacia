package br.org.generation.Loja_Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.Loja_Farmacia.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List <Categoria> findAllByNomeContainingIgnoreCase(String nome);
	

}
