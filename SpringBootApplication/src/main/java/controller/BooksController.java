package controller;

import model.Author;
import model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.BooksService;

@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    BooksService booksService;

    @GetMapping("/books/{id}")
    public Books findOneBook(@PathVariable("id") int id){
        return booksService.findOneBook(id);
    }
    @GetMapping("/books/name/{name}")
    public Books findOneBookByName(@PathVariable ("name")  String name){
        return booksService.findOneBookName(name);
    }
    @PostMapping("/books")
    public Books saveOneBook(@RequestBody Books books){
        return booksService.saveOneBook(books);

    }
    @PutMapping("/books")
    public  Books updateOneBook(@RequestBody Books books ){
        return booksService.updateOneBook(books);
    }

    @DeleteMapping("/books/{id}")
    public  void deleteOneBookById(@PathVariable ("id") int id){
        booksService.deleteOneBookById(id);

    }

}
