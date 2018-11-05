package view;

import controller.ClienteController;
import controller.FormaPagtoController;
import controller.ProdutoController;
import controller.UsuarioController;
import controller.VendaController;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.ClienteModel;
import model.FormaPagtoModel;
import model.ProdutoModel;
import model.UsuarioModel;
import model.VendaModel;
import model.VendaProdutoModel;

public class VendaView extends javax.swing.JFrame {

    private String operacao;
    private ArrayList<UsuarioModel> array;
    private UsuarioTableModel mtb;
    private VendaProdutoTableModel vendaProdutotbl;
    private ClienteController clienteController;
    private ClienteModel cliente;
    ArrayList<ClienteModel> arrayCliente;
    ArrayList<UsuarioModel> arrayUsuario;
    ArrayList<FormaPagtoModel> arrayFormaPagto;
    ArrayList<ProdutoModel> arrayProduto;
    ArrayList<VendaProdutoModel> arrayVendaProduto;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {
        Boolean ativar = (operacao.equals("") ? false : true);
        // operacao=""(consulta), operacao="incluir"(inclusão), operacao="alterar"(alteração)
        this.operacao = operacao;
        btnGRAVAR.setEnabled(ativar);
       
    }

    public VendaView() {
        //usuariocontroller = new UsuarioController();
        this.setPreferredSize(new Dimension(750, 650));

        initComponents();
        setOperacao(""); // inicializa o form no modo CONSULTA
        setLocationRelativeTo(null);
        //consultar();
        // adiciona evento para que qdo navegar no JTable, atualize o registro nos JTextField´s
        tblConsulta.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (evt.getValueIsAdjusting()) {
                    return;
                }
                int selecionado = tblConsulta.getSelectedRow();
                if (selecionado >= 0) {
                    mostrar(array.get(selecionado));
                }
            }
        });
        
        carregarCombo();
    }
    
    private void carregarCombo(){
        ClienteModel cliente = new ClienteModel();
        ClienteController clienteController = new ClienteController();
        arrayCliente = clienteController.consultar("");
        comboCliente.addItem(arrayCliente);
        
        UsuarioModel usuario = new UsuarioModel();
        UsuarioController usuarioController = new UsuarioController();
        arrayUsuario = usuarioController.consultar("");
        comboUsuario.addItem(arrayUsuario);
        
        FormaPagtoModel formaPagto = new FormaPagtoModel();
        FormaPagtoController formapagtoController = new FormaPagtoController();
        arrayFormaPagto = formapagtoController.consultar("");
        comboFormaPagto.addItem(arrayFormaPagto);
        
        ProdutoModel produto = new ProdutoModel();
        ProdutoController produtoController = new ProdutoController();
        arrayProduto = produtoController.consultar("");
        comboProduto.addItem(arrayProduto);
          
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
        Desconto = new javax.swing.JLabel();
        edtVDA_CODIGO = new javax.swing.JTextField();
        edtVDA_DESCONTO = new javax.swing.JTextField();
        Cliente = new javax.swing.JLabel();
        Usuário = new javax.swing.JLabel();
        comboCliente = new javax.swing.JComboBox<>();
        comboUsuario = new javax.swing.JComboBox();
        Usuário1 = new javax.swing.JLabel();
        comboFormaPagto = new javax.swing.JComboBox();
        Desconto1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        edtVDA_OBS = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCarrinho = new javax.swing.JTable();
        Usuário2 = new javax.swing.JLabel();
        comboProduto = new javax.swing.JComboBox();
        btnIncluirProduto = new javax.swing.JButton();
        edtVDA_VALOR = new javax.swing.JTextField();
        Desconto2 = new javax.swing.JLabel();
        Usuário3 = new javax.swing.JLabel();
        Desconto3 = new javax.swing.JLabel();
        edtVDA_TOTAL = new javax.swing.JTextField();
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

        Desconto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Desconto.setText("Desconto");

        edtVDA_CODIGO.setEditable(false);
        edtVDA_CODIGO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        edtVDA_DESCONTO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtVDA_DESCONTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtVDA_DESCONTOActionPerformed(evt);
            }
        });

        Cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cliente.setText("Cliente");

        Usuário.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Usuário.setText("Usuário");

        comboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClienteActionPerformed(evt);
            }
        });

        comboUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUsuarioActionPerformed(evt);
            }
        });

        Usuário1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Usuário1.setText("Forma Pagamento");

        comboFormaPagto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFormaPagtoActionPerformed(evt);
            }
        });

        Desconto1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Desconto1.setText("Obs");

        edtVDA_OBS.setColumns(20);
        edtVDA_OBS.setRows(5);
        jScrollPane3.setViewportView(edtVDA_OBS);

        jScrollPane4.setViewportView(tblCarrinho);

        Usuário2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Usuário2.setText("Produtos");

        comboProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProdutoActionPerformed(evt);
            }
        });

        btnIncluirProduto.setText("Incluir Produto");
        btnIncluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirProdutoActionPerformed(evt);
            }
        });

        edtVDA_VALOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtVDA_VALOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtVDA_VALORActionPerformed(evt);
            }
        });

        Desconto2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Desconto2.setText("Valor");

        Usuário3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Usuário3.setText("Lista de Itens");

        Desconto3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Desconto3.setText("Total");

        edtVDA_TOTAL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtVDA_TOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtVDA_TOTALActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Usuário2)
                                .addGap(8, 8, 8))
                            .addComponent(comboProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnIncluirProduto)
                                    .addComponent(Desconto2)
                                    .addComponent(edtVDA_VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Desconto3)
                                    .addComponent(edtVDA_TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Desconto1)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 81, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Usuário3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUSU_ID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edtVDA_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Desconto)
                                .addGap(18, 18, 18)
                                .addComponent(edtVDA_DESCONTO, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Cliente)
                                .addGap(18, 18, 18)
                                .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Usuário)
                                .addGap(18, 18, 18)
                                .addComponent(comboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Usuário1)
                                .addGap(18, 18, 18)
                                .addComponent(comboFormaPagto, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtVDA_CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUSU_ID)
                    .addComponent(Desconto)
                    .addComponent(edtVDA_DESCONTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cliente)
                    .addComponent(comboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuário)
                    .addComponent(comboUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuário1)
                    .addComponent(comboFormaPagto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(Usuário3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Usuário2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnIncluirProduto)
                        .addGap(18, 18, 18)
                        .addComponent(Desconto2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtVDA_VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Desconto3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtVDA_TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Desconto1)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cadastrar Venda", jPanel1);

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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consulta", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 110, 1120, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPRIMEIROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRIMEIROActionPerformed
        if (array.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Usuários Cadastrados !");
        } else {
            int selecionado = 0;
            tblConsulta.changeSelection(selecionado, 0, false, false);
        }
    }//GEN-LAST:event_btnPRIMEIROActionPerformed

    private void btnINCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINCLUIRActionPerformed
        limpar();
        setOperacao("incluir");
        edtVDA_DESCONTO.setFocusable(true);
    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        String mensagem;
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação deste Usuário ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            /*UsuarioModel usuariomodel = new UsuarioModel();
            usuariomodel.setUSU_CODIGO(Integer.parseInt(edtUSU_CODIGO.getText()));
            
            usuariomodel.setUSU_ATIVO((chkUSU_ATIVO.isSelected() ? 1 : 0));*/
            
            ClienteModel clienteCombo =  (ClienteModel) comboCliente.getSelectedItem();
            UsuarioModel usuarioCombo =  (UsuarioModel) comboUsuario.getSelectedItem();
            
            ClienteModel cliente = new ClienteModel();
            UsuarioModel usuario = new UsuarioModel();            
            VendaModel venda = new VendaModel();
            
            venda.setVDA_CODIGO(Integer.parseInt(edtVDA_CODIGO.getText()));
            venda.setVDA_DESCONTO(Double.parseDouble(edtVDA_DESCONTO.getText()));
            venda.setVDA_OBS(edtVDA_OBS.getText());
            
            cliente.setCLI_CODIGO(clienteCombo.getCLI_CODIGO());
            cliente.setCLI_LIMITECRED(clienteCombo.getCLI_LIMITECRED());
            usuario.setUSU_CODIGO(usuarioCombo.getUSU_CODIGO());
            usuario.setUSU_ATIVO(usuarioCombo.getUSU_ATIVO());
            usuario.setUSU_CADASTRO(usuarioCombo.getUSU_CADASTRO());
            usuario.setUSU_LOGIN(usuarioCombo.getUSU_LOGIN());
            usuario.setUSU_NOME(usuario.getUSU_LOGIN());
            usuario.setUSU_SENHA(usuarioCombo.getUSU_SENHA());
            
            
            venda.setClienteModel(cliente);
            venda.setUsuarioModel(usuario);
            
            VendaController vendaController = new VendaController();
            try {
                vendaController.gravar(venda, getOperacao());
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
        /*edtUSU_CODIGO.setText("0");
        edtVDA_DESCONTO.setText("");
        edtUSU_LOGIN.setText("");
        edtUSU_SENHA.setText("");
        chkUSU_ATIVO.setSelected(false);*/
    }

    private void mostrar(UsuarioModel usuario) {
        /*edtUSU_CODIGO.setText(String.valueOf(usuario.getUSU_CODIGO()));
        edtVDA_DESCONTO.setText(usuario.getUSU_NOME());
        edtUSU_LOGIN.setText(usuario.getUSU_LOGIN());
        edtUSU_SENHA.setText(usuario.getUSU_SENHA());
        chkUSU_ATIVO.setSelected((usuario.getUSU_ATIVO() == 1));*/
    }

    private String filtrar() {
        String condicao = "";
        if (!edtCONS_ID1.getText().trim().equals("")) {
            condicao += "(VDA_CODIGO >= " + edtCONS_ID1.getText() + ")";
        }
        if (!edtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(VDA_CODIGO <= " + edtCONS_ID2.getText() + ")";
        }
        if (!edtCONS_NOME.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(CLI_NOME LIKE ('%" + edtCONS_NOME.getText() + "%'))";
        }
        
        if (!condicao.trim().equals("")) {
            condicao = " WHERE " + condicao;
        }
        return condicao;
    }

    private void consultar() {
        String condicao = filtrar();
        array = null;
        //array = usuariocontroller.consultar(condicao);
        if (array.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Usuários Cadastrados !");
        } else {
            mtb = new UsuarioTableModel(array);
            tblConsulta.setModel(mtb);
            tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tblConsulta.changeSelection(0, 0, false, false);
            mostrar();
        }
    }
    
    private void consultarVendaProduto() {
        String condicao = filtrar();
        arrayVendaProduto = null;
        //array = usuariocontroller.consultar(condicao);
        if (array.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Produtos No Carrinho!");
        } else {
            vendaProdutotbl = new VendaProdutoTableModel(arrayVendaProduto);
            tblCarrinho.setModel(mtb);
            tblCarrinho.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tblCarrinho.changeSelection(0, 0, false, false);
            
        }
    }

    private void mostrar() {
        int selecionado = tblConsulta.getSelectedRow();
        if (selecionado >= 0) {
            mostrar(array.get(selecionado));
        }
    }
    private void btnPROXIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPROXIMOActionPerformed
        int selecionado = tblConsulta.getSelectedRow() + 1;
        if (selecionado < array.size()) {
            tblConsulta.changeSelection(selecionado, 0, false, false);
        }
    }//GEN-LAST:event_btnPROXIMOActionPerformed

    private void btnULTIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnULTIMOActionPerformed
        int selecionado = array.size() - 1;
        tblConsulta.changeSelection(selecionado, 0, false, false);
    }//GEN-LAST:event_btnULTIMOActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        edtCONS_ID1.setText("");
        edtCONS_ID2.setText("");
        edtCONS_NOME.setText("");
        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        String mensagem;
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão deste Usuário ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

           /* UsuarioModel usuariomodel = new UsuarioModel();
            usuariomodel.setUSU_CODIGO(Integer.parseInt(edtUSU_CODIGO.getText()));
            usuariomodel.setUSU_NOME(edtVDA_DESCONTO.getText());
            usuariomodel.setUSU_LOGIN(edtUSU_LOGIN.getText());
            usuariomodel.setUSU_SENHA(edtUSU_SENHA.getText());
            usuariomodel.setUSU_ATIVO((chkUSU_ATIVO.isSelected() ? 1 : 0));*/

            try {
                //usuariocontroller.excluir(usuariomodel);
                mensagem = "Usuário Excluído com Sucesso";
            } catch (Exception ex) {
                mensagem = "Erro na Exclusão do Usuário \n" + ex.getMessage();
            }
            JOptionPane.showMessageDialog(null, mensagem);
            consultar();
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void edtVDA_DESCONTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtVDA_DESCONTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtVDA_DESCONTOActionPerformed

    private void btnIMPRIMIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMPRIMIRActionPerformed
        Exception retorno = null;
        //Exception retorno = vendacontroller.imprimir();
        if (retorno != null) {
            JOptionPane.showMessageDialog(null, "Erro no Relatório de Usuários /n" + retorno.getMessage());
        }
    }//GEN-LAST:event_btnIMPRIMIRActionPerformed

    private void comboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClienteActionPerformed

    private void comboUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUsuarioActionPerformed

    private void comboFormaPagtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFormaPagtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFormaPagtoActionPerformed

    private void comboProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProdutoActionPerformed

    private void edtVDA_VALORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtVDA_VALORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtVDA_VALORActionPerformed

    private void edtVDA_TOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtVDA_TOTALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtVDA_TOTALActionPerformed

    private void btnIncluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirProdutoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnIncluirProdutoActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cliente;
    private javax.swing.JLabel Desconto;
    private javax.swing.JLabel Desconto1;
    private javax.swing.JLabel Desconto2;
    private javax.swing.JLabel Desconto3;
    private javax.swing.JLabel Usuário;
    private javax.swing.JLabel Usuário1;
    private javax.swing.JLabel Usuário2;
    private javax.swing.JLabel Usuário3;
    private javax.swing.JButton btnALTERAR;
    private javax.swing.JButton btnANTERIOR;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEXCLUIR;
    private javax.swing.JButton btnGRAVAR;
    private javax.swing.JButton btnIMPRIMIR;
    private javax.swing.JButton btnINCLUIR;
    private javax.swing.JButton btnIncluirProduto;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPRIMEIRO;
    private javax.swing.JButton btnPROXIMO;
    private javax.swing.JButton btnSAIR;
    private javax.swing.JButton btnULTIMO;
    private javax.swing.JComboBox<ArrayList<ClienteModel>> comboCliente;
    private javax.swing.JComboBox comboFormaPagto;
    private javax.swing.JComboBox comboProduto;
    private javax.swing.JComboBox comboUsuario;
    private javax.swing.JTextField edtCONS_ID1;
    private javax.swing.JTextField edtCONS_ID2;
    private javax.swing.JTextField edtCONS_NOME;
    private javax.swing.JTextField edtVDA_CODIGO;
    private javax.swing.JTextField edtVDA_DESCONTO;
    private javax.swing.JTextArea edtVDA_OBS;
    private javax.swing.JTextField edtVDA_TOTAL;
    private javax.swing.JTextField edtVDA_VALOR;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblCONS_ID;
    private javax.swing.JLabel lblCONS_NOME;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUSU_ID;
    private javax.swing.JTable tblCarrinho;
    private javax.swing.JTable tblConsulta;
    // End of variables declaration//GEN-END:variables
}
