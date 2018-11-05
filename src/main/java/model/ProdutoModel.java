package model;
import static com.oracle.util.Checksums.update;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PRODUTO")
public class ProdutoModel {
    private int PRO_CODIGO;
    private String PRO_NOME;
    private Double PRO_ESTOQUE;
    private String PRO_UNIDADE;
    private Double PRO_PRECO;
    private Double PRO_CUSTO;
    private Double PRO_ATACADO;
    private Double PRO_MIN;
    private Double PRO_MAX;
    private Double PRO_EMBALAGEM;
    private Double PRO_PESO;
    private String PRO_CADASTRO = new SimpleDateFormat("dd/MM/yyyy")
                                    .format(System.currentTimeMillis());;
    private String PRO_OBS;
    private char PRO_ATIVO;

    public ProdutoModel() {
    }

    @Id
    @Column(name = "PRO_CODIGO", unique = true, nullable = false, precision = 38, scale = 0)
    @SequenceGenerator(name = "SEQ_PRODUTO", sequenceName = "SEQ_PRODUTO", allocationSize = 0)
    @GeneratedValue(generator = "SEQ_PRODUTO", strategy = GenerationType.SEQUENCE)
    public int getPRO_CODIGO() {
        return PRO_CODIGO;
    }

    public void setPRO_CODIGO(int PRO_CODIGO) {
        this.PRO_CODIGO = PRO_CODIGO;
    }
    
    @Column(name = "PRO_NOME", length = 80)
    public String getPRO_NOME() {
        return PRO_NOME;
    }

    public void setPRO_NOME(String PRO_NOME) {
        this.PRO_NOME = PRO_NOME;
    }

    @Column(name = "PRO_ESTOQUE", precision = 18, scale = 2)
    public Double getPRO_ESTOQUE() {
        return PRO_ESTOQUE;
    }

    public void setPRO_ESTOQUE(Double PRO_ESTOQUE) {
        this.PRO_ESTOQUE = PRO_ESTOQUE;
    }

    @Column(name = "PRO_UNIDADE", length = 5, insertable = true, updatable = true)
    public String getPRO_UNIDADE() {
        return PRO_UNIDADE;
    }

    public void setPRO_UNIDADE(String PRO_UNIDADE) {
        this.PRO_UNIDADE = PRO_UNIDADE;
    }

    @Column(name = "PRO_PRECO", precision = 18, scale = 2)
    public Double getPRO_PRECO() {
        return PRO_PRECO;
    }

    public void setPRO_PRECO(Double PRO_PRECO) {
        this.PRO_PRECO = PRO_PRECO;
    }

    @Column(name = "PRO_CUSTO", precision = 18, scale = 2)
    public Double getPRO_CUSTO() {
        return PRO_CUSTO;
    }

    public void setPRO_CUSTO(Double PRO_CUSTO) {
        this.PRO_CUSTO = PRO_CUSTO;
    }

    @Column(name = "PRO_ATACADO", precision = 18, scale = 2)
    public Double getPRO_ATACADO() {
        return PRO_ATACADO;
    }

    public void setPRO_ATACADO(Double PRO_ATACADO) {
        this.PRO_ATACADO = PRO_ATACADO;
    }

    @Column(name = "PRO_MIN", precision = 18, scale = 4)
    public Double getPRO_MIN() {
        return PRO_MIN;
    }

    public void setPRO_MIN(Double PRO_MIN) {
        this.PRO_MIN = PRO_MIN;
    }

    @Column(name = "PRO_MAX", precision = 18, scale = 4)
    public Double getPRO_MAX() {
        return PRO_MAX;
    }

    public void setPRO_MAX(Double PRO_MAX) {
        this.PRO_MAX = PRO_MAX;
    }

    @Column(name = "PRO_EMBALAGEM", precision = 9, scale = 0)
    public Double getPRO_EMBALAGEM() {
        return PRO_EMBALAGEM;
    }

    public void setPRO_EMBALAGEM(Double PRO_EMBALAGEM) {
        this.PRO_EMBALAGEM = PRO_EMBALAGEM;
    }

    @Column(name = "PRO_PESO", precision = 18, scale = 4)
    public Double getPRO_PESO() {
        return PRO_PESO;
    }

    public void setPRO_PESO(Double PRO_PESO) {
        this.PRO_PESO = PRO_PESO;
    }

    //@Temporal(TemporalType.DATE)
    @Column(name = "PRO_CADASTRO", nullable = false, length = 7)
    public String getPRO_CADASTRO() {
        return PRO_CADASTRO;
    }

    public void setPRO_CADASTRO(String PRO_CADASTRO) {
        this.PRO_CADASTRO = PRO_CADASTRO;
    }

    @Column(name = "PRO_OBS")
    public String getPRO_OBS() {
        return PRO_OBS;
    }

    public void setPRO_OBS(String PRO_OBS) {
        this.PRO_OBS = PRO_OBS;
    }

    @Column(name = "PRO_ATIVO", length = 1)
    public char getPRO_ATIVO() {
        return PRO_ATIVO;
    }

    public void setPRO_ATIVO(char PRO_ATIVO) {
        this.PRO_ATIVO = PRO_ATIVO;
    }

    @Override
    public String toString() {
        return PRO_NOME;
    }
    
    


}