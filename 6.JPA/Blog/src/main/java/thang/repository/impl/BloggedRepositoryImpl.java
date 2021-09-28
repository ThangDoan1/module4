package thang.repository.impl;

import org.springframework.data.jpa.repository.JpaRepository;
import thang.model.Blogged;
import thang.repository.BloggedRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
public class BloggedRepositoryImpl implements BloggedRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Blogged> findAll() {
        TypedQuery<Blogged> query = em.createQuery("select c from Blogged c", Blogged.class);
        return query.getResultList();
    }

    @Override
    public Blogged findById(Integer id) {
        TypedQuery<Blogged> query = em.createQuery("select c from  Blogged c where c.id=:id", Blogged.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void save(Blogged model) {
        if (model.getId() != null){
            em.merge(model);
        }else {
            em.persist(model);
        }
    }

    @Override
    public void deleteById(Integer id) {
        Blogged blog = findById(id);
        if(blog != null){
            em.remove(blog);
        }
    }

}
