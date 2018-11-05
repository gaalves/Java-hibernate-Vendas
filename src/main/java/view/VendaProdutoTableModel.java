package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.VendaProdutoModel;

public class VendaProdutoTableModel extends AbstractTableModel {

    private ArrayList<VendaProdutoModel> linhas;
    String[] colunas = {"ID Produto", "Nome", "Preço", "Quantidade", "Total"};

    public VendaProdutoTableModel(ArrayList<VendaProdutoModel> arrayVendaProduto) {
        linhas = arrayVendaProduto;
    }

    //Retorna a quantidade de colunas do modelo, que no caso será fixa
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    //Retorna a quantidade de linhas atual do objeto, que no caso é o tamnho da lista
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    //Retorna o nome da coluna, recebendo seu índice
    @Override
    public String getColumnName(int indiceColuna) {
        return colunas[indiceColuna];
    }

    @Override
    public Object getValueAt(int row, int col) {
        VendaProdutoModel vendaProduto = (VendaProdutoModel) linhas.get(row);
        switch (col) {
            case 0:
                return vendaProduto.getProdutoModel().getPRO_CODIGO();
            case 1:
                return vendaProduto.getProdutoModel().getPRO_NOME();            
            case 2:
                return vendaProduto.getVEP_PRECO();
            case 3:
                return vendaProduto.getVEP_QTDE();   
            case 4:
                return vendaProduto.getVEP_TOTAL();   
            default:
                return null;
        }
    }/*String[] colunas = {"ID", "Nome", "Estoque", "Unidade", "Preco",
    "Custo", "Atacado", "Min", "Max", "Embalagem", "Peso", "Cadastro", "Obs", "Ativo"};*/

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de UsuarioModel
    public void addLista(ArrayList<VendaProdutoModel> vendaProduto) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(vendaProduto);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}