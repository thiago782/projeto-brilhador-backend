package br.edu.up.financial.lancamentos_contabeis.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LANCAMENTOS")
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false,unique = true,updatable = false)
    private long id;
    @Column(name = "ID_CAB_LANCAMENTOS", nullable = false,unique = true,updatable = false)
    private long id_Cab_Lancamentos;
    @Column(name = "ID_CONTA_CONTABIL", nullable = false,updatable = false)
    private long idContaContabil;
    @Column(name = "NOME_CONTA_CONTABIL", nullable = false,updatable = false)
    private String nomeContaContabil;
    @Column(name = "VALOR_CREDITO")
    private double valorCredito;
    @Column(name = "VALOR_DEBITO")
    private double valorDebito;




    public long getIdContaContabil() {
        return idContaContabil;
    }
    public double getValorDebito() {
        return valorDebito;
    }
    public void setValorDebito(double valorDebito) {
        this.valorDebito = valorDebito;
    }
    public double getValorCredito() {
        return valorCredito;
    }
    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }
    public String getNomeContaContabil() {
        return nomeContaContabil;
    }
    public void setNomeContaContabil(String nomeContaContabil) {
        this.nomeContaContabil = nomeContaContabil;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setIdContaContabil(long idContaContabil) {
        this.idContaContabil = idContaContabil;
    }
    
}
