package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.ClienteModel;

public class ClienteTableModel extends AbstractTableModel {

    private ArrayList<ClienteModel> linhas;
    String[] colunas = {"Nome", "Fantasia", "Fisica?", "CPF/CNPJ", "RG/IE",
    "Data Cadastro", "Endereço", "Numero", "Complemento", "Bairro",
    "Cidade", "UF", "CEP", "Fone 1", "Fone 2", "Celular", "Site", "Email", "Ativo?", "Crédito"};

    public ClienteTableModel(ArrayList<ClienteModel> arrayCliente) {
        linhas = arrayCliente;
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
        ClienteModel cliente = (ClienteModel) linhas.get(row);
        switch (col) {
            case 0:
                return cliente.getPessoamodel().getPES_NOME();
            case 1:
                return cliente.getPessoamodel().getPES_FANTASIA();
            case 2:
                return cliente.getPessoamodel().getPES_FISICA();
            case 3:
                return cliente.getPessoamodel().getPES_CPFCNPJ();
            case 4:
                return cliente.getPessoamodel().getPES_RGIE();
            case 5: 
                return cliente.getPessoamodel().getPES_CADASTRO();
            case 6: 
                return cliente.getPessoamodel().getPES_ENDERECO();
            case 7: 
                return cliente.getPessoamodel().getPES_NUMERO();
            case 8: 
                return cliente.getPessoamodel().getPES_COMPLEMENTO();
            case 9: 
                return cliente.getPessoamodel().getPES_BAIRRO();
            case 10: 
                return cliente.getPessoamodel().getPES_CIDADE();
            case 11: 
                return cliente.getPessoamodel().getPES_UF();
            case 12: 
                return cliente.getPessoamodel().getPES_CEP();
            case 13: 
                return cliente.getPessoamodel().getPES_FONE1();
            case 14: 
                return cliente.getPessoamodel().getPES_FONE2();
            case 15: 
                return cliente.getPessoamodel().getPES_CELULAR();
            case 16: 
                return cliente.getPessoamodel().getPES_SITE();
            case 17: 
                return cliente.getPessoamodel().getPES_EMAIL();
            case 18: 
                return cliente.getPessoamodel().getPES_ATIVO();
            case 19: 
                return cliente.getCLI_LIMITECRED();
            
            default: 
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de UsuarioModel
    public void addLista(ArrayList<ClienteModel> cliente) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(cliente);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}