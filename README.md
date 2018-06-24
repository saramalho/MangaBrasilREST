# MangaBrasilREST
Desenvolvimento de API Rest para Mangás, com uso de Java Spring Boot.

- Crie um banco mysql com scheme chamado 'manga';
- Importe o projeto como 'Existing Maven Project';
- Abra o projeto MangasBrasil;
- Abra classe com.mangas.DataConfiguration.java
  Edite a senha do banco mysql para a que você utiliza
- Clique com botao direito com a class com.mangas.MangasBrasilApplication.java e execute Run As > Java Application
- Abra o PostMan e insira o http://localhost:8080/manga

Exemplos de inserções PostMan como  raw, JSON (application/json)  

{
	"titulo":"Arakawa Under the Bridge",
	"autor":{
		"nome":"Hikaru Nakamura"
	}
}

{
	"titulo":"One Piece",
	"autor":{
		"nome":"Eiichiro Oda"
	}
}

