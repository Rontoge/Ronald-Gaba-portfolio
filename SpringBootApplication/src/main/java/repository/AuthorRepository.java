package repository;
import model.Author;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author ,Integer> {

    Author findOneAuthorByName(String name);
}
