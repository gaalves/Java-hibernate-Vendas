package controller;

import dao.Venda_ProdutoDao;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Venda_ProdutoModel;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import util.ReportUtils;

public class Venda_ProdutoController implements GenericController<Venda_ProdutoModel> {

    Venda_ProdutoDao vendaprodutodao;

    public Venda_ProdutoController() {
        vendaprodutodao = new Venda_ProdutoDao();
    }

    @Override
    public void incluir(Venda_ProdutoModel obj) throws Exception{
        vendaprodutodao.incluir(obj);
    }

    @Override
    public void alterar(Venda_ProdutoModel obj) throws Exception{
        vendaprodutodao.alterar(obj);
    }

    @Override
    public void excluir(Venda_ProdutoModel obj) throws Exception{
        vendaprodutodao.excluir(obj);
    }

    @Override
    public ArrayList<Venda_ProdutoModel> consultar(String filtro) {
        return vendaprodutodao.consultar(filtro);
    }

    @Override
    public void gravar(Venda_ProdutoModel obj, String operacao) throws Exception{
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
