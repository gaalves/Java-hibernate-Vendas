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
@Table(name = "FORMAPAGTO")
public class FormaPagtoModel {
    private int FPG_CODIGO;
    private String FPG_NOME;
    private char FPG_ATIVO;

    public FormaPagtoModel() {
    }

    @Id
    @Column(name = "FPG_CODIGO", unique = true, nullable = false, precision = 38, scale = 0)
    @SequenceGenerator(name = "SEQ_FORMAPAGTO", sequenceName = "SEQ_FORMAPAGTO", allocationSize = 0)
    @GeneratedValue(generator = "SEQ_FORMAPAGTO", strategy = GenerationType.SEQUENCE)
    public int getFPG_CODIGO() {
        return FPG_CODIGO;
    }

    public void setFPG_CODIGO(int FPG_CODIGO) {
        this.FPG_CODIGO = FPG_CODIGO;
    }

    @Column(name = "FPG_NOME", length = 80)
    public String getFPG_NOME() {
        return FPG_NOME;
    }

    public void setFPG_NOME(String FPG_NOME) {
        this.FPG_NOME = FPG_NOME;
    }

    @Column(name = "FPG_ATIVO", length = 1)
    public char getFPG_ATIVO() {
        return FPG_ATIVO;
    }

    public void setFPG_ATIVO(char FPG_ATIVO) {
        this.FPG_ATIVO = FPG_ATIVO;
    }

    @Override
    public String toString() {
        return this.FPG_NOME;
    }

  
}
