package br.com.mcamargo.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mcamargo.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
			Categoria oCat1 = new Categoria(1, "Informática");
			Categoria oCat2 = new Categoria(2, "Escritório");
			List<Categoria> oList = new ArrayList<>();
			oList.add(oCat1);
			oList.add(oCat2);
			return oList;
		}
	}
