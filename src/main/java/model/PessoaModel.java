package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PESSOA")
public class PessoaModel implements java.io.Serializable {
    
    
    private int PES_CODIGO;
    private String PES_NOME;
    private String PES_FANTASIA;
    private char PES_FISICA;
    private String PES_CPFCNPJ;
    private String PES_RGIE;
    
    //private Date PES_CADASTRO = new java.sql.Date(System.currentTimeMillis());  
    private String PES_CADASTRO = new SimpleDateFormat("dd/MM/yyyy")
                                    .format(System.currentTimeMillis());  
    private String PES_ENDERECO;
    private String PES_NUMERO;
    private String PES_COMPLEMENTO;
    private String PES_BAIRRO;
    private String PES_CIDADE;
    private String PES_UF;
    private String PES_CEP;
    private String PES_FONE1;
    private String PES_FONE2;
    private String PES_CELULAR;
    private String PES_SITE;
    private String PES_EMAIL;
    private char PES_ATIVO;
    private ClienteModel cliente;
    private FornecedorModel fornecedor;

    
    
    public PessoaModel() {
    }
    
    
    
    @Id
    @Column(name = "PES_CODIGO", unique = true, insertable = false, nullable = false, precision = 38, scale = 0)
    @SequenceGenerator(name = "SEQ_PESSOA", sequenceName = "SEQ_PESSOA", allocationSize = 1)
    @GeneratedValue(generator = "SEQ_PESSOA", strategy = GenerationType.SEQUENCE)
    public int getPES_CODIGO() {
        return PES_CODIGO;
    }
    
    public void setPES_CODIGO(int PES_CODIGO) {
        this.PES_CODIGO = PES_CODIGO;
    }
    
    @Column(name = "PES_NOME", length = 80, nullable = false)
    public String getPES_NOME() {
        return PES_NOME;
    }

    public void setPES_NOME(String PES_NOME) {
        this.PES_NOME = PES_NOME;
    }

    @Column(name = "PES_FANTASIA", length = 80)
    public String getPES_FANTASIA() {
        return PES_FANTASIA;
    }

    public void setPES_FANTASIA(String PES_FANTASIA) {
        this.PES_FANTASIA = PES_FANTASIA;
    }

    @Column(name = "PES_FISICA", length = 1)
    public char getPES_FISICA() {
        return PES_FISICA;
    }

    public void setPES_FISICA(char PES_FISICA) {
        this.PES_FISICA = PES_FISICA;
    }

    @Column(name = "PES_CPFCNPJ", length = 20, nullable = false, unique = true)
    public String getPES_CPFCNPJ() {
        return PES_CPFCNPJ;
    }

    public void setPES_CPFCNPJ(String PES_CPFCNPJ) {
        this.PES_CPFCNPJ = PES_CPFCNPJ;
    }

    @Column(name = "PES_RGIE", length = 20, nullable = false)
    public String getPES_RGIE() {
        return PES_RGIE;
    }

    public void setPES_RGIE(String PES_RGIE) {
        this.PES_RGIE = PES_RGIE;
    }

    //@Temporal(TemporalType.DATE)
    @Column(name = "PES_CADASTRO", nullable = false, length = 20)
    public String getPES_CADASTRO() {
        return PES_CADASTRO;
    }

    public void setPES_CADASTRO(String PES_CADASTRO) {
        this.PES_CADASTRO = PES_CADASTRO;
    }

    @Column(name = "PES_ENDERECO", length = 120, nullable = false)
    public String getPES_ENDERECO() {
        return PES_ENDERECO;
    }

    public void setPES_ENDERECO(String PES_ENDERECO) {
        this.PES_ENDERECO = PES_ENDERECO;
    }

    @Column(name = "PES_NUMERO", length = 10, nullable = false)
    public String getPES_NUMERO() {
        return PES_NUMERO;
    }

    public void setPES_NUMERO(String PES_NUMERO) {
        this.PES_NUMERO = PES_NUMERO;
    }

    @Column(name = "PES_COMPLEMENTO", length = 30)
    public String getPES_COMPLEMENTO() {
        return PES_COMPLEMENTO;
    }

    public void setPES_COMPLEMENTO(String PES_COMPLEMENTO) {
        this.PES_COMPLEMENTO = PES_COMPLEMENTO;
    }

    @Column(name = "PES_BAIRRO", length = 50, nullable = false)
    public String getPES_BAIRRO() {
        return PES_BAIRRO;
    }

    public void setPES_BAIRRO(String PES_BAIRRO) {
        this.PES_BAIRRO = PES_BAIRRO;
    }

    @Column(name = "PES_CIDADE", length = 80, nullable = false)
    public String getPES_CIDADE() {
        return PES_CIDADE;
    }

    public void setPES_CIDADE(String PES_CIDADE) {
        this.PES_CIDADE = PES_CIDADE;
    }

    @Column(name = "PES_UF", length = 2, nullable = false)
    public String getPES_UF() {
        return PES_UF;
    }

    public void setPES_UF(String PES_UF) {
        this.PES_UF = PES_UF;
    }

    @Column(name = "PES_CEP", length = 9, nullable = false)
    public String getPES_CEP() {
        return PES_CEP;
    }

    public void setPES_CEP(String PES_CEP) {
        this.PES_CEP = PES_CEP;
    }

    @Column(name = "PES_FONE1", length = 16)
    public String getPES_FONE1() {
        return PES_FONE1;
    }

    public void setPES_FONE1(String PES_FONE1) {
        this.PES_FONE1 = PES_FONE1;
    }

    @Column(name = "PES_FONE2", length = 16)
    public String getPES_FONE2() {
        return PES_FONE2;
    }

    public void setPES_FONE2(String PES_FONE2) {
        this.PES_FONE2 = PES_FONE2;
    }

    @Column(name = "PES_CELULAR", length = 16)
    public String getPES_CELULAR() {
        return PES_CELULAR;
    }

    public void setPES_CELULAR(String PES_CELULAR) {
        this.PES_CELULAR = PES_CELULAR;
    }

    @Column(name = "PES_SITE", length = 200)
    public String getPES_SITE() {
        return PES_SITE;
    }

    public void setPES_SITE(String PES_SITE) {
        this.PES_SITE = PES_SITE;
    }

    @Column(name = "PES_EMAIL", length = 200)
    public String getPES_EMAIL() {
        return PES_EMAIL;
    }

    public void setPES_EMAIL(String PES_EMAIL) {
        this.PES_EMAIL = PES_EMAIL;
    }

    @Column(name = "PES_ATIVO", length = 1)
    public char getPES_ATIVO() {
        return PES_ATIVO;
    }

    public void setPES_ATIVO(char PES_ATIVO) {
        this.PES_ATIVO = PES_ATIVO;
    }
    
   
    
}
