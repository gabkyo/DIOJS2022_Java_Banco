package com.diojs.banco;

public class Cliente implements Comparable<Cliente> {
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public Cliente(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public boolean equals(Object o){
        if(! (o instanceof Cliente)){
            return false;
        }else{
            Cliente p = (Cliente) o;
            return this.nome == p.nome;
        }
    }

    @Override
    public int compareTo(Cliente o) {
        return this.nome.compareTo(o.nome);
    }

}
