package controller;

import dao.Compra_ProdutoDao;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Compra_ProdutoModel;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import util.ReportUtils;

public class Compra_ProdutoController implements GenericController<Compra_ProdutoModel> {

    Compra_ProdutoDao compra_produtodao;

    public Compra_ProdutoController() {
        compra_produtodao = new Compra_ProdutoDao();
    }

    @Override
    public void incluir(Compra_ProdutoModel obj) throws Exception{
        compra_produtodao.incluir(obj);
    }

    @Override
    public void alterar(Compra_ProdutoModel obj) throws Exception{
        compra_produtodao.alterar(obj);
    }

    @Override
    public void excluir(Compra_ProdutoModel obj) throws Exception{
        compra_produtodao.excluir(obj);
    }

    @Override
    public ArrayList<Compra_ProdutoModel> consultar(String filtro) {
        return compra_produtodao.consultar(filtro);
    }

    @Override
    public void gravar(Compra_ProdutoModel obj, String operacao) throws Exception{
        if (operacao.equals("incluir")) {
            incluir(obj);
        } else {
            alterar(obj);
        }
    }

    @Override
    public Exception imprimir() {
        Exception retorno = null;
        InputStream inputStream = getClass().getResourceAsStream("/relatorios/RelatorioCompra.jasper");
//        btnPRIMEIRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/primeiro.png"))); // NOI18N

        Map parametros = new HashMap();
        
        List dados = consultar("");
        
        // criando o datasource com os dados criados
        JRDataSource ds = new JRBeanCollectionDataSource(dados);

        try {
            // passando o datasource para o método de criação e exibição do relatório
            ReportUtils.openReport("Compras - Bean Collection Data Source", inputStream, parametros, ds);

        } catch (Exception ex) {
            retorno =  ex;
        }
        return retorno;
    }
}
