package dao;

import java.util.ArrayList;
import model.Venda_ProdutoModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class Venda_ProdutoDao implements GenericDao<Venda_ProdutoModel> {

    @Override
    public void incluir(Venda_ProdutoModel venda_pro) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(venda_pro);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(Venda_ProdutoModel venda_pro) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(venda_pro);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<Venda_ProdutoModel> consultar(String filtro) {
        String sql = "from " + Venda_ProdutoModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<Venda_ProdutoModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(Venda_ProdutoModel venda_pro) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(venda_pro);
        t.commit();
        session.close();
    }

    @Override
    public Venda_ProdutoModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Venda_ProdutoModel) session.load(Venda_ProdutoModel.class, id);
    }
}
