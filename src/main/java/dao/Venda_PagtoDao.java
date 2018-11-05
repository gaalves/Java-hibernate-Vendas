package dao;

import java.util.ArrayList;
import model.Venda_PagtoModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class Venda_PagtoDao implements GenericDao<Venda_PagtoModel> {

    @Override
    public void incluir(Venda_PagtoModel venda_pagto) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(venda_pagto);
        t.commit();
        session.close();
    }

    @Override
    public void alterar(Venda_PagtoModel venda_pagto) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(venda_pagto);
        t.commit();
        session.close();
    }

    @Override
    public ArrayList<Venda_PagtoModel> consultar(String filtro) {
        String sql = "from " + Venda_PagtoModel.class.getName() + filtro;

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        ArrayList lista = (ArrayList<Venda_PagtoModel>) session.createQuery(sql).list();
        t.commit();
        session.close();
        return lista;
    }

    @Override
    public void excluir(Venda_PagtoModel venda_pagto) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(venda_pagto);
        t.commit();
        session.close();
    }

    @Override
    public Venda_PagtoModel get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Venda_PagtoModel) session.load(Venda_PagtoModel.class, id);
    }
}
