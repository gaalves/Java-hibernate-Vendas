package controller;

import dao.Venda_PagtoDao;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Venda_PagtoModel;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import util.ReportUtils;

public class Venda_PagtoController implements GenericController<Venda_PagtoModel> {

    Venda_PagtoDao venda_pagtodao;

    public Venda_PagtoController() {
        venda_pagtodao = new Venda_PagtoDao();
    }

    @Override
    public void incluir(Venda_PagtoModel obj) throws Exception{
        venda_pagtodao.incluir(obj);
    }

    @Override
    public void alterar(Venda_PagtoModel obj) throws Exception{
        venda_pagtodao.alterar(obj);
    }

    @Override
    public void excluir(Venda_PagtoModel obj) throws Exception{
        venda_pagtodao.excluir(obj);
    }

    @Override
    public ArrayList<Venda_PagtoModel> consultar(String filtro) {
        return venda_pagtodao.consultar(filtro);
    }

    @Override
    public void gravar(Venda_PagtoModel obj, String operacao) throws Exception{
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
