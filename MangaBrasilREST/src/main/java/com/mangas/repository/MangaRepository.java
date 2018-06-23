package com.mangas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mangas.models.Manga;

public interface MangaRepository extends JpaRepository<Manga, String> {

	
}
