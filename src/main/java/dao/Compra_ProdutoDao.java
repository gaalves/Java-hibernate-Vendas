package dao;

import java.util.ArrayList;
import model.Compra_ProdutoModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class Compra_ProdutoDao implements GenericDao<Compra_ProdutoModel> {

    @Override
    public void incluir(Compra_ProdutoModel compra_pro) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(compra_pro);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(Compra_ProdutoModel compra_pro) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(compra_pro);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<Compra_ProdutoModel> consultar(String filtro) {
        String sql = "from " + Compra_ProdutoModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<Compra_ProdutoModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(Compra_ProdutoModel compra_pro) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(compra_pro);
        t.commit();
        session.close();
    }

    @Override
    public Compra_ProdutoModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Compra_ProdutoModel) session.load(Compra_ProdutoModel.class, id);
    }
}
