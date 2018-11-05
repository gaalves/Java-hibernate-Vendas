package controller;

import dao.VendaDao;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.VendaModel;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import util.ReportUtils;

public class VendaController implements GenericController<VendaModel> {

    VendaDao vendadao;

    public VendaController() {
        vendadao = new VendaDao();
    }

    @Override
    public void incluir(VendaModel obj) throws Exception{
        vendadao.incluir(obj);
    }

    @Override
    public void alterar(VendaModel obj) throws Exception{
        vendadao.alterar(obj);
    }

    @Override
    public void excluir(VendaModel obj) throws Exception{
        vendadao.excluir(obj);
    }

    @Override
    public ArrayList<VendaModel> consultar(String filtro) {
        return vendadao.consultar(filtro);
    }

    @Override
    public void gravar(VendaModel obj, String operacao) throws Exception{
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
