package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "FORNECEDOR")
public class FornecedorModel {
    private int FOR_CODIGO;
    private PessoaModel pessoamodel;
    private String FOR_CONTATO;

    public FornecedorModel() {
    }

    @Id
    @Column(name = "FOR_CODIGO", unique = true, insertable = false, nullable = false, precision = 38, scale = 0)
    @SequenceGenerator(name = "SEQ_FORNECEDOR", sequenceName = "SEQ_FORNECEDOR", allocationSize = 0)
    @GeneratedValue(generator = "SEQ_FORNECEDOR", strategy = GenerationType.SEQUENCE)
    public int getFOR_CODIGO() {
        return FOR_CODIGO;
    }

    public void setFOR_CODIGO(int FOR_CODIGO) {
        this.FOR_CODIGO = FOR_CODIGO;
    }

     @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "PES_CODIGO", nullable = false)
    public PessoaModel getPessoamodel() {
        return pessoamodel;
    }

    public void setPessoamodel(PessoaModel pessoamodel) {
        this.pessoamodel = pessoamodel;
    }

    @Column(name = "FOR_CONTATO", length = 80)
    public String getFOR_CONTATO() {
        return FOR_CONTATO;
    }

    public void setFOR_CONTATO(String FOR_CONTATO) {
        this.FOR_CONTATO = FOR_CONTATO;
    }

 

    
}
