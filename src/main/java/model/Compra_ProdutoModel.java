package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "COMPRA_PRODUTO")
public class Compra_ProdutoModel implements java.io.Serializable {
    
    private int CPP_CODIGO;
    private CompraModel compramodel;
    private ProdutoModel produtomodel;
    private Double CPR_QTDE;
    private Double CPR_PRECO;
    private Double CPR_DESCONTO;
    private Double CPR_TOTAL;

    @Id
    @Column(name = "CPP_CODIGO", unique = true, nullable = false, precision = 38, scale = 0)
    @SequenceGenerator(name = "SEQ_COMPRA_PRODUTO", sequenceName = "SEQ_COMPRA_PRODUTO", allocationSize = 0)
    @GeneratedValue(generator = "SEQ_COMPRA_PRODUTO", strategy = GenerationType.SEQUENCE)
    public int getCPP_CODIGO() {
        return CPP_CODIGO;
    }

    public void setCPP_CODIGO(int CPP_CODIGO) {
        this.CPP_CODIGO = CPP_CODIGO;
    }
    

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CPR_CODIGO", nullable = false)
    public CompraModel getCompraModel() {
        return compramodel;
    }

    public void setCompraModel(CompraModel compramodel) {
        this.compramodel = compramodel;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRO_CODIGO", nullable = false)
    public ProdutoModel getProdutoModel() {
        return produtomodel;
    }

    public void setProdutoModel(ProdutoModel produtomodel) {
        this.produtomodel = produtomodel;
    }

    @Column(name = "CPR_QTDE", precision = 18, scale = 4)
    public Double getCPR_QTDE() {
        return CPR_QTDE;
    }

    
    public void setCPR_QTDE(Double CPR_QTDE) {
        this.CPR_QTDE = CPR_QTDE;
    }
    
    @Column(name = "CPR_PRECO", precision = 18, scale = 2)
    public Double getCPR_PRECO() {
        return CPR_PRECO;
    }

    public void setCPR_PRECO(Double CPR_PRECO) {
        this.CPR_PRECO = CPR_PRECO;
    }

    @Column(name = "CPR_DESCONTO", precision = 18, scale = 2)
    public Double getCPR_DESCONTO() {
        return CPR_DESCONTO;
    }

    public void setCPR_DESCONTO(Double CPR_DESCONTO) {
        this.CPR_DESCONTO = CPR_DESCONTO;
    }

    @Column(name = "CPR_TOTAL", precision = 18, scale = 2)    
    public Double getCPR_TOTAL() {
        return CPR_TOTAL;
    }

    public void setCPR_TOTAL(Double CPR_TOTAL) {
        this.CPR_TOTAL = CPR_TOTAL;
    }

   
}
