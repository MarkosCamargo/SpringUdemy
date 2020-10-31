package br.com.mcamargo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mcamargo.cursomc.domain.Categoria;
import br.com.mcamargo.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> oCat = this.repo.findById(id);
		return oCat.orElse(null);
	}

}
