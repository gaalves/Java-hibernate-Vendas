package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CLIENTE")
public class ClienteModel implements java.io.Serializable {

    
    private int CLI_CODIGO;
    private Double CLI_LIMITECRED;
    private PessoaModel pessoamodel;
    
    @Id
    @Column(name = "CLI_CODIGO", unique = true, insertable = false, nullable = false, precision = 38, scale = 0)
    @SequenceGenerator(name = "SEQ_CLIENTE", sequenceName = "SEQ_CLIENTE", allocationSize = 0)
    @GeneratedValue(generator = "SEQ_CLIENTE", strategy = GenerationType.SEQUENCE)
    
    public int getCLI_CODIGO() {
        return CLI_CODIGO;
    }

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_CODIGO", nullable = false)
    public PessoaModel getPessoamodel() {
        return pessoamodel;
    }

    public void setPessoamodel(PessoaModel pessoamodel) {
        this.pessoamodel = pessoamodel;
    }
    
    public void setCLI_CODIGO(int CLI_CODIGO) {
        this.CLI_CODIGO = CLI_CODIGO;
    }
    
   
    
    @Column(name = "CLI_LIMITECRED", unique = true, nullable = false, precision = 38, scale = 0)
    public Double getCLI_LIMITECRED() {
        return CLI_LIMITECRED;
    }

    public void setCLI_LIMITECRED(Double CLI_LIMITECRED) {
        this.CLI_LIMITECRED = CLI_LIMITECRED;
    }

    @Override
    public String toString() {
        return this.pessoamodel.getPES_NOME();
    }
    
    
    
    
  
}
