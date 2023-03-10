package eu.asgardschmiede.bookstore.Repository;

import eu.asgardschmiede.bookstore.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
}
