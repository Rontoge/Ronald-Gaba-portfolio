package service;

import model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {

    @Autowired
    BooksService booksService;


    public Books findOneBook(int id) {
        return booksService.findOneBook(id);
    }

    public Books saveOneBook(Books books) {
        return booksService.saveOneBook(books);
    }

    public Books findOneBookName(String name) {
        return booksService.findOneBookName(name);
    }

    public Books updateOneBook(Books books) {
        return booksService.updateOneBook(books);
    }

    public void deleteOneBookById(int id) {
        booksService.deleteOneBookById(id);
    }
}
