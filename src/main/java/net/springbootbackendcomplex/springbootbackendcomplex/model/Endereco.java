package net.springbootbackendcomplex.springbootbackendcomplex.model;

public class Endereco {
    private String cep;
    private String rua;
    private Integer numero;
    private String uf;
    private String pais;

    public Endereco(){
    }

    public Endereco(String cep, String rua, int numero, String uf, String pais){
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.uf = uf;
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getRua(String rua) {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
}
