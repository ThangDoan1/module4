package thang.demo.repository;

import thang.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Integer> {
    Book findByTitle(String title);
}
