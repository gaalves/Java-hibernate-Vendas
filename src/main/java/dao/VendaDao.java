package dao;

import java.util.ArrayList;
import model.VendaModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class VendaDao implements GenericDao<VendaModel> {

    @Override
    public void incluir(VendaModel venda) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(venda);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(VendaModel venda) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(venda);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<VendaModel> consultar(String filtro) {
        String sql = "from " + VendaModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<VendaModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(VendaModel venda) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(venda);
        t.commit();
        session.close();
    }

    @Override
    public VendaModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (VendaModel) session.load(VendaModel.class, id);
    }
}
