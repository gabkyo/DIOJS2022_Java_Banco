package com.diojs.banco;


public class Conta implements IConta,Comparable<Conta> {
    protected int numero;
    protected int agencia;
    protected Cliente dono;
    protected double saldo;


    public Conta(Cliente dono, int numero, int agencia, double saldo){
        this.dono = dono;
        this.numero = numero;
        this.agencia = agencia;

    }

    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor){
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, IConta destino){
        this.sacar(valor);
        destino.depositar(valor);
    }

    @Override
    public void extrato() {
        System.out.println( String.format(
             "A conta %d da agência %d do cliente %s tem saldo %.2f"   
            , this.numero, this.agencia, this.dono.getNome(), this.saldo
            ));
    }

    @Override
    public int compareTo(Conta o) {
        if(this.agencia != o.agencia){
            return Integer.compare(this.agencia, o.agencia);
        }else{
            return Integer.compare(this.numero, o.numero);
        }
    }

    @Override
    public boolean equals(Object o){
        if(o.getClass() != this.getClass()){
            return false;
        }else{
            Conta p = (Conta) o;
            return (this.compareTo(p) == 0);
        }
    }

	
    

}
