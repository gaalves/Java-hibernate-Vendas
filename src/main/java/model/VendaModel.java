package model;

import java.text.SimpleDateFormat;
import javax.persistence.CascadeType;
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
@Table(name = "VENDA")
public class VendaModel {
    private int VDA_CODIGO;    
    private UsuarioModel usuariomodel;
    private ClienteModel clientemodel;
    private String VDA_DATA = new SimpleDateFormat("dd/MM/yyyy")
                                    .format(System.currentTimeMillis());;
    private Double VDA_VALOR;
    private Double VDA_DESCONTO;
    private Double VDA_TOTAL;
    private String VDA_OBS;
    private char VDA_FINALIZADO;

    
    public VendaModel() {
    }

    @Id
    @Column(name = "VDA_CODIGO", unique = true, nullable = false, precision = 38, scale = 0)
    @SequenceGenerator(name = "SEQ_VENDA", sequenceName = "SEQ_VENDA", allocationSize = 0)
    @GeneratedValue(generator = "SEQ_VENDA", strategy = GenerationType.SEQUENCE)
    public int getVDA_CODIGO() {
        return VDA_CODIGO;
    }

    public void setVDA_CODIGO(int VDA_CODIGO) {
        this.VDA_CODIGO = VDA_CODIGO;
    }


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "USU_CODIGO", nullable = false)
    public UsuarioModel getUsuarioModel() {
        return usuariomodel;
    }

    public void setUsuarioModel(UsuarioModel usuariomodel) {
        this.usuariomodel = usuariomodel;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "CLI_CODIGO", nullable = false)
    public ClienteModel getClienteModel() {
        return clientemodel;
    }

    public void setClienteModel(ClienteModel clientemodel) {
        this.clientemodel = clientemodel;
    }

    //@Temporal(TemporalType.DATE)
    @Column(name = "VDA_DATA", nullable = false, length = 7)
    public String getVDA_DATA() {
        return VDA_DATA;
    }

    public void setVDA_DATA(String VDA_DATA) {
        this.VDA_DATA = VDA_DATA;
    }

    @Column(name = "VDA_VALOR", precision = 18, scale = 4)
    public Double getVDA_VALOR() {
        return VDA_VALOR;
    }

    public void setVDA_VALOR(Double VDA_VALOR) {
        this.VDA_VALOR = VDA_VALOR;
    }

    @Column(name = "VDA_DESCONTO", precision = 18, scale = 4)
    public Double getVDA_DESCONTO() {
        return VDA_DESCONTO;
    }

    public void setVDA_DESCONTO(Double VDA_DESCONTO) {
        this.VDA_DESCONTO = VDA_DESCONTO;
    }

    @Column(name = "VDA_TOTAL", precision = 18, scale = 4)
    public Double getVDA_TOTAL() {
        return VDA_TOTAL;
    }

    public void setVDA_TOTAL(Double VDA_TOTAL) {
        this.VDA_TOTAL = VDA_TOTAL;
    }

    @Column(name = "VDA_OBS")
    public String getVDA_OBS() {
        return VDA_OBS;
    }

    public void setVDA_OBS(String VDA_OBS) {
        this.VDA_OBS = VDA_OBS;
    }

    @Column(name = "VDA_FINALIZADO", length = 1)
    public char getVDA_FINALIZADO() {
        return VDA_FINALIZADO;
    }

    public void setVDA_FINALIZADO(char VDA_FINALIZADO) {
        this.VDA_FINALIZADO = VDA_FINALIZADO;
    }

    

  
}
