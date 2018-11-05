package view;

import controller.ProdutoController;
import controller.UsuarioController;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.ProdutoModel;
import model.UsuarioModel;

public class ProdutoView extends javax.swing.JFrame {

    private String operacao;
    private ArrayList<ProdutoModel> arrayProduto;
    private ProdutoTableModel mtb;
    private ProdutoController produtoController;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {
        Boolean ativar = (operacao.equals("") ? false : true);
        // operacao=""(consulta), operacao="incluir"(inclusão), operacao="alterar"(alteração)
        this.operacao = operacao;
        btnGRAVAR.setEnabled(ativar);
       
    }

    public ProdutoView() {
        produtoController = new ProdutoController();
        this.setPreferredSize(new Dimension(750, 650));

        initComponents();
        setOperacao(""); // inicializa o form no modo CONSULTA
        setLocationRelativeTo(null);
        consultar();
        // adiciona evento para que qdo navegar no JTable, atualize o registro nos JTextField´s
        tblConsulta.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (evt.getValueIsAdjusting()) {
                    return;
                }
                int selecionado = tblConsulta.getSelectedRow();
                if (selecionado >= 0) {
                    mostrar(arrayProduto.get(selecionado));
                }
            }
        });
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
        lblUSU_ID = new javax.swing.JLabel();
        lblUSU_NOME = new javax.swing.JLabel();
        lblUSU_LOGIN = new javax.swing.JLabel();
        edtPRO_CODIGO = new javax.swing.JTextField();
        edtPRO_NOME = new javax.swing.JTextField();
        edtPRO_ESTOQUE = new javax.swing.JTextField();
        chkPRO_ATIVO = new javax.swing.JCheckBox();
        lblUSU_LOGIN1 = new javax.swing.JLabel();
        edtPRO_UNIDADE = new javax.swing.JTextField();
        lblPRO_PRECO = new javax.swing.JLabel();
        edtPRO_PRECO = new javax.swing.JTextField();
        lblPRO_PRECO1 = new javax.swing.JLabel();
        edtPRO_CUSTO = new javax.swing.JTextField();
        lblPRO_PRECO2 = new javax.swing.JLabel();
        edtPRO_ATACADO = new javax.swing.JTextField();
        lblPRO_PRECO3 = new javax.swing.JLabel();
        edtPRO_MIN = new javax.swing.JTextField();
        lblPRO_PRECO4 = new javax.swing.JLabel();
        edtPRO_MAX = new javax.swing.JTextField();
        lblPRO_PRECO5 = new javax.swing.JLabel();
        edtPRO_EMBALAGEM = new javax.swing.JTextField();
        lblPRO_PRECO6 = new javax.swing.JLabel();
        edtPRO_PESO = new javax.swing.JTextField();
        lblPRO_PRECO8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        edtPRO_OBS = new javax.swing.JTextPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
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
        tblConsulta = new javax.swing.JTable();

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
        lblTitulo.setText("Cadastro de Usuários com DAO/MVC/Hibernate");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(60, 80, 590, 29);

        lblUSU_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_ID.setText("ID");

        lblUSU_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_NOME.setText("Nome");

        lblUSU_LOGIN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN.setText("Estoque");

        edtPRO_CODIGO.setEditable(false);
        edtPRO_CODIGO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        edtPRO_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtPRO_NOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPRO_NOMEActionPerformed(evt);
            }
        });

        edtPRO_ESTOQUE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        chkPRO_ATIVO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkPRO_ATIVO.setText("ATIVO?");

        lblUSU_LOGIN1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUSU_LOGIN1.setText("Unidade");

        edtPRO_UNIDADE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPRO_PRECO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPRO_PRECO.setText("Preço");

        edtPRO_PRECO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPRO_PRECO1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPRO_PRECO1.setText("Custo");

        edtPRO_CUSTO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPRO_PRECO2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPRO_PRECO2.setText("Atacado");

        edtPRO_ATACADO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPRO_PRECO3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPRO_PRECO3.setText("Min");

        edtPRO_MIN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPRO_PRECO4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPRO_PRECO4.setText("Max");

        edtPRO_MAX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPRO_PRECO5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPRO_PRECO5.setText("Embalagem");

        edtPRO_EMBALAGEM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPRO_PRECO6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPRO_PRECO6.setText("Peso");

        edtPRO_PESO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPRO_PRECO8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPRO_PRECO8.setText("Observações");

        jScrollPane3.setViewportView(edtPRO_OBS);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUSU_NOME)
                            .addComponent(lblUSU_ID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(edtPRO_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblUSU_LOGIN)
                                .addGap(18, 18, 18)
                                .addComponent(edtPRO_ESTOQUE, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(edtPRO_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblUSU_LOGIN1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkPRO_ATIVO)
                            .addComponent(edtPRO_UNIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(85, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPRO_PRECO6)
                                .addGap(18, 18, 18)
                                .addComponent(edtPRO_PESO, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPRO_PRECO8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPRO_PRECO3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(edtPRO_MIN, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPRO_PRECO)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edtPRO_PRECO, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPRO_PRECO1)
                                    .addComponent(lblPRO_PRECO4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(edtPRO_CUSTO, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblPRO_PRECO2)
                                        .addGap(18, 18, 18)
                                        .addComponent(edtPRO_ATACADO, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(edtPRO_MAX, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblPRO_PRECO5)
                                        .addGap(18, 18, 18)
                                        .addComponent(edtPRO_EMBALAGEM, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtPRO_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSU_ID)
                    .addComponent(chkPRO_ATIVO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUSU_NOME)
                    .addComponent(edtPRO_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSU_LOGIN)
                    .addComponent(edtPRO_ESTOQUE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSU_LOGIN1)
                    .addComponent(edtPRO_UNIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPRO_PRECO)
                    .addComponent(edtPRO_PRECO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPRO_PRECO1)
                    .addComponent(edtPRO_CUSTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPRO_PRECO2)
                    .addComponent(edtPRO_ATACADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPRO_PRECO3)
                    .addComponent(edtPRO_MIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPRO_PRECO4)
                    .addComponent(edtPRO_MAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPRO_PRECO5)
                    .addComponent(edtPRO_EMBALAGEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPRO_PRECO6)
                            .addComponent(edtPRO_PESO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPRO_PRECO8))
                        .addGap(0, 125, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Dados do Usuário", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 110, 710, 340);

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

        jScrollPane2.setViewportView(tblConsulta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Consulta", jPanel2);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(10, 470, 720, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPRIMEIROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRIMEIROActionPerformed
        if (arrayProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Usuários Cadastrados !");
        } else {
            int selecionado = 0;
            tblConsulta.changeSelection(selecionado, 0, false, false);
        }
    }//GEN-LAST:event_btnPRIMEIROActionPerformed

    private void btnINCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINCLUIRActionPerformed
        limpar();
        setOperacao("incluir");
        
    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        String mensagem;
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação deste Produto ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            ProdutoModel produto = new ProdutoModel();
            produto.setPRO_CODIGO(Integer.parseInt(edtPRO_CODIGO.getText()));
            produto.setPRO_NOME(edtPRO_NOME.getText());
            produto.setPRO_ESTOQUE(Double.parseDouble(edtPRO_ESTOQUE.getText()));
            produto.setPRO_UNIDADE(edtPRO_UNIDADE.getText());
            produto.setPRO_PRECO(Double.parseDouble(edtPRO_PRECO.getText()));
            produto.setPRO_CUSTO(Double.parseDouble(edtPRO_CUSTO.getText()));
            produto.setPRO_ATACADO(Double.parseDouble(edtPRO_ATACADO.getText()));
            produto.setPRO_MIN(Double.parseDouble(edtPRO_MIN.getText()));
            produto.setPRO_MAX(Double.parseDouble(edtPRO_MAX.getText()));
            produto.setPRO_EMBALAGEM(Double.parseDouble(edtPRO_EMBALAGEM.getText()));
            produto.setPRO_PESO(Double.parseDouble(edtPRO_PESO.getText()));
            produto.setPRO_OBS(edtPRO_OBS.getText());
            produto.setPRO_ATIVO((chkPRO_ATIVO.isSelected() ? 'S' : 'N'));           

            try {
                produtoController.gravar(produto, getOperacao());
                mensagem = "Dados Gravados com Sucesso";
            } catch (Exception ex) {
                mensagem = "Erro na Gravação do Usuário \n" + ex.getMessage();
            }
            JOptionPane.showMessageDialog(null, mensagem);
            consultar();
        }
    }//GEN-LAST:event_btnGRAVARActionPerformed

    private void btnALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARActionPerformed
        setOperacao("alterar");
    }//GEN-LAST:event_btnALTERARActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAIRActionPerformed
        dispose();
    }//GEN-LAST:event_btnSAIRActionPerformed

    private void btnANTERIORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnANTERIORActionPerformed
        int selecionado = tblConsulta.getSelectedRow() - 1;
        if (selecionado >= 0) {
            tblConsulta.changeSelection(selecionado, 0, false, false);
        }
    }//GEN-LAST:event_btnANTERIORActionPerformed

    private void limpar() {
        edtPRO_CODIGO.setText("0");
        edtPRO_NOME.setText("");
        edtPRO_UNIDADE.setText("");       
        edtPRO_PRECO.setText(""); 
        edtPRO_CUSTO.setText(""); 
        edtPRO_ATACADO.setText(""); 
        edtPRO_MIN.setText(""); 
        edtPRO_MAX.setText(""); 
        edtPRO_EMBALAGEM.setText(""); 
        edtPRO_PESO.setText(""); 
        edtPRO_OBS.setText("");         
        chkPRO_ATIVO.setSelected(false);
        
    }

    private void mostrar(ProdutoModel produto) {
        edtPRO_CODIGO.setText(String.valueOf(produto.getPRO_CODIGO()));
        edtPRO_NOME.setText(produto.getPRO_NOME());
        edtPRO_ESTOQUE.setText(produto.getPRO_ESTOQUE().toString());       
        edtPRO_UNIDADE.setText(produto.getPRO_UNIDADE().toString());       
        edtPRO_PRECO.setText(produto.getPRO_PRECO().toString()); 
        edtPRO_CUSTO.setText(produto.getPRO_CUSTO().toString()); 
        edtPRO_ATACADO.setText(produto.getPRO_ATACADO().toString()); 
        edtPRO_MIN.setText(produto.getPRO_MIN().toString()); 
        edtPRO_MAX.setText(produto.getPRO_MAX().toString()); 
        edtPRO_EMBALAGEM.setText(produto.getPRO_EMBALAGEM().toString()); 
        edtPRO_PESO.setText(produto.getPRO_PESO().toString()); 
        edtPRO_OBS.setText(produto.getPRO_OBS().toString());         
        chkPRO_ATIVO.setSelected((produto.getPRO_ATIVO() == 'S'));
    }

    private String filtrar() {
        String condicao = "";
        if (!edtCONS_ID1.getText().trim().equals("")) {
            condicao += "(PRO_CODIGO >= " + edtCONS_ID1.getText() + ")";
        }
        if (!edtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(PRO_CODIGO <= " + edtCONS_ID2.getText() + ")";
        }
        if (!edtCONS_NOME.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(PRO_NOME LIKE ('%" + edtCONS_NOME.getText() + "%'))";
        }
        
        if (!condicao.trim().equals("")) {
            condicao = " WHERE " + condicao;
        }
        return condicao;
    }

    private void consultar() {
        String condicao = filtrar();
        arrayProduto = null;
        arrayProduto = produtoController.consultar(condicao);
        if (arrayProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Produtos Cadastrados !");
        } else {
            mtb = new ProdutoTableModel(arrayProduto);
            tblConsulta.setModel(mtb);
            tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tblConsulta.changeSelection(0, 0, false, false);
            mostrar();
        }
    }

    private void mostrar() {
        int selecionado = tblConsulta.getSelectedRow();
        if (selecionado >= 0) {
            mostrar(arrayProduto.get(selecionado));
        }
    }
    private void btnPROXIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPROXIMOActionPerformed
        int selecionado = tblConsulta.getSelectedRow() + 1;
        if (selecionado < arrayProduto.size()) {
            tblConsulta.changeSelection(selecionado, 0, false, false);
        }
    }//GEN-LAST:event_btnPROXIMOActionPerformed

    private void btnULTIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnULTIMOActionPerformed
        int selecionado = arrayProduto.size() - 1;
        tblConsulta.changeSelection(selecionado, 0, false, false);
    }//GEN-LAST:event_btnULTIMOActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        String mensagem;
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão deste Produto ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            ProdutoModel produto = new ProdutoModel();
            produto.setPRO_CODIGO(Integer.parseInt(edtPRO_CODIGO.getText()));
            produto.setPRO_NOME(edtPRO_NOME.getText());
            produto.setPRO_ESTOQUE(Double.parseDouble(edtPRO_ESTOQUE.getText()));
            produto.setPRO_UNIDADE(edtPRO_UNIDADE.getText());
            produto.setPRO_PRECO(Double.parseDouble(edtPRO_PRECO.getText()));
            produto.setPRO_CUSTO(Double.parseDouble(edtPRO_CUSTO.getText()));
            produto.setPRO_ATACADO(Double.parseDouble(edtPRO_ATACADO.getText()));
            produto.setPRO_MIN(Double.parseDouble(edtPRO_MIN.getText()));
            produto.setPRO_MAX(Double.parseDouble(edtPRO_MAX.getText()));
            produto.setPRO_EMBALAGEM(Double.parseDouble(edtPRO_EMBALAGEM.getText()));
            produto.setPRO_PESO(Double.parseDouble(edtPRO_PESO.getText()));
            produto.setPRO_OBS(edtPRO_OBS.getText());
            produto.setPRO_ATIVO((chkPRO_ATIVO.isSelected() ? 'S' : 'N'));

            try {
                produtoController.excluir(produto);
                mensagem = "Produto Excluído com Sucesso";
            } catch (Exception ex) {
                mensagem = "Erro na Exclusão do Usuário \n" + ex.getMessage();
            }
            JOptionPane.showMessageDialog(null, mensagem);
            consultar();
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void edtPRO_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPRO_NOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPRO_NOMEActionPerformed

    private void btnIMPRIMIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMPRIMIRActionPerformed
        Exception retorno = produtoController.imprimir();
        if (retorno != null) {
            JOptionPane.showMessageDialog(null, "Erro no Relatório de Produtos /n" + retorno.getMessage());
        }
    }//GEN-LAST:event_btnIMPRIMIRActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALTERAR;
    private javax.swing.JButton btnANTERIOR;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEXCLUIR;
    private javax.swing.JButton btnGRAVAR;
    private javax.swing.JButton btnIMPRIMIR;
    private javax.swing.JButton btnINCLUIR;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPRIMEIRO;
    private javax.swing.JButton btnPROXIMO;
    private javax.swing.JButton btnSAIR;
    private javax.swing.JButton btnULTIMO;
    private javax.swing.JCheckBox chkPRO_ATIVO;
    private javax.swing.JTextField edtCONS_ID1;
    private javax.swing.JTextField edtCONS_ID2;
    private javax.swing.JTextField edtCONS_NOME;
    private javax.swing.JTextField edtPRO_ATACADO;
    private javax.swing.JTextField edtPRO_CODIGO;
    private javax.swing.JTextField edtPRO_CUSTO;
    private javax.swing.JTextField edtPRO_EMBALAGEM;
    private javax.swing.JTextField edtPRO_ESTOQUE;
    private javax.swing.JTextField edtPRO_MAX;
    private javax.swing.JTextField edtPRO_MIN;
    private javax.swing.JTextField edtPRO_NOME;
    private javax.swing.JTextPane edtPRO_OBS;
    private javax.swing.JTextField edtPRO_PESO;
    private javax.swing.JTextField edtPRO_PRECO;
    private javax.swing.JTextField edtPRO_UNIDADE;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblCONS_ID;
    private javax.swing.JLabel lblCONS_NOME;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblPRO_PRECO;
    private javax.swing.JLabel lblPRO_PRECO1;
    private javax.swing.JLabel lblPRO_PRECO2;
    private javax.swing.JLabel lblPRO_PRECO3;
    private javax.swing.JLabel lblPRO_PRECO4;
    private javax.swing.JLabel lblPRO_PRECO5;
    private javax.swing.JLabel lblPRO_PRECO6;
    private javax.swing.JLabel lblPRO_PRECO8;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUSU_ID;
    private javax.swing.JLabel lblUSU_LOGIN;
    private javax.swing.JLabel lblUSU_LOGIN1;
    private javax.swing.JLabel lblUSU_NOME;
    private javax.swing.JTable tblConsulta;
    // End of variables declaration//GEN-END:variables
}
