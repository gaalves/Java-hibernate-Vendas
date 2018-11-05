package dao;

import java.util.ArrayList;
import model.FormaPagtoModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class FormaPagtoDao implements GenericDao<FormaPagtoModel> {

    @Override
    public void incluir(FormaPagtoModel forma_pgto) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(forma_pgto);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(FormaPagtoModel forma_pgto) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(forma_pgto);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<FormaPagtoModel> consultar(String filtro) {
        String sql = "from " + FormaPagtoModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<FormaPagtoModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(FormaPagtoModel forma_pgto) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(forma_pgto);
        t.commit();
        session.close();
    }

    @Override
    public FormaPagtoModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (FormaPagtoModel) session.load(FormaPagtoModel.class, id);
    }
}
