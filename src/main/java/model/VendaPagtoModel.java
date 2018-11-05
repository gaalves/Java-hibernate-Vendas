package model;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "VENDA_PAGTO")
public class VendaPagtoModel {
    private int VDP_CODIGO;
    private VendaModel vendamodel;
    private FormaPagtoModel formapagtomodel;
    private Double VDP_VALOR;
    

    public VendaPagtoModel() {
    }

    @Id
    @Column(name = "VDP_CODIGO", unique = true, nullable = false, precision = 38, scale = 0)
    @SequenceGenerator(name = "SEQ_VENDA_PAGTO", sequenceName = "SEQ_VENDA_PAGTO", allocationSize = 0)
    @GeneratedValue(generator = "SEQ_VENDA_PAGTO", strategy = GenerationType.SEQUENCE)
    public int getVDP_CODIGO() {
        return VDP_CODIGO;
    }

    public void setVDP_CODIGO(int VDP_CODIGO) {
        this.VDP_CODIGO = VDP_CODIGO;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VDA_CODIGO", nullable = false)
    public VendaModel getVendaModel() {
        return vendamodel;
    }

    public void setVendaModel(VendaModel vendamodel) {
        this.vendamodel = vendamodel;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "VDA_CODIGO", nullable = false)
    public FormaPagtoModel getFormaPagtoModel() {
        return formapagtomodel;
    }

    public void setVendaModel(FormaPagtoModel formapagtomodel) {
        this.formapagtomodel = formapagtomodel;
    }

    @Column(name = "VDP_VALOR", precision = 18, scale = 2)
    public Double getVDP_VALOR() {
        return VDP_VALOR;
    }

    public void setVDP_VALOR(Double VDP_VALOR) {
        this.VDP_VALOR = VDP_VALOR;
    }



    
}
