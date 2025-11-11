package model;

import java.time.LocalDate;

public class Evento {
    private int id;
    private String nome;
    private String descricao;
    private LocalDate data;
    private String local;
    private int capacidade;
    private int ingressosVendidos;
    private String status;
    
    public Evento() {
        this.ingressosVendidos = 0;
        this.status = "Ativo";
    }
    
    public Evento(int id, String nome, String descricao, LocalDate data, String local, int capacidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.local = local;
        this.capacidade = capacidade;
        this.ingressosVendidos = 0;
        this.status = "Ativo";
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public LocalDate getData() {
        return data;
    }
    
    public void setData(LocalDate data) {
        this.data = data;
    }
    
    public String getLocal() {
        return local;
    }
    
    public void setLocal(String local) {
        this.local = local;
    }
    
    public int getCapacidade() {
        return capacidade;
    }
    
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public int getIngressosVendidos() {
        return ingressosVendidos;
    }
    
    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public boolean venderIngresso(int quantidade) {
        if (ingressosVendidos + quantidade <= capacidade) {
            ingressosVendidos += quantidade;
            return true;
        }
        return false;
    }
    
    public int getIngressosDisponiveis() {
        return capacidade - ingressosVendidos;
    }
    
    public double getPercentualOcupacao() {
        if (capacidade == 0) return 0;
        return (ingressosVendidos * 100.0) / capacidade;
    }
    
    @Override
    public String toString() {
        return nome + " - " + data + " (" + status + ")";
    }
}
