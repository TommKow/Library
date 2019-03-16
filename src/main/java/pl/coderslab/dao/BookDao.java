package pl.coderslab.dao;

import org.springframework.stereotype.Repository;
import pl.coderslab.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class BookDao {
    @PersistenceContext
    EntityManager entityManager;

    public void saveBook(Book entity) {
        entityManager.persist(entity);
    }
    public void editBook(Book entity) {
        entityManager.merge(entity);
    }
    public Book findById(long id) {
        return entityManager.find(Book.class, id);
    }
    public void delete(Book entity) {
        entityManager.remove(entityManager.contains(entity)?entity : entityManager.merge(entity));
    }
}
