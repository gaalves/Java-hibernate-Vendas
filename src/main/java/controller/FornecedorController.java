package controller;

import dao.FornecedorDao;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.FornecedorModel;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import util.ReportUtils;

public class FornecedorController implements GenericController<FornecedorModel> {

    FornecedorDao fornecedordao;

    public FornecedorController() {
        fornecedordao = new FornecedorDao();
    }

    @Override
    public void incluir(FornecedorModel obj) throws Exception{
        fornecedordao.incluir(obj);
    }

    @Override
    public void alterar(FornecedorModel obj) throws Exception{
        fornecedordao.alterar(obj);
    }

    @Override
    public void excluir(FornecedorModel obj) throws Exception{
        fornecedordao.excluir(obj);
    }

    @Override
    public ArrayList<FornecedorModel> consultar(String filtro) {
        return fornecedordao.consultar(filtro);
    }

    @Override
    public void gravar(FornecedorModel obj, String operacao) throws Exception{
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
