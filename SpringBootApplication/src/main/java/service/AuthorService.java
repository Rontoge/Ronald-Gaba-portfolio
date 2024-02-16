package service;

import model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AuthorRepository;

import java.util.Set;

@Service
public class AuthorService {

    @Autowired
    public AuthorRepository authorRepository;


    public Author findOneAuthor(int authorId){
        return authorRepository.findById(authorId).orElse(null);

    }

    public Author findOneAuthorByName(String name) {
        return authorRepository.findOneAuthorByName(name);
    }

    public Author save(Author author) {
        return authorRepository.save(author);
    }

    public void deleteAuthorById(int id) {
        authorRepository.deleteById(id);

    }
}
