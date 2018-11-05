package dao;

import java.io.Serializable;
import java.util.ArrayList;
import model.FornecedorModel;
import model.PessoaModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class PessoaDao implements GenericDao<PessoaModel> {
    
    @Override
    public void incluir(PessoaModel pessoa) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(pessoa);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(PessoaModel pessoa) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(pessoa);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<PessoaModel> consultar(String filtro) {
        String sql = "from " + PessoaModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<PessoaModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(PessoaModel pessoa) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(pessoa);
        t.commit();
        session.close();
    }

    @Override
    public PessoaModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (PessoaModel) session.load(PessoaModel.class, id);
    }
  /*
    public Exception incluir(PessoaModel obj) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction t = session.beginTransaction();
            Serializable ser = session.save(obj);
            t.commit();
            session.close();
            return null;
        } catch (Exception ex) {
            return ex;
            
        }
    }

    public Exception alterar(PessoaModel obj) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction t = session.beginTransaction();
            session.update(obj);
            t.commit();
            session.close();
            return null;
        } catch (Exception ex) {
            return ex;
        }
    }

    public ArrayList<PessoaModel> consultar(String filtro) {
        String sql = "from " + PessoaModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<PessoaModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    public Exception excluir(PessoaModel pessoa) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction t = session.beginTransaction();
            session.delete(pessoa);
            t.commit();
            session.close();
            return null;
        } catch (Exception ex) {
            return ex;
        }
    }

    public PessoaModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (PessoaModel) session.load(PessoaModel.class, id);
    }*/
}
