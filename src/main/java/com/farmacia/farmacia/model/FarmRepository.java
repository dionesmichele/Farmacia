package com.farmacia.farmacia.model;

public class FarmRepository {
	import java.util.List;

	import org.generation.farmacia.model.Categoria;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	@Repository
	public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

		public List<Categoria> findByNomeContainingIgnoreCase(String nome);

}
   