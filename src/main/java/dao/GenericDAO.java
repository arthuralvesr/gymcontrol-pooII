package dao;

import jakarta.persistence.criteria.CriteriaQuery;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class GenericDAO {

    public void inserir(Object objeto) throws HibernateException {
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getFactory().openSession();
            sessao.beginTransaction();
            sessao.persist(objeto);
            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
    }

    public void alterar(Object objeto) throws HibernateException {
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getFactory().openSession();
            sessao.beginTransaction();
            sessao.merge(objeto);
            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
    }

    public void excluir(Object objeto) throws HibernateException {
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getFactory().openSession();
            sessao.beginTransaction();
            sessao.remove(sessao.contains(objeto) ? objeto : sessao.merge(objeto));
            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }
    }

    public void deletar(Object objeto) throws HibernateException {
        excluir(objeto);
    }

    public List listar(Class classe) throws HibernateException {
        List lista = null;
        Session sessao = null;

        try {
            sessao = ConexaoHibernate.getFactory().openSession();
            sessao.beginTransaction();

            CriteriaQuery consulta = sessao.getCriteriaBuilder().createQuery(classe);
            consulta.from(classe);
            lista = sessao.createQuery(consulta).getResultList();

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }

        return lista;
    }

    public Object get(Class classe, int id) throws HibernateException {
        Session sessao = null;
        Object objReturn = null;

        try {
            sessao = ConexaoHibernate.getFactory().openSession();
            sessao.getTransaction().begin();

            objReturn = sessao.get(classe, id);

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(ex);
        }

        return objReturn;
    }
}
