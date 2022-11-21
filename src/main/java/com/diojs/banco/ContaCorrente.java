package com.diojs.banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente dono, int numero, int agencia, double saldo) {
        super(dono, numero, agencia, saldo);
    }

    @Override
    public void extrato(){
        System.out.println( String.format(
             "A conta corrente %d da agência %d do cliente %s tem saldo %.2f"   
            , this.numero, this.agencia, this.dono.getNome(), this.saldo
            ));
    }

    @Override
    public int compareTo(Conta o) {
        
        if(this.agencia != o.agencia){
            return Integer.compare(this.agencia, o.agencia);
        }else if(this.numero != o.numero){
            return Integer.compare(this.numero, o.numero);
        }else if (!(o instanceof ContaCorrente)){
            return -1;
        }else return 0;
    }

    @Override
    public boolean equals(Object o){
        if(o.getClass() != this.getClass()){
            return false;
        }else{
            ContaCorrente p = (ContaCorrente) o;
            return (this.compareTo(p) == 0);
        }
    }

    
}
