package pl.coderslab.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDao {
    @PersistenceContext
    EntityManager entityManager;

    public void saveUser(User entity) {
        entityManager.persist(entity);
    }
    public void editUser(User entity) {
        entityManager.merge(entity);
    }
    public User findById(long id) {
        return entityManager.find(User.class, id);
    }
    public void delete(User entity) {
        entityManager.remove(entityManager.contains(entity)?entity : entityManager.merge(entity));
    }
}

