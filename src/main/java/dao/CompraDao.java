package dao;

import java.util.ArrayList;
import model.CompraModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class CompraDao implements GenericDao<CompraModel> {

    @Override
    public void incluir(CompraModel compra) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(compra);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(CompraModel compra) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(compra);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<CompraModel> consultar(String filtro) {
        String sql = "from " + CompraModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<CompraModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(CompraModel compra) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(compra);
        t.commit();
        session.close();
    }

    @Override
    public CompraModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (CompraModel) session.load(CompraModel.class, id);
    }
}
