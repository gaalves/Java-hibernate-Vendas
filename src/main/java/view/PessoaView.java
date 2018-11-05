package view;

import controller.ClienteController;
import controller.PessoaController;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.ClienteModel;
import model.PessoaModel;
import model.FornecedorModel;
import controller.ClienteController;
import controller.FornecedorController;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PessoaView extends javax.swing.JFrame {

    private String operacao;
    private ArrayList<ClienteModel> arrayCliente;
    private ArrayList<FornecedorModel> arrayFornecedor;
    private ArrayList<PessoaModel> arrayPessoa;
    
    private ClienteController clienteController;
    private FornecedorController fornecedorController;
    
    
    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {
        Boolean ativar = (operacao.equals("") ? false : true);
        // operacao=""(consulta), operacao="incluir"(inclusão), operacao="alterar"(alteração)
        this.operacao = operacao;
        btnGRAVAR.setEnabled(ativar);
        btnGRAVAR.setEnabled(ativar);
    }

    public PessoaView() {
        
        ClienteController clientecontroller = new ClienteController();
        this.setPreferredSize(new Dimension(750, 650));
        
        setVisible(true);
        initComponents();
        setOperacao(""); // inicializa o form no modo CONSULTA
        
        consultar();
        // adiciona evento para que qdo navegar no JTable, atualize o registro nos JTextField´s
        tblCliente.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (evt.getValueIsAdjusting()) {
                    return;
                }
                int selecionado = tblCliente.getSelectedRow();
                if (selecionado >= 0) {
                    mostrar(arrayCliente.get(selecionado));
                }
            }
        });
        tblFornecedor.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (evt.getValueIsAdjusting()) {
                    return;
                }
                int selecionado = tblFornecedor.getSelectedRow();
                if (selecionado >= 0) {
                    mostrarFOR(arrayFornecedor.get(selecionado));
                }
            }
        });
        //edtCLI_CODIGO.setVisible(false);
        //edtFOR_CODIGO.setVisible(false);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnPRIMEIRO = new javax.swing.JButton();
        btnANTERIOR = new javax.swing.JButton();
        btnPROXIMO = new javax.swing.JButton();
        btnULTIMO = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnINCLUIR = new javax.swing.JButton();
        btnALTERAR = new javax.swing.JButton();
        btnEXCLUIR = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnGRAVAR = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnIMPRIMIR = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnSAIR = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        edtPES_NOME = new javax.swing.JTextField();
        edtPES_FANTASIA = new javax.swing.JTextField();
        edtPES_CPFCNPJ = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edtPES_RGIE = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        edtPES_BAIRRO = new javax.swing.JTextField();
        edtPES_UF = new javax.swing.JTextField();
        edtPES_CELULAR = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        edtPES_ENDERECO = new javax.swing.JTextField();
        edtPES_COMPLEMENTO = new javax.swing.JTextField();
        edtPES_CEP = new javax.swing.JTextField();
        edtPES_EMAIL = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        edtPES_NUMERO = new javax.swing.JTextField();
        edtPES_CIDADE = new javax.swing.JTextField();
        edtPES_FONE1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        edtPES_FONE2 = new javax.swing.JTextField();
        edtPES_SITE = new javax.swing.JTextField();
        cbPES_FISICA = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        edtCLI_LIMITECRED = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        edtFOR_CONTATO = new javax.swing.JTextField();
        cbPES_ATIVO = new javax.swing.JCheckBox();
        edtCLI_CODIGO = new javax.swing.JTextField();
        btnLimpar4 = new javax.swing.JButton();
        edtFOR_CODIGO = new javax.swing.JTextField();
        edtPES_CODIGO = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblCONS_ID = new javax.swing.JLabel();
        edtCONS_ID1 = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        edtCONS_ID2 = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblCONS_NOME = new javax.swing.JLabel();
        edtCONS_NOME = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblCONS_ID4 = new javax.swing.JLabel();
        edtCONS_ID_FOR = new javax.swing.JTextField();
        lblCodigo6 = new javax.swing.JLabel();
        edtCONS_ID2_FOR = new javax.swing.JTextField();
        btnConsulta_FOR = new javax.swing.JButton();
        btnLimpar_FOR = new javax.swing.JButton();
        lblCONS_NOME4 = new javax.swing.JLabel();
        edtCONS_NOME_FOR = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFornecedor = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MVC - Cadastro de Usuários");
        setFocusable(false);
        getContentPane().setLayout(null);

        jToolBar1.setRollover(true);

        btnPRIMEIRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/primeiro.png"))); // NOI18N
        btnPRIMEIRO.setText("Primeiro");
        btnPRIMEIRO.setFocusable(false);
        btnPRIMEIRO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPRIMEIRO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPRIMEIRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPRIMEIROActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPRIMEIRO);

        btnANTERIOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/anterior.png"))); // NOI18N
        btnANTERIOR.setText("Anterior");
        btnANTERIOR.setFocusable(false);
        btnANTERIOR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnANTERIOR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnANTERIOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnANTERIORActionPerformed(evt);
            }
        });
        jToolBar1.add(btnANTERIOR);

        btnPROXIMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/proximo.png"))); // NOI18N
        btnPROXIMO.setText("Próximo");
        btnPROXIMO.setFocusable(false);
        btnPROXIMO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPROXIMO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPROXIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPROXIMOActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPROXIMO);

        btnULTIMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ultimo.png"))); // NOI18N
        btnULTIMO.setText("Último");
        btnULTIMO.setFocusable(false);
        btnULTIMO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnULTIMO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnULTIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnULTIMOActionPerformed(evt);
            }
        });
        jToolBar1.add(btnULTIMO);

        jSeparator1.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator1);

        btnINCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
        btnINCLUIR.setText("Novo");
        btnINCLUIR.setFocusable(false);
        btnINCLUIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnINCLUIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnINCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINCLUIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnINCLUIR);

        btnALTERAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        btnALTERAR.setText("Alterar");
        btnALTERAR.setFocusable(false);
        btnALTERAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnALTERAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTERARActionPerformed(evt);
            }
        });
        jToolBar1.add(btnALTERAR);

        btnEXCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        btnEXCLUIR.setText("Excluir");
        btnEXCLUIR.setFocusable(false);
        btnEXCLUIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEXCLUIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXCLUIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEXCLUIR);

        jSeparator2.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator2);

        btnGRAVAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        btnGRAVAR.setText("Gravar");
        btnGRAVAR.setFocusable(false);
        btnGRAVAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGRAVAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGRAVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGRAVARActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGRAVAR);

        jSeparator3.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator3);

        btnIMPRIMIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imprimir.png"))); // NOI18N
        btnIMPRIMIR.setText("Imprimir");
        btnIMPRIMIR.setFocusable(false);
        btnIMPRIMIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIMPRIMIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIMPRIMIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMPRIMIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnIMPRIMIR);

        jSeparator4.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator4);

        btnSAIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnSAIR.setText("Sair");
        btnSAIR.setFocusable(false);
        btnSAIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSAIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSAIR);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 730, 71);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Cadastro de Pessoa com DAO/MVC/Hibernate");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(60, 80, 590, 29);

        edtPES_FANTASIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_FANTASIAActionPerformed(evt);
            }
        });

        edtPES_CPFCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_CPFCNPJActionPerformed(evt);
            }
        });

        jLabel2.setText("Fantasia");

        jLabel3.setText("Nome");

        jLabel4.setText("CPF/CNPJ");

        jLabel5.setText("RG/IE");

        edtPES_RGIE.setText("1");
        edtPES_RGIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_RGIEActionPerformed(evt);
            }
        });

        jLabel7.setText("Bairro");

        jLabel8.setText("UF");

        jLabel9.setText("Celular");

        edtPES_BAIRRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_BAIRROActionPerformed(evt);
            }
        });

        edtPES_UF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_UFActionPerformed(evt);
            }
        });

        edtPES_CELULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_CELULARActionPerformed(evt);
            }
        });

        jLabel10.setText("Endereço");

        jLabel11.setText("Complemento");

        jLabel12.setText("CEP");

        jLabel13.setText("Email");

        edtPES_ENDERECO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_ENDERECOActionPerformed(evt);
            }
        });

        edtPES_COMPLEMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_COMPLEMENTOActionPerformed(evt);
            }
        });

        edtPES_CEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_CEPActionPerformed(evt);
            }
        });

        edtPES_EMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_EMAILActionPerformed(evt);
            }
        });

        jLabel14.setText("Site");

        jLabel15.setText("Fone");

        jLabel16.setText("Cidade");

        jLabel17.setText("Número");

        edtPES_NUMERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_NUMEROActionPerformed(evt);
            }
        });

        edtPES_CIDADE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_CIDADEActionPerformed(evt);
            }
        });

        edtPES_FONE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_FONE1ActionPerformed(evt);
            }
        });

        jLabel18.setText("Fone");

        edtPES_FONE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_FONE2ActionPerformed(evt);
            }
        });

        edtPES_SITE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_SITEActionPerformed(evt);
            }
        });

        cbPES_FISICA.setText("Física?");

        jLabel19.setText("Limite Crédito");

        edtCLI_LIMITECRED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCLI_LIMITECREDActionPerformed(evt);
            }
        });

        jLabel20.setText("Fornecedor Contato");

        edtFOR_CONTATO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtFOR_CONTATOActionPerformed(evt);
            }
        });

        cbPES_ATIVO.setText("Ativo?");

        edtCLI_CODIGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCLI_CODIGOActionPerformed(evt);
            }
        });

        btnLimpar4.setText("Limpa");
        btnLimpar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar4ActionPerformed(evt);
            }
        });

        edtPES_CODIGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_CODIGOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(edtPES_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbPES_FISICA)
                        .addGap(18, 18, 18)
                        .addComponent(cbPES_ATIVO)
                        .addGap(18, 18, 18)
                        .addComponent(edtCLI_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edtFOR_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnLimpar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(edtPES_FANTASIA, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(edtPES_CPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(edtPES_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(edtPES_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(edtPES_RGIE, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edtPES_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(edtPES_COMPLEMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(edtPES_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edtCLI_LIMITECRED, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(edtFOR_CONTATO, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(edtPES_CELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel13)
                                    .addGap(18, 18, 18)
                                    .addComponent(edtPES_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)
                                    .addComponent(edtPES_SITE, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(edtPES_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(edtPES_UF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(edtPES_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel15)
                                    .addGap(18, 18, 18)
                                    .addComponent(edtPES_FONE1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel18)
                                    .addGap(18, 18, 18)
                                    .addComponent(edtPES_FONE2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtPES_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbPES_FISICA)
                    .addComponent(cbPES_ATIVO)
                    .addComponent(edtCLI_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar4)
                    .addComponent(edtFOR_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtPES_FANTASIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(edtPES_CPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(edtPES_RGIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(edtPES_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(edtPES_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(edtPES_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(edtPES_COMPLEMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(edtPES_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(edtPES_FONE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(edtPES_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(edtPES_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(edtPES_FONE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(edtPES_CELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(edtPES_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(edtPES_SITE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(edtPES_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(edtCLI_LIMITECRED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(edtFOR_CONTATO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados da Pessoa", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCONS_ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_ID.setText("ID");

        edtCONS_ID1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCodigo2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo2.setText("à");

        edtCONS_ID2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpa");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblCONS_NOME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_NOME.setText("Nome");

        edtCONS_NOME.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        edtCONS_NOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCONS_NOMEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblCONS_NOME)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_NOME))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblCONS_ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodigo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCONS_ID)
                    .addComponent(edtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo2)
                    .addComponent(edtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCONS_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_NOME)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(tblCliente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar Cliente", jPanel2);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCONS_ID4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_ID4.setText("ID");

        edtCONS_ID_FOR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCodigo6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo6.setText("à");

        edtCONS_ID2_FOR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnConsulta_FOR.setText("Consulta");
        btnConsulta_FOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulta_FORActionPerformed(evt);
            }
        });

        btnLimpar_FOR.setText("Limpa");
        btnLimpar_FOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar_FORActionPerformed(evt);
            }
        });

        lblCONS_NOME4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_NOME4.setText("Nome");

        edtCONS_NOME_FOR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        edtCONS_NOME_FOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCONS_NOME_FORActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblCONS_NOME4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_NOME_FOR))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblCONS_ID4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_ID_FOR, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCodigo6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCONS_ID2_FOR, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(77, 77, 77)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsulta_FOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar_FOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCONS_ID4)
                    .addComponent(edtCONS_ID_FOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo6)
                    .addComponent(edtCONS_ID2_FOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta_FOR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtCONS_NOME_FOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCONS_NOME4)
                    .addComponent(btnLimpar_FOR))
                .addContainerGap())
        );

        jScrollPane3.setViewportView(tblFornecedor);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar Fornecedor", jPanel7);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 110, 710, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPRIMEIROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRIMEIROActionPerformed
        if (arrayCliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Clientes Cadastrados !");
        } else {
            int selecionado = 0;
            tblCliente.changeSelection(selecionado, 0, false, false);
        }
    }//GEN-LAST:event_btnPRIMEIROActionPerformed

    private void btnINCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINCLUIRActionPerformed
        limpar();
        setOperacao("incluir");
        //edtCLI_LIMITECRED.setFocusable(true);
    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        String mensagem;
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação desta Pessoa ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {         
            
            if(cbPES_FISICA.isSelected()){                  
                    
                    ClienteController clientecontroller = new ClienteController();
                    PessoaController pessoacontroller = new PessoaController();
                    PessoaModel pessoa = new PessoaModel();
                    ClienteModel cliente = new ClienteModel();
                    
                   // 
                    if(edtCLI_LIMITECRED.getText().isEmpty()){
                        
                    }else{
                        cliente.setCLI_LIMITECRED(Double.parseDouble(edtCLI_LIMITECRED.getText()));
                    }
                    if(edtCLI_CODIGO.getText().isEmpty()){
                        
                    }else{
                        cliente.setCLI_CODIGO(Integer.parseInt(edtCLI_CODIGO.getText()));
                    }
                    pessoa.setPES_NOME(edtPES_NOME.getText());
                    pessoa.setPES_FANTASIA(edtPES_FANTASIA.getText());
                    pessoa.setPES_FISICA((cbPES_FISICA.isSelected() ? 'S' : 'N'));
                    pessoa.setPES_CPFCNPJ(edtPES_CPFCNPJ.getText());
                    pessoa.setPES_RGIE(edtPES_RGIE.getText());                   
                    pessoa.setPES_ENDERECO(edtPES_ENDERECO.getText());
                    pessoa.setPES_NUMERO(edtPES_NUMERO.getText());
                    pessoa.setPES_COMPLEMENTO(edtPES_COMPLEMENTO.getText());               
                    pessoa.setPES_BAIRRO(edtPES_BAIRRO.getText());
                    pessoa.setPES_CIDADE(edtPES_CIDADE.getText());
                    pessoa.setPES_UF(edtPES_UF.getText());
                    pessoa.setPES_CEP(edtPES_CEP.getText());
                    pessoa.setPES_FONE1(edtPES_FONE1.getText());
                    pessoa.setPES_FONE2(edtPES_FONE2.getText());
                    pessoa.setPES_CELULAR(edtPES_CELULAR.getText());
                    pessoa.setPES_SITE(edtPES_SITE.getText());
                    pessoa.setPES_EMAIL(edtPES_EMAIL.getText());
                    pessoa.setPES_ATIVO((cbPES_ATIVO.isSelected() ? 'S' : 'N'));                    
                    cliente.setPessoamodel(pessoa);

                try {
                    //pessoacontroller.gravar(pessoa, "incluir");
                    clientecontroller.gravar(cliente, getOperacao());
                    mensagem = "Dados Gravados com Sucesso";
                } catch (Exception ex) {
                    mensagem = "Erro na Gravação do Cliente \n" + ex.getMessage();
                }
                
            }else{                
                    FornecedorController fornecedorcontroller = new FornecedorController();
                    PessoaController pessoacontroller = new PessoaController();
                    PessoaModel pessoa = new PessoaModel();
                    FornecedorModel fornecedor = new FornecedorModel();
                    if(edtFOR_CODIGO.getText().isEmpty()){
                        
                    }else{
                        fornecedor.setFOR_CODIGO(Integer.parseInt(edtFOR_CODIGO.getText()));
                    }
                    if(edtFOR_CONTATO.getText().isEmpty()){
                        
                    }else{
                        fornecedor.setFOR_CONTATO(edtFOR_CONTATO.getText());
                    }
                    
                    pessoa.setPES_NOME(edtPES_NOME.getText());
                    pessoa.setPES_FANTASIA(edtPES_FANTASIA.getText());
                    pessoa.setPES_FISICA((cbPES_FISICA.isSelected() ? 'S' : 'N'));
                    pessoa.setPES_CPFCNPJ(edtPES_CPFCNPJ.getText());
                    pessoa.setPES_RGIE(edtPES_RGIE.getText());                
                    pessoa.setPES_ENDERECO(edtPES_ENDERECO.getText());
                    pessoa.setPES_NUMERO(edtPES_NUMERO.getText());
                    pessoa.setPES_COMPLEMENTO(edtPES_COMPLEMENTO.getText());               
                    pessoa.setPES_BAIRRO(edtPES_BAIRRO.getText());
                    pessoa.setPES_CIDADE(edtPES_CIDADE.getText());
                    pessoa.setPES_UF(edtPES_UF.getText());
                    pessoa.setPES_CEP(edtPES_CEP.getText());
                    pessoa.setPES_FONE1(edtPES_FONE1.getText());
                    pessoa.setPES_FONE2(edtPES_FONE2.getText());
                    pessoa.setPES_CELULAR(edtPES_CELULAR.getText());
                    pessoa.setPES_SITE(edtPES_SITE.getText());
                    pessoa.setPES_EMAIL(edtPES_EMAIL.getText());
                    pessoa.setPES_ATIVO((cbPES_ATIVO.isSelected() ? 'S' : 'N'));                 
                    fornecedor.setPessoamodel(pessoa);
                    JOptionPane.showMessageDialog(null, getOperacao());
                try {
                    fornecedorcontroller.gravar(fornecedor, getOperacao());
                    mensagem = "Dados Gravados com Sucesso";
                } catch (Exception ex) {
                    mensagem = "Erro na Gravação do Fornecedor \n" + ex.getMessage();
                }
                
                
            }
            
            JOptionPane.showMessageDialog(null, mensagem);
            consultar();
        }
    }//GEN-LAST:event_btnGRAVARActionPerformed

    private void btnALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARActionPerformed
        setOperacao("alterar");
    }//GEN-LAST:event_btnALTERARActionPerformed

    private void btnSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAIRActionPerformed
        dispose();
    }//GEN-LAST:event_btnSAIRActionPerformed

    private void btnANTERIORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnANTERIORActionPerformed
        int selecionado = tblCliente.getSelectedRow() - 1;
        if (selecionado >= 0) {
            tblCliente.changeSelection(selecionado, 0, false, false);
        }
    }//GEN-LAST:event_btnANTERIORActionPerformed

    private void limpar() {
        edtPES_CODIGO.setText("");
        edtCLI_CODIGO.setText("");
        edtFOR_CODIGO.setText("");
        edtPES_FANTASIA.setText("");
        edtPES_CPFCNPJ.setText("");
        edtPES_ENDERECO.setText("");
        edtPES_RGIE.setText("");
        edtPES_NUMERO.setText("");
        edtPES_COMPLEMENTO.setText("");
        edtPES_BAIRRO.setText("");
        edtPES_CIDADE.setText("");
        edtPES_UF.setText("");
        edtPES_CEP.setText("");
        edtPES_FONE1.setText("");
        edtPES_FONE2.setText("");
        edtPES_CELULAR.setText("");
        edtPES_SITE.setText("");
        edtPES_EMAIL.setText("");      
        cbPES_ATIVO.setText("");
        cbPES_FISICA.setText("");
        edtPES_NOME.setText("");
        edtCLI_LIMITECRED.setText("");
        edtPES_EMAIL.setText("");
        edtFOR_CONTATO.setText("");
        cbPES_FISICA.setSelected(false);
        cbPES_ATIVO.setSelected(false);
        
    }

    private void mostrar(ClienteModel cliente) {
        edtPES_CODIGO.setText(Integer.toString(cliente.getPessoamodel().getPES_CODIGO()));
        edtCLI_CODIGO.setText(Integer.toString(cliente.getCLI_CODIGO()));
        edtPES_FANTASIA.setText(String.valueOf(cliente.getPessoamodel().getPES_FANTASIA()));
        edtPES_CPFCNPJ.setText(cliente.getPessoamodel().getPES_CPFCNPJ());
        edtPES_ENDERECO.setText(cliente.getPessoamodel().getPES_ENDERECO());
        edtPES_RGIE.setText(cliente.getPessoamodel().getPES_RGIE());
        edtPES_NUMERO.setText(cliente.getPessoamodel().getPES_NUMERO());
        edtPES_COMPLEMENTO.setText(cliente.getPessoamodel().getPES_COMPLEMENTO());
        edtPES_BAIRRO.setText(cliente.getPessoamodel().getPES_BAIRRO());
        edtPES_CIDADE.setText(cliente.getPessoamodel().getPES_CIDADE());
        edtPES_UF.setText(cliente.getPessoamodel().getPES_UF());
        edtPES_CEP.setText(cliente.getPessoamodel().getPES_CEP());
        edtPES_FONE1.setText(cliente.getPessoamodel().getPES_FONE1());
        edtPES_FONE2.setText(cliente.getPessoamodel().getPES_FONE2());
        edtPES_CELULAR.setText(cliente.getPessoamodel().getPES_CELULAR());
        edtPES_SITE.setText(cliente.getPessoamodel().getPES_SITE());
        edtPES_EMAIL.setText(cliente.getPessoamodel().getPES_EMAIL());       
        cbPES_ATIVO.setSelected((cliente.getPessoamodel().getPES_ATIVO() == 'S'));
        cbPES_FISICA.setSelected((cliente.getPessoamodel().getPES_FISICA() == 'S'));
        edtPES_NOME.setText(cliente.getPessoamodel().getPES_NOME());
        edtCLI_LIMITECRED.setText(cliente.getCLI_LIMITECRED().toString()); 
        edtPES_EMAIL.setText(cliente.getPessoamodel().getPES_EMAIL()); 
        
        
    }
    
    private void mostrarFOR(FornecedorModel fornecedor) {
        edtPES_CODIGO.setText(Integer.toString(fornecedor.getPessoamodel().getPES_CODIGO()));
        edtFOR_CODIGO.setText(Integer.toString(fornecedor.getFOR_CODIGO()));
        edtPES_FANTASIA.setText(String.valueOf(fornecedor.getPessoamodel().getPES_FANTASIA()));
        edtPES_CPFCNPJ.setText(fornecedor.getPessoamodel().getPES_CPFCNPJ());
        edtPES_ENDERECO.setText(fornecedor.getPessoamodel().getPES_ENDERECO());
        edtPES_RGIE.setText(fornecedor.getPessoamodel().getPES_RGIE());
        edtPES_NUMERO.setText(fornecedor.getPessoamodel().getPES_NUMERO());
        edtPES_COMPLEMENTO.setText(fornecedor.getPessoamodel().getPES_COMPLEMENTO());
        edtPES_BAIRRO.setText(fornecedor.getPessoamodel().getPES_BAIRRO());
        edtPES_CIDADE.setText(fornecedor.getPessoamodel().getPES_CIDADE());
        edtPES_UF.setText(fornecedor.getPessoamodel().getPES_UF());
        edtPES_CEP.setText(fornecedor.getPessoamodel().getPES_CEP());
        edtPES_FONE1.setText(fornecedor.getPessoamodel().getPES_FONE1());
        edtPES_FONE2.setText(fornecedor.getPessoamodel().getPES_FONE2());
        edtPES_CELULAR.setText(fornecedor.getPessoamodel().getPES_CELULAR());
        edtPES_SITE.setText(fornecedor.getPessoamodel().getPES_SITE());
        edtPES_EMAIL.setText(fornecedor.getPessoamodel().getPES_EMAIL());       
        cbPES_ATIVO.setSelected((fornecedor.getPessoamodel().getPES_ATIVO() == 'S'));
        cbPES_FISICA.setSelected((fornecedor.getPessoamodel().getPES_FISICA() == 'S'));
        edtPES_NOME.setText(fornecedor.getPessoamodel().getPES_NOME());
        edtCLI_LIMITECRED.setText(fornecedor.getFOR_CONTATO()); 
        edtPES_EMAIL.setText(fornecedor.getPessoamodel().getPES_EMAIL()); 
        edtFOR_CONTATO.setText(fornecedor.getFOR_CONTATO());
    }

    private String filtrar() {
        String condicao = "";
        if (!edtCONS_ID1.getText().trim().equals("")) {
            condicao += "(cli_codigo >= " + edtCONS_ID1.getText() + ")";
        }
        if (!edtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " and ";
            }
            condicao += "(cli_codigo <= " + edtCONS_ID2.getText() + ")";
        }
        if (!edtCONS_NOME.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " and ";
            }
            condicao += "(pes_nome like ('%" + edtCONS_NOME.getText() + "%'))";
        }
       
        if (!condicao.trim().equals("")) {
            condicao = " where " + condicao;
        }
        return condicao;
    }
    
    private String filtrarFOR() {
        String condicao = "";
        if (!edtCONS_ID1.getText().trim().equals("")) {
            condicao += "(for_codigo >= " + edtCONS_ID_FOR.getText() + ")";
        }
        if (!edtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " and ";
            }
            condicao += "(for_codigo <= " + edtCONS_ID2_FOR.getText() + ")";
        }
        if (!edtCONS_NOME.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " and ";
            }
            condicao += "(pes_nome like ('%" + edtCONS_NOME_FOR.getText() + "%'))";
        }
       
        if (!condicao.trim().equals("")) {
            condicao = " where " + condicao;
        }
        return condicao;
    }
    

    private void consultar() {
        String condicao = filtrar();
        ClienteController clientecontrollerr = new ClienteController();
        //arrayCliente = null;
       
                arrayCliente = clientecontrollerr.consultar(condicao);
            if (arrayCliente.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não Existem Cliente Cadastrados !");
            } else {
                ClienteTableModel mtb = new ClienteTableModel(arrayCliente);
                tblCliente.setModel(mtb);
                tblCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                tblCliente.changeSelection(0, 0, false, false);
                mostrar();
            }
        
        
    }
    private void consultarFOR() {
        String condicao = filtrarFOR();
        FornecedorController fornecedorcontroller = new FornecedorController();
        //arrayCliente = null;
       
                arrayFornecedor = fornecedorcontroller.consultar(condicao);
            if (arrayFornecedor.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não Existem Cliente Cadastrados !");
            } else {
                FornecedorTableModel mtb = new FornecedorTableModel(arrayFornecedor);
                tblFornecedor.setModel(mtb);
                tblFornecedor.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                tblFornecedor.changeSelection(0, 0, false, false);
                mostrarFOR();
            }
        
        
    }
    private void mostrarFOR() {
        
            int selecionado = tblFornecedor.getSelectedRow();
            if (selecionado >= 0) {
                mostrarFOR(arrayFornecedor.get(selecionado));
            }
       
    }
    private void mostrar() {
        
            int selecionado = tblCliente.getSelectedRow();
            if (selecionado >= 0) {
                mostrar(arrayCliente.get(selecionado));
            }
       
    }
    private void btnPROXIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPROXIMOActionPerformed
       int selecionado = tblCliente.getSelectedRow() + 1;
        if (selecionado < arrayCliente.size()) {
            tblCliente.changeSelection(selecionado, 0, false, false);
        }
    }//GEN-LAST:event_btnPROXIMOActionPerformed

    private void btnULTIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnULTIMOActionPerformed
       int selecionado = arrayCliente.size() - 1;
        tblCliente.changeSelection(selecionado, 0, false, false);
    }//GEN-LAST:event_btnULTIMOActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        String mensagem = null;
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão desta Pessoa ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            
            ClienteController clientecontroller = new ClienteController();
            ClienteModel cliente = new ClienteModel();
            FornecedorController fornecedorcontroller = new FornecedorController();
            FornecedorModel fornecedor = new FornecedorModel();
            PessoaController pessoacontroller = new PessoaController();
            PessoaModel pessoa = new PessoaModel();
            
            
                    pessoa.setPES_CODIGO(Integer.parseInt(edtPES_CODIGO.getText()));
                    pessoa.setPES_NOME(edtPES_NOME.getText());
                    pessoa.setPES_FANTASIA(edtPES_FANTASIA.getText());
                    pessoa.setPES_FISICA((cbPES_FISICA.isSelected() ? 'S' : 'N'));
                    pessoa.setPES_CPFCNPJ(edtPES_CPFCNPJ.getText());
                    pessoa.setPES_RGIE(edtPES_RGIE.getText());                   
                    pessoa.setPES_ENDERECO(edtPES_ENDERECO.getText());
                    pessoa.setPES_NUMERO(edtPES_NUMERO.getText());
                    pessoa.setPES_COMPLEMENTO(edtPES_COMPLEMENTO.getText());               
                    pessoa.setPES_BAIRRO(edtPES_BAIRRO.getText());
                    pessoa.setPES_CIDADE(edtPES_CIDADE.getText());
                    pessoa.setPES_UF(edtPES_UF.getText());
                    pessoa.setPES_CEP(edtPES_CEP.getText());
                    pessoa.setPES_FONE1(edtPES_FONE1.getText());
                    pessoa.setPES_FONE2(edtPES_FONE2.getText());
                    pessoa.setPES_CELULAR(edtPES_CELULAR.getText());
                    pessoa.setPES_SITE(edtPES_SITE.getText());
                    pessoa.setPES_EMAIL(edtPES_EMAIL.getText());
                    pessoa.setPES_ATIVO((cbPES_ATIVO.isSelected() ? 'S' : 'N'));                    
                    cliente.setPessoamodel(pessoa);
                    fornecedor.setPessoamodel(pessoa);

            if(!edtCLI_CODIGO.getText().isEmpty()){
                cliente.setCLI_CODIGO(Integer.parseInt(edtCLI_CODIGO.getText()));
                cliente.setCLI_LIMITECRED(Double.parseDouble(edtCLI_LIMITECRED.getText()));
                try {
                    mensagem = "Fornecedor Excluído com Sucesso";
                    clientecontroller.excluir(cliente);
                } catch (Exception ex) {
                    mensagem = "Erro na Exclusão do Usuário \n" + ex.getMessage();
                }
            } else {
                fornecedor.setFOR_CODIGO((Integer.parseInt(edtFOR_CODIGO.getText())));
                fornecedor.setFOR_CONTATO(edtFOR_CONTATO.getText());
                try {
                    mensagem = "Fornecedor Excluído com Sucesso";
                    fornecedorcontroller.excluir(fornecedor);
                } catch (Exception ex) {
                    mensagem = "Erro na Exclusão do Usuário \n" + ex.getMessage();
                }
            }
           
            JOptionPane.showMessageDialog(null, mensagem);
            consultar();
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void btnIMPRIMIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMPRIMIRActionPerformed
        Exception retorno = clienteController.imprimir();
        if (retorno != null) {
            JOptionPane.showMessageDialog(null, "Erro no Relatório de Cliente /n" + retorno.getMessage());
        }
    }//GEN-LAST:event_btnIMPRIMIRActionPerformed

    private void edtPES_FANTASIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_FANTASIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_FANTASIAActionPerformed

    private void edtPES_CPFCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_CPFCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_CPFCNPJActionPerformed

    private void edtPES_RGIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_RGIEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_RGIEActionPerformed

    private void edtPES_BAIRROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_BAIRROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_BAIRROActionPerformed

    private void edtPES_UFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_UFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_UFActionPerformed

    private void edtPES_CELULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_CELULARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_CELULARActionPerformed

    private void edtPES_ENDERECOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_ENDERECOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_ENDERECOActionPerformed

    private void edtPES_COMPLEMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_COMPLEMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_COMPLEMENTOActionPerformed

    private void edtPES_CEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_CEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_CEPActionPerformed

    private void edtPES_EMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_EMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_EMAILActionPerformed

    private void edtPES_NUMEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_NUMEROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_NUMEROActionPerformed

    private void edtPES_CIDADEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_CIDADEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_CIDADEActionPerformed

    private void edtPES_FONE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_FONE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_FONE1ActionPerformed

    private void edtPES_FONE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_FONE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_FONE2ActionPerformed

    private void edtPES_SITEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_SITEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_SITEActionPerformed

    private void edtCLI_LIMITECREDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCLI_LIMITECREDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCLI_LIMITECREDActionPerformed

    private void edtFOR_CONTATOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtFOR_CONTATOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtFOR_CONTATOActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void edtCONS_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCONS_NOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCONS_NOMEActionPerformed

    private void btnConsulta_FORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulta_FORActionPerformed
        // TODO add your handling code here:
        consultarFOR();
    }//GEN-LAST:event_btnConsulta_FORActionPerformed

    private void btnLimpar_FORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar_FORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpar_FORActionPerformed

    private void edtCONS_NOME_FORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCONS_NOME_FORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCONS_NOME_FORActionPerformed

    private void btnLimpar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar4ActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimpar4ActionPerformed

    private void edtCLI_CODIGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCLI_CODIGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCLI_CODIGOActionPerformed

    private void edtPES_CODIGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_CODIGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_CODIGOActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALTERAR;
    private javax.swing.JButton btnANTERIOR;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnConsulta_FOR;
    private javax.swing.JButton btnEXCLUIR;
    private javax.swing.JButton btnGRAVAR;
    private javax.swing.JButton btnIMPRIMIR;
    private javax.swing.JButton btnINCLUIR;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimpar4;
    private javax.swing.JButton btnLimpar_FOR;
    private javax.swing.JButton btnPRIMEIRO;
    private javax.swing.JButton btnPROXIMO;
    private javax.swing.JButton btnSAIR;
    private javax.swing.JButton btnULTIMO;
    private javax.swing.JCheckBox cbPES_ATIVO;
    private javax.swing.JCheckBox cbPES_FISICA;
    private javax.swing.JTextField edtCLI_CODIGO;
    private javax.swing.JTextField edtCLI_LIMITECRED;
    private javax.swing.JTextField edtCONS_ID1;
    private javax.swing.JTextField edtCONS_ID2;
    private javax.swing.JTextField edtCONS_ID2_FOR;
    private javax.swing.JTextField edtCONS_ID_FOR;
    private javax.swing.JTextField edtCONS_NOME;
    private javax.swing.JTextField edtCONS_NOME_FOR;
    private javax.swing.JTextField edtFOR_CODIGO;
    private javax.swing.JTextField edtFOR_CONTATO;
    private javax.swing.JTextField edtPES_BAIRRO;
    private javax.swing.JTextField edtPES_CELULAR;
    private javax.swing.JTextField edtPES_CEP;
    private javax.swing.JTextField edtPES_CIDADE;
    private javax.swing.JTextField edtPES_CODIGO;
    private javax.swing.JTextField edtPES_COMPLEMENTO;
    private javax.swing.JTextField edtPES_CPFCNPJ;
    private javax.swing.JTextField edtPES_EMAIL;
    private javax.swing.JTextField edtPES_ENDERECO;
    private javax.swing.JTextField edtPES_FANTASIA;
    private javax.swing.JTextField edtPES_FONE1;
    private javax.swing.JTextField edtPES_FONE2;
    private javax.swing.JTextField edtPES_NOME;
    private javax.swing.JTextField edtPES_NUMERO;
    private javax.swing.JTextField edtPES_RGIE;
    private javax.swing.JTextField edtPES_SITE;
    private javax.swing.JTextField edtPES_UF;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblCONS_ID;
    private javax.swing.JLabel lblCONS_ID4;
    private javax.swing.JLabel lblCONS_NOME;
    private javax.swing.JLabel lblCONS_NOME4;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblCodigo6;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTable tblFornecedor;
    // End of variables declaration//GEN-END:variables
}
