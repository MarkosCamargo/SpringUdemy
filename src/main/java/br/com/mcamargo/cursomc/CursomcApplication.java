package br.com.mcamargo.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.mcamargo.cursomc.domain.Categoria;
import br.com.mcamargo.cursomc.repositories.CategoriaRepository;

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
		this.catRepo.saveAll(Arrays.asList(oCat1, oCat2));
	}

}
