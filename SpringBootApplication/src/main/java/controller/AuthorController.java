package controller;
import model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.AuthorService;

@RestController
@RequestMapping("/api")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @GetMapping("/author/{id}")
    public Author findOneAuthor(@PathVariable("id") int id){
        return authorService.findOneAuthor(id);
    }
    @GetMapping("/author/name/{name}")
    public Author findOneAuthorByName(@PathVariable("name") String name){
        return authorService.findOneAuthorByName(name);
    }
    @PostMapping("/author")
    public Author createAuthor(@RequestBody Author author){
        return authorService.save(author);
    }
    @PutMapping("/author")
    public Author updateAuthor(@RequestBody Author author){
        return authorService.save(author);
    }

    @DeleteMapping("/author/{id}")
    public void deleteAuthorById(@PathVariable ("id") int id){
      authorService.deleteAuthorById(id);

    }





}
