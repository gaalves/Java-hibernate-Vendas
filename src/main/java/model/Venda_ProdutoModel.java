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
@Table(name = "VENDA_PRODUTO")
public class Venda_ProdutoModel {
    
    private int VEP_CODIGO;
    private VendaModel vendamodel;
    private ProdutoModel produtomodel;
    private Double VEP_QTDE;
    private Double VEP_PRECO;
    private Double VEP_DESCONTO;
    private Double VEP_TOTAL;

    @Id
    @Column(name = "VEP_CODIGO", unique = true, nullable = false, precision = 38, scale = 0)
    @SequenceGenerator(name = "SEQ_VENDA_PRODUTO", sequenceName = "SEQ_VENDA_PRODUTO", allocationSize = 0)
    @GeneratedValue(generator = "SEQ_VENDA_PRODUTO", strategy = GenerationType.SEQUENCE)
    public int getVEP_CODIGO() {
        return VEP_CODIGO;
    }

    public void setVEP_CODIGO(int VEP_CODIGO) {
        this.VEP_CODIGO = VEP_CODIGO;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRO_CODIGO", nullable = false)
    public ProdutoModel getProdutoModel() {
        return produtomodel;
    }

    public void setProdutoModel(ProdutoModel produtomodel) {
        this.produtomodel = produtomodel;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VDA_CODIGO", nullable = false)
    public VendaModel getVendaModel() {
        return vendamodel;
    }

    public void setVendaModel(VendaModel vendamodel) {
        this.vendamodel = vendamodel;
    }

    @Column(name = "VEP_QTDE", precision = 18, scale = 4)
    public Double getVEP_QTDE() {
        return VEP_QTDE;
    }

    public void setVEP_QTDE(Double VEP_QTDE) {
        this.VEP_QTDE = VEP_QTDE;
    }

    @Column(name = "VEP_PRECO", precision = 18, scale = 2)
    public Double getVEP_PRECO() {
        return VEP_PRECO;
    }

    public void setVEP_PRECO(Double VEP_PRECO) {
        this.VEP_PRECO = VEP_PRECO;
    }

    @Column(name = "VEP_DESCONTO", precision = 18, scale = 2)
    public Double getVEP_DESCONTO() {
        return VEP_DESCONTO;
    }

    public void setVEP_DESCONTO(Double VEP_DESCONTO) {
        this.VEP_DESCONTO = VEP_DESCONTO;
    }

    @Column(name = "VEP_TOTAL", precision = 18, scale = 2)
    public Double getVEP_TOTAL() {
        return VEP_TOTAL;
    }

    public void setVEP_TOTAL(Double VEP_TOTAL) {
        this.VEP_TOTAL = VEP_TOTAL;
    }
    
    
}
