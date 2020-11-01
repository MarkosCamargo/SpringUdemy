package br.com.mcamargo.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.mcamargo.cursomc.domain.Categoria;
import br.com.mcamargo.cursomc.domain.Produto;
import br.com.mcamargo.cursomc.repositories.CategoriaRepository;
import br.com.mcamargo.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository catRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria oCat1 = new Categoria(null, "Informática");
		Categoria oCat2 = new Categoria(null, "Escritório");
		
		Produto oProd1 = new Produto(null, "Computador", 2000.00);
		Produto oProd2 = new Produto(null, "Impressora", 800.00);
		Produto oProd3 = new Produto(null, "Mouse", 75.00);
		
		oProd1.addCategoria(oCat1);
		oProd2.addCategoria(oCat1);
		oProd3.addCategoria(oCat1);
		
		oProd2.addCategoria(oCat2);

		this.catRepo.saveAll(Arrays.asList(oCat1, oCat2));

	}

}
