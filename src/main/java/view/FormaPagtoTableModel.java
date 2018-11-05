package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.FormaPagtoModel;


public class FormaPagtoTableModel extends AbstractTableModel {

    private ArrayList<FormaPagtoModel> linhas;
    String[] colunas = {"ID", "Nome", "Ativo"};

    public FormaPagtoTableModel(ArrayList<FormaPagtoModel> arrayFormaPagto) {
        linhas = arrayFormaPagto;
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
        FormaPagtoModel formapagto = (FormaPagtoModel) linhas.get(row);
        switch (col) {
            case 0:
                return formapagto.getFPG_CODIGO();
            case 1:
                return formapagto.getFPG_NOME();
            case 2:
                return formapagto.getFPG_ATIVO();
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de UsuarioModel
    public void addLista(ArrayList<FormaPagtoModel> formapagtomodel) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(formapagtomodel);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}