package net.springbootbackendcomplex.springbootbackendcomplex.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Pessoa {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String sobrenome;
    @Column(nullable = false)
    private Integer idade;
    @Column(nullable = false)
    private String sexo;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private List<Contato> contato;
    //private Contato contato;
    @Column(nullable = false)
    private List<Endereco> endereco;
    //private Endereco endereco;
    public Pessoa(){
    }

    //public Pessoa(String nome, String sobrenome, int idade, String sexo, String cpf, String tipo, String valor, String cep, String rua, int numero, String uf, String pais){
    public Pessoa(String nome, String sobrenome, int idade, String sexo, String cpf, List<Endereco> endereco, List<Contato>contato){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.contato = contato;
        this.endereco = endereco;
        //this.contato = new contato(tipo, valor);
        //this.endereco = new endereco(cep, rua, numero, uf, pais);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    //public List<Contato> getContato() {
        //return contato;
    //}
    //public void setContato(List<Contato> contato) {
        //this.contato = contato;
    //}
    //public List<Endereco> getEndereco() {
        //return endereco;
    //}
    //public void setEndereco(List<Endereco> endereco) {
        //this.endereco = endereco;
    //}
}
