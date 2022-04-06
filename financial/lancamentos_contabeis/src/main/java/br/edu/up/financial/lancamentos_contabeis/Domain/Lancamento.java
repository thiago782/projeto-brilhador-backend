package br.edu.up.financial.lancamentos_contabeis.Domain;

public class Lancamento {

    private long id;
    private long idContaContabil;
    private String nomeContaContabil;
    private double valorCredito;
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
