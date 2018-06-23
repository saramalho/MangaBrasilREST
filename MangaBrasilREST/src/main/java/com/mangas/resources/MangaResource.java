package com.mangas.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mangas.models.Manga;
import com.mangas.repository.MangaRepository;

@RestController
@RequestMapping("/manga")
public class MangaResource {
	
	@Autowired
	private MangaRepository mr;
	
	@GetMapping(produces="application/json")
	public Iterable<Manga> listaMangas() {
		Iterable<Manga> listaMangas= mr.findAll();
		return listaMangas;
	}
	
	@PostMapping()
	public Manga cadastraManga(@RequestBody @Valid Manga manga) {
		return mr.save(manga);
	}
	
	
	@DeleteMapping()
	public Manga removeManga(@RequestBody Manga manga) {
		mr.delete(manga);
		return manga;
	}

}
